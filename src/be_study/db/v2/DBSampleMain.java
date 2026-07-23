package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
	
		//DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();
		ProductDAO productDAO = new ProductDAO();
	//40번 부서의 이름 확인! ???? 정보가 어디에???
	Dept dept1 = deptDAO.findDeptByDeptno(30);
	System.out.println(dept1.getDname());
	System.out.println(dept1.getDeptno());
	
	System.out.println(dept1.toString());
	
	Dept dept2 = deptDAO.findDeptByDeptno(90);
	if(dept2 == null) {
	System.out.println("90번에 해당하는 데이터가 없구나~");
	} else {
	System.out.println(dept2.toString());
	}
	
	Dept dept3 = deptDAO.findDeptByDname("ACCOUNTING");
	System.out.println(dept3.toString());
	
	Dept dept4 = deptDAO.findDeptByDname("REST");
	if(dept4 == null) {
		System.out.println("해당 부서는 없습니다.");
		} else {
		System.out.println(dept4.toString());
		}
	
	List<Dept> deptList= deptDAO.findDeptList();
	if(deptList != null) {
		
		for(Dept d : deptList) {
			System.out.println(d.toString());
		}
	}
	
	Product p1 = productDAO.findProductByP_CodePrint(100);
	
	if(p1 != null) {
		System.out.println(p1.toString());
	}
	
	List<Product> productList1 = productDAO.findProductList();
	
	if(productList1 == null) {
		System.out.println("조회 데이터가 없습니다");
	} else { 
		for(Product p : productList1) {
			System.out.println(p.toString());
		}
	}
	}
}