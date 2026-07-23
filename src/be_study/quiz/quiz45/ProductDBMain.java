package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDBMain {

	public static void main(String[] args) {
		
		Product p1 = findProductByP_CodePrint(100);
		
		if(p1 != null) {
			System.out.println(p1.toString());
		}
		
		List<Product> productList1 = findProductList();
		
		if(productList1 == null) {
			System.out.println("조회 데이터가 없습니다");
		} else { 
			for(Product p : productList1) {
				System.out.println(p.toString());
			}
		}
		
	}

	public static Product findProductByP_CodePrint(int p_code) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		Product product = new Product();
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = " select * from product where p_code = ? ";
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, p_code);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				System.out.print( rs.getInt("p_code") + " ");
				System.out.print( rs.getString("p_name") + " ");
				System.out.println( rs.getString("p_price") );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			if(rs != null)
			rs.close(); //null 객체 메소드 호출 -> NullPointerException
				
			if(psmt != null)
			psmt.close();
				
			if(conn != null)
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
public static List<Product> findProductList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = " select * from product ";
		
		List<Product> productList = null;
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Product product = new Product();
				
				product.setP_code( rs.getInt("p_code"));
				product.setP_name( rs.getString("p_name"));
				product.setP_price( rs.getInt("p_price"));
				
				if(productList == null) {
					productList = new ArrayList<>();
				}
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			if(rs != null)
			rs.close(); //null 객체 메소드 호출 -> NullPointerException
				
			if(psmt != null)
			psmt.close();
				
			if(conn != null)
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
		
	}
}
