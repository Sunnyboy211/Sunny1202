

import java.io.Serializable;

public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//伸到Department 黃色的曲折線中 add default serial version ID  
	//則可以產生private static final long serialVersionUID = 1L;
	private int deptno;
	private String dname;
	private String loc;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc=loc;
	}
	
		
	
	
	
	
}
