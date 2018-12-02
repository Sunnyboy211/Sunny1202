

import java.util.List;

public class DeptTest {

	public static void main(String[] args) {
					DepartmentDAOImpl dao= new DepartmentDAOImpl();
					List<Department> deptList =dao.getAll();
				for(Department dept: deptList) {
						System.out.println("DEPTNO= "+ dept.getDeptno());
						System.out.println("DNAME=  "+ dept.getDname());
						System.out.println("LOC= "+ dept.getLoc());
						System.out.println("===================================");
				}
			
				
				/* 查詢方法  
				Scanner sc =new Scanner(System.in);
				System.out.println("請輸入編號");
				int deptno=sc.nextInt();

				sc.close();
				

				DepartmentDAOImpl dao= new DepartmentDAOImpl();
				Department dept= dao.findByPk(deptno);
				System.out.println("DEPTNO= "+ dept.getDeptno());
				System.out.println("DNAME=  "+ dept.getDname());
				System.out.println("LOC= "+ dept.getLoc());
				 * */
				
				
				
				/*全部查詢方法
				 */
				
				
				
				
				
			}

		



	}


