

import java.util.List;

public interface DepartmentDAO {
		void add(Department department);
		void update(Department department);
		void delete(int deptno);
		Department findByPk(int deptno);
		List<Department> getAll();//import java.util.List;
		
		
		
}
