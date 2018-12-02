

import java.util.List;
import java.util.Scanner;

public class DAOtest {

	public static void main(String[] args) {
//		/*ADD方法	
		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入編號");
		int deptno=sc.nextInt();
		System.out.println("請輸入名稱");
		String dname=sc.next();
		System.out.println("請輸入所在地");
		String loc=sc.next();
		sc.close();
		
		Department dept=new Department(deptno ,dname,loc);
		DepartmentDAOImpl dao=new DepartmentDAOImpl();
		dao.add(dept);
		System.out.println("新增成功");

	//	*/
		
		/* 查詢單一部門方法   findByPk 
		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入編號");
		int deptno=sc.nextInt();

		sc.close();
		

		DepartmentDAOImpl dao= new DepartmentDAOImpl();
		Department dept= dao.findByPk(deptno);
		System.out.println("DEPTNO= "+ dept.getDeptno());
		System.out.println("DNAME=  "+ dept.getDname());
		System.out.println("LOC= "+ dept.getLoc());
		
		
		
		
		/*全部查詢方法  getAll
		
		DepartmentDAOImpl dao= new DepartmentDAOImpl();
		List<Department> deptList =dao.getAll();
		for(Department dept: deptList) {
				System.out.println("DEPTNO= "+ dept.getDeptno());
				System.out.println("DNAME=  "+ dept.getDname());
				System.out.println("LOC= "+ dept.getLoc());
				System.out.println("===================================");
	}
		
		
		 */
		
	}

}
