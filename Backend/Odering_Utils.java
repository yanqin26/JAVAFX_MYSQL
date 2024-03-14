package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import Foods.Food;
import JDBC_Utils.DBUtils;

public class Odering_Utils {
	

	private Odering_Utils() {

	}

	public static String odering(String TEL, Food[] food) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int total = 0;
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("YY_MM_dd_HH_mm_ss");
		String listTime = formatter.format(date);
		
		
		try {
			//ע������
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_tel_" + TEL, "root", "13398182161");
			
			stmt = conn.createStatement();
			
			//����һ�ű�
			String sql ="drop table if exists t_" + listTime;
			String sql1 = "create table t_" + listTime + "(foodName varchar(255), foodNumber bigint)";

			int count = stmt.executeUpdate(sql);
						stmt.executeUpdate(sql1);
			
						
			for(int i = 1; i < 33 ; i++) {
				if(food[i].getNumber() != 0) {
					Food orderingFood = food[i];
					String foodName = orderingFood.getName();
					int foodNumber = orderingFood.getNumber();
					
					total += orderingFood.getPrice() * foodNumber;
					String sql2 = "insert into t_" + listTime + "(foodName, foodNumber) values('" + foodName + "', " + foodNumber + ")";
					//System.out.println(sql2);
					stmt.executeUpdate(sql2);
				}
			}
					
			String sql3 = "insert into t_" + listTime + "(foodName, foodNumber) values('�ܺ�', " + total + ")";
			stmt.executeUpdate(sql3);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return "t_" + listTime;
		
		
	}
	
	public static String getTEL(String name) {
		
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				String TEL = "";
				
				//��ȡ����
				String getting_Password = null;
				
				try {
					//��ȡ����
					conn = DBUtils.getConnection();
					
					//��ȡ����Ĳ�������
					stmt = conn.createStatement();

					//��ѯ�û������Ƿ�ƥ��
					String sql = "select TEL from t_user where userName = '" + name + "'";
					
					rs = stmt.executeQuery(sql);
					
					//5.�����ѯ�����
					if(rs.next()) {
						TEL = rs.getString(1);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//���ùرշ���
					DBUtils.close(conn, stmt, rs);
				}
				
				return TEL;
		
		
	}
	
	//����
	public static void main(String args[]) {
		
		Food food1 = new Food("������Ѽ");
		Food food2 = new Food("��֭����צ");
		Food food3 = new Food("ˮ��Ϻ��");
		Food food4 = new Food("ʨ��ͷ");
		Food food5 = new Food("����");
		Food food6 = new Food("ˮ����Ƭ");
		Food food7 = new Food("��ˮ�ײ�");
		Food food8 = new Food("��������");
		Food food9 = new Food("���Ŷ���");
		Food food10 = new Food("��˼����");
		Food food11 = new Food("������˿");
		Food food12 = new Food("������");
		Food food13 = new Food("����");
		Food food14 = new Food("���׷�");
		Food food15 = new Food("������");
		Food food16 = new Food("���ӷ�");
		Food food17 = new Food("ϡ��");
		Food food18 = new Food("�ϲ˵�����");
		Food food19 = new Food("�ײ˶�����");
		Food food20 = new Food("���Ѽ嵰��");
		Food food22 = new Food("̩����������");
		Food food21 = new Food("ѼѪ��˿��");
		Food food23 = new Food("ơ��");
		Food food24 = new Food("����");
		Food food25 = new Food("���");
		Food food26 = new Food("�׿�ˮ");
		Food food27 = new Food("Ѽʺ�����ʲ�");
		Food food29 = new Food("ը�츾��");
		Food food30 = new Food("��˾");
		Food food28 = new Food("��ଵ�����");
		Food food31 = new Food("������Ѭ����˹��ţ��");
		Food food32 = new Food("������ǲ���˹����");
		
		Food[] food = new Food[33];
		
		food[1] = food1;
		food[2] = food2;
		food[3] = food3;
		food[4] = food4;
		food[5] = food5;
		food[6] = food6;
		food[7] = food7;
		food[8] = food8;
		food[9] = food9;
		food[10] = food10;
		food[11] = food11;
		food[12] = food12;
		food[13] = food13;
		food[14] = food14;
		food[15] = food15;
		food[16] = food16;
		food[17] = food17;
		food[18] = food18;
		food[19] = food19;
		food[20] = food20;
		food[21] = food21;
		food[22] = food22;
		food[23] = food23;
		food[24] = food24;
		food[25] = food25;
		food[26] = food26;
		food[27] = food27;
		food[28] = food28;
		food[29] = food29;
		food[30] = food30;
		food[31] = food31;
		food[32] = food32;
		
		
		food1.setPrice(10);
		food2.setPrice(25);
		food3.setPrice(5);
	    food5.setPrice(15);
	    food7.setPrice(10);
	    food9.setPrice(15);
	    food14.setPrice(10);
	    food17.setPrice(5);
		food18.setPrice(5);
	    
		food1.add();
		food1.add();
		food1.add();
		
		food2.add();
		
		food3.add();
		food3.add();
		food3.subtract();
		
		food18.add();
		food18.add();


		
		String orderlist = Odering_Utils.odering("13398182161", food);
		System.out.println(orderlist);
		
	}

}
