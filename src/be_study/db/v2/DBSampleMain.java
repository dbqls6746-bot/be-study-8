package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
	
		//DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();
		ProductDAO productDAO = new ProductDAO();
		
		//insert 저장
		
		int result1 = deptDAO.saveDept(90, "DEV", "SEOUL" );
		if( result1 > 0 ) {
			System.out.println("저장성공~11111");
		}
		
		Dept saveDept1 = new Dept();
		saveDept1.setDeptno(91);
		saveDept1.setDname("Adv");
		saveDept1.setLoc("Busan");
		
		int result2 = deptDAO.saveDept(saveDept1);
		if( result2 > 0 ) {
			System.out.println("저장성공 ~ 22");
		}
		//----------------------------------------------------------
		
		int result3 = deptDAO.removeDept(90);
		int result4 = deptDAO.removeDept(saveDept1);
		
		if( result3 > 0) {
			System.out.println("90번 부서 삭제됨");
		}
		if( result4 > 0) {
			System.out.println("91번 부서 삭제됨");
		}
		
		
		//80번부서 삭제
		deptDAO.removeDept(80);
		Dept rmd1 = new Dept(80, null, null);
		deptDAO.removeDept(rmd1);
		//-----------------------------------------------------------
		
		//여러개를 저장 하는 케이스
		
		List<Dept> saveDeptList = new ArrayList<Dept>();
		saveDeptList.add(new Dept(81, "dn81", "loc81") );
		saveDeptList.add(new Dept(82, "dn82", "loc82") );
		saveDeptList.add(new Dept(83, "dn83", "loc83") );
		
		int result5 = 0;
		for(Dept d : saveDeptList) {
			int r = deptDAO.saveDept(d);
			// r : 1	0
			result5 += r;
			if(r > 0)
				System.out.println("dept 저장 성공");
		}
		System.out.println("반복문 통해서 총 몇개가 저장되었나? 행의 수 합 : " + result5);
		
		//----------------------------------------------------------
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