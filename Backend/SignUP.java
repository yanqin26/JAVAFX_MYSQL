package Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import JDBC_Utils.DBUtils;

public class SignUP {
	
	private SignUP() {
		
	}
	
	public static boolean signUp(String TEL, String userName, String password) {
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean signUp = false;
		
		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();

			//���绰���룬��������������
			String sql = "insert into t_user(TEL, userName, password) values(" + TEL + ", '" + userName + "', " + password + ")";

			//ִ�����ݿ�����Լ���ȡִ��������
			int count = stmt.executeUpdate(sql);
			
			//������������û��Ķ������ݿ�
			String sql1 = "create database user_TEL_" + TEL;
			System.out.println(sql1);
			
			int count1 = stmt.executeUpdate(sql1);
			
			signUp = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println("����ʧ��");
			return false;
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
		
		return signUp;
		
	}
	
	//����
	public static void main(String args[]) {
		SignUP.signUp("13398182161", "������", "13398182161");
	}

}
