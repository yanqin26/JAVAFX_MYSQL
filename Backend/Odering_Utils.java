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
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_tel_" + TEL, "root", "13398182161");
			
			stmt = conn.createStatement();
			
			//创建一张表
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
					
			String sql3 = "insert into t_" + listTime + "(foodName, foodNumber) values('总和', " + total + ")";
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
		
		//获取连接对象，数据库操作对象，查询结果集
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				String TEL = "";
				
				//获取密码
				String getting_Password = null;
				
				try {
					//获取连接
					conn = DBUtils.getConnection();
					
					//获取编译的操作对象
					stmt = conn.createStatement();

					//查询用户密码是否匹配
					String sql = "select TEL from t_user where userName = '" + name + "'";
					
					rs = stmt.executeQuery(sql);
					
					//5.处理查询结果集
					if(rs.next()) {
						TEL = rs.getString(1);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//调用关闭方法
					DBUtils.close(conn, stmt, rs);
				}
				
				return TEL;
		
		
	}
	
	//测试
	public static void main(String args[]) {
		
		Food food1 = new Food("北京烤鸭");
		Food food2 = new Food("豉汁蒸凤爪");
		Food food3 = new Food("水晶虾饺");
		Food food4 = new Food("狮子头");
		Food food5 = new Food("烧腊");
		Food food6 = new Food("水煮肉片");
		Food food7 = new Food("开水白菜");
		Food food8 = new Food("宫保鸡丁");
		Food food9 = new Food("麻婆豆腐");
		Food food10 = new Food("文思豆腐");
		Food food11 = new Food("鱼香肉丝");
		Food food12 = new Food("东坡肉");
		Food food13 = new Food("拉面");
		Food food14 = new Food("白米饭");
		Food food15 = new Food("蛋炒饭");
		Food food16 = new Food("炒河粉");
		Food food17 = new Food("稀饭");
		Food food18 = new Food("紫菜蛋花汤");
		Food food19 = new Food("白菜豆腐汤");
		Food food20 = new Food("番茄煎蛋汤");
		Food food22 = new Food("泰国冬阴功汤");
		Food food21 = new Food("鸭血粉丝汤");
		Food food23 = new Food("啤酒");
		Food food24 = new Food("可乐");
		Food food25 = new Food("红茶");
		Food food26 = new Food("白开水");
		Food food27 = new Food("鸭屎香柠檬茶");
		Food food29 = new Food("炸天妇罗");
		Food food30 = new Food("寿司");
		Food food28 = new Food("咖喱蛋包饭");
		Food food31 = new Food("德州烟熏安格斯厚牛堡");
		Food food32 = new Food("意大利那不勒斯披萨");
		
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
