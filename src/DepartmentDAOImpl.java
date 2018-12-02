

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "David";
	private static final String PASSWORD = "123456";
	private static final String INSERT_STMT = "INSERT INTO DEPARTMENT(deptno, dname,loc)" + "VALUES(?, ?, ?)";
	private static final String FIND_BY_PK="SELECT * FROM DEPARTMENT WHERE DEPTNO=?";
	private static final String GET_ALL="SELECT * FROM DEPARTMENT";
		 {
			try {
				Class.forName(DRIVER);
	
			} catch (ClassNotFoundException ce) {
				ce.printStackTrace();
			}
	
		}

	@Override
	public void add(Department department) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, department.getDeptno());
			pstmt.setString(2, department.getDname());
			pstmt.setString(3, department.getLoc());
			pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
				if (con != null) {
					try {
						con.close();
					} catch (SQLException se) {
						se.printStackTrace();
					}
				}
			}

		}
	}

	@Override
	public void update(Department department) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findByPk(int deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Department dept = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_PK);

			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dept = new Department();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString("DNAME"));//2用 "DNAME "
				dept.setLoc(rs.getString("LOC")); //3用"LOC"
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (pstmt != null) {
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException se) {
						se.printStackTrace();
					}
					if (con != null) {
						try {
							con.close();
						} catch (SQLException se) {
							se.printStackTrace();
						}
					}
				}

			}
		}

		return dept;//記得不能用 null
	}

	@Override
	public List<Department> getAll() {
		List<Department> deptList= new ArrayList<>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Department dept=null;
		
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dept =new Department();
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));//2用 "DNAME "
				dept.setLoc(rs.getString("LOC")); //3用"LOC"
				deptList.add(dept);
				
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
	
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
				if (con != null) {
					try {
						con.close();
					} catch (SQLException se) {
						se.printStackTrace();
					}
				}
			}

		
		
		return deptList;
		}

		
	
}
