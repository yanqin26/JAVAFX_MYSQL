package Foods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBC_Utils.DBUtils;

public class Food {
	//ʳƷʣ������
	int remainderBefore = 0;
	//ִ�к��ʳƷ����
	int remainderNow = 0;
	//ִ�����ӷ����Ĵ���
	//ִ���Ƴ������Ĵ��������Գ���������ӷ���ִ�д���������
	int addNumber = 0;
	//ִ���Ƴ������Ĵ���
	int subtractNumber = 0;
	//ʳƷ����
	String foodName = null;
	//ʳƷ�۸�
	int foodPrice = 0;
	
	public Food(){
		
	}
	
	public Food(String foodName) {
		this.foodName = foodName;
		
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();
			
			//��ѯsql��䣬��ѯ�ڲ���ǰ��ʣ��������
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//��ȡ��ѯ�����
			rs = stmt.executeQuery(sql1);
			
			//�����ѯ�������ȡ��ʳƷʣ����
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
	}
	
	
	public void add() {
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();
			
			//��ѯsql��䣬��ѯ�ڲ���ǰ��ʣ��������
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//��ȡ��ѯ�����
			rs = stmt.executeQuery(sql1);
			
			//�����ѯ�������ȡ��ʳƷʣ����
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
			//System.out.println("remainderBefore = " + remainderBefore);
			
			if(remainderBefore > 0) {
			//����ʳƷ��ʣ������һ
			String sql2 = "update t_foodstock set remainder = " + (remainderBefore - 1) + " where foodName = '"+ foodName +"'";
			
			//ִ�����ݿ�����Լ���ȡִ��������
			int count = stmt.executeUpdate(sql2);
			//System.out.println(count);
			
			//��ȡĿǰ��ʳƷʣ����
			remainderNow = remainderBefore - 1;
			//System.out.println("remainderNow = " + remainderNow);
			//System.out.println(getName() + "��ͳɹ�");
			addNumber++;
			}else {
				//System.out.println(getName() + "���ʧ��");
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
	}
	
	public void subtract() {
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		if(subtractNumber < addNumber && addNumber != 0) {
		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();
			
			//��ѯsql��䣬��ѯ�ڲ���ǰ��ʣ��������
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//��ȡ��ѯ�����
			rs = stmt.executeQuery(sql1);
			
			//�����ѯ�������ȡ��ʳƷʣ����
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
			//System.out.println("remainderBefore = " + remainderBefore);
			
			
			
			
			//����ʳƷ��ʣ������һ
			String sql2 = "update t_foodstock set remainder = " + (remainderBefore + 1) + " where foodName = '"+ foodName +"'";
			
			//ִ�����ݿ�����Լ���ȡִ��������
			int count = stmt.executeUpdate(sql2);
			//System.out.println(count);
			
			//��ȡĿǰ��ʳƷʣ����
			remainderNow = remainderBefore + 1;
			//System.out.println("remainderNow = " + remainderNow);
			subtractNumber++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
		}
		else {
			//System.out.println("addNumber������");
			return;
		}	
	}
	
	public int now() {
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();
			
			//��ѯsql��䣬��ѯ�ڲ���ǰ��ʣ��������
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//��ȡ��ѯ�����
			rs = stmt.executeQuery(sql1);
			
			//�����ѯ�������ȡ��ʳƷʣ����
			while(rs.next()) {
				remainderNow = rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
		return remainderNow;
	}
	
	public int getNumber() {
		return this.addNumber - this.subtractNumber;
	}
	
	public String getName() {
		return foodName;
	}
	
	public void setPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	public int getPrice() {
		return this.foodPrice;
	}
	
	public int getBeforeNumber() {
		return this.remainderBefore;
	}
	
	public int getNowNumber() {
		return this.remainderNow;
	}
	
	public void setNowNumber() {
		//ִ�����ӷ����Ĵ���
		this.addNumber = 0;
		//ִ���Ƴ������Ĵ���
		this.subtractNumber = 0;
	}
	
	
	//����
//	public static void main(String args[]) {
//		Food food23 = new Food("ơ��");
//		food23.add();
//		food23.add();
//		food23.add();
//		System.out.println(food23.addNumber);
//		food23.subtract();
//		
//		
//		
//		System.out.println(food23.subtractNumber);
//		System.out.println(food23.getNumber());
//
//
//	}
	
}
