package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
public  Product findProductByP_CodePrint(int p_code) {
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		Product product = null;
		
		conn=DBConnectionManager.connectDB();
		
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
		}finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return product;
	}
	
public static List<Product> findProductList() {
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		conn= DBConnectionManager.connectDB();
		
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
		}finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return productList;
		
	}
}
