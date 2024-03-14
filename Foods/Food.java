package Foods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBC_Utils.DBUtils;

public class Food {
	//食品剩余数量
	int remainderBefore = 0;
	//执行后的食品数量
	int remainderNow = 0;
	//执行增加方法的次数
	//执行移除方法的次数不可以超出这个增加方法执行次数的数量
	int addNumber = 0;
	//执行移除方法的次数
	int subtractNumber = 0;
	//食品名字
	String foodName = null;
	//食品价格
	int foodPrice = 0;
	
	public Food(){
		
	}
	
	public Food(String foodName) {
		this.foodName = foodName;
		
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();
			
			//查询sql语句，查询在操作前还剩多少数量
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//获取查询结果集
			rs = stmt.executeQuery(sql1);
			
			//处理查询结果集，取得食品剩余量
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
			DBUtils.close(conn, stmt, rs);
		}
	}
	
	
	public void add() {
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();
			
			//查询sql语句，查询在操作前还剩多少数量
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//获取查询结果集
			rs = stmt.executeQuery(sql1);
			
			//处理查询结果集，取得食品剩余量
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
			//System.out.println("remainderBefore = " + remainderBefore);
			
			if(remainderBefore > 0) {
			//将该食品的剩余量减一
			String sql2 = "update t_foodstock set remainder = " + (remainderBefore - 1) + " where foodName = '"+ foodName +"'";
			
			//执行数据库更改以及获取执行语句次数
			int count = stmt.executeUpdate(sql2);
			//System.out.println(count);
			
			//获取目前的食品剩余量
			remainderNow = remainderBefore - 1;
			//System.out.println("remainderNow = " + remainderNow);
			//System.out.println(getName() + "点餐成功");
			addNumber++;
			}else {
				//System.out.println(getName() + "点餐失败");
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
			DBUtils.close(conn, stmt, rs);
		}
	}
	
	public void subtract() {
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		if(subtractNumber < addNumber && addNumber != 0) {
		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();
			
			//查询sql语句，查询在操作前还剩多少数量
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//获取查询结果集
			rs = stmt.executeQuery(sql1);
			
			//处理查询结果集，取得食品剩余量
			while(rs.next()) {
				remainderBefore = rs.getInt(1);
			}
			//System.out.println("remainderBefore = " + remainderBefore);
			
			
			
			
			//将该食品的剩余量加一
			String sql2 = "update t_foodstock set remainder = " + (remainderBefore + 1) + " where foodName = '"+ foodName +"'";
			
			//执行数据库更改以及获取执行语句次数
			int count = stmt.executeUpdate(sql2);
			//System.out.println(count);
			
			//获取目前的食品剩余量
			remainderNow = remainderBefore + 1;
			//System.out.println("remainderNow = " + remainderNow);
			subtractNumber++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
			DBUtils.close(conn, stmt, rs);
		}
		}
		else {
			//System.out.println("addNumber不够了");
			return;
		}	
	}
	
	public int now() {
		//获取连接对象，数据库操作对象，查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//获取连接
			conn = DBUtils.getConnection();
			
			//获取编译的操作对象
			stmt = conn.createStatement();
			
			//查询sql语句，查询在操作前还剩多少数量
			String sql1 = "select remainder from t_foodstock where foodName = '"+ foodName +"'";
			
			//获取查询结果集
			rs = stmt.executeQuery(sql1);
			
			//处理查询结果集，取得食品剩余量
			while(rs.next()) {
				remainderNow = rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
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
		//执行增加方法的次数
		this.addNumber = 0;
		//执行移除方法的次数
		this.subtractNumber = 0;
	}
	
	
	//测试
//	public static void main(String args[]) {
//		Food food23 = new Food("啤酒");
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
