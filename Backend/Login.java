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
		
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//获取密码
		String getting_Password = null;
		
		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();

			//查询用户密码是否匹配
			String sql = "select password from t_user where userName = '" + userName + "'";
			
			rs = stmt.executeQuery(sql);
			
			//5.处理查询结果集
			if(rs.next()) {
				getting_Password = rs.getString(1);
			}else {
				//System.out.println("登录失败");
				return login;
			}
			
			if(password.equals(getting_Password)) {
				login = true;
				//System.out.println("登录成功");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
			DBUtils.close(conn, stmt, rs);
		}
		
		return login;
		
	}
	
	//测试
	public static void main(String args[]) {
		Login login = new Login();
		login.login("陈羿乔", "13398182161");
		System.out.println(login.login);
		
		Login login1 = new Login();
		login1.login("陈羿乔", "13398182162");
		System.out.println(login1.login);
		
		Login login2 = new Login();
		login2.login("陈羿", "13398182161");
		System.out.println(login2.login);
	}

}

