package Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import JDBC_Utils.DBUtils;

public class Login {
	
	static boolean login = false;
	
	private Login() {
		
	}
	
	public static boolean login(String userName, String password){
		
		//��ȡ���Ӷ������ݿ�������󣬲�ѯ�����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//��ȡ����
		String getting_Password = null;
		
		try {
			//��ȡ����
			conn = DBUtils.getConnection();
			
			//��ȡ����Ĳ�������
			stmt = conn.createStatement();

			//��ѯ�û������Ƿ�ƥ��
			String sql = "select password from t_user where userName = '" + userName + "'";
			
			rs = stmt.executeQuery(sql);
			
			//5.�����ѯ�����
			if(rs.next()) {
				getting_Password = rs.getString(1);
			}else {
				//System.out.println("��¼ʧ��");
				return login;
			}
			
			if(password.equals(getting_Password)) {
				login = true;
				//System.out.println("��¼�ɹ�");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���ùرշ���
			DBUtils.close(conn, stmt, rs);
		}
		
		return login;
		
	}
	
	//����
	public static void main(String args[]) {
		Login login = new Login();
		login.login("������", "13398182161");
		System.out.println(login.login);
		
		Login login1 = new Login();
		login1.login("������", "13398182162");
		System.out.println(login1.login);
		
		Login login2 = new Login();
		login2.login("����", "13398182161");
		System.out.println(login2.login);
	}

}

