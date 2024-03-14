package Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import JDBC_Utils.DBUtils;

public class SignUP {
	
	private SignUP() {
		
	}
	
	public static boolean signUp(String TEL, String userName, String password) {
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean signUp = false;
		
		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();

			//将电话号码，姓名，密码输入
			String sql = "insert into t_user(TEL, userName, password) values(" + TEL + ", '" + userName + "', " + password + ")";

			//执行数据库更改以及获取执行语句次数
			int count = stmt.executeUpdate(sql);
			
			//创建属于这个用户的订单数据库
			String sql1 = "create database user_TEL_" + TEL;
			System.out.println(sql1);
			
			int count1 = stmt.executeUpdate(sql1);
			
			signUp = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println("创建失败");
			return false;
		}finally {
			//调用关闭方法
			DBUtils.close(conn, stmt, rs);
		}
		
		return signUp;
		
	}
	
	//测试
	public static void main(String args[]) {
		SignUP.signUp("13398182161", "陈羿乔", "13398182161");
	}

}
