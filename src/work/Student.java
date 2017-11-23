package work;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2312738656995553547L;
	private Integer sid;
	private String sname;
	private double grede;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getGrede() {
		return grede;
	}
	public void setGrede(double grede) {
		this.grede = grede;
	}
	public Student(Integer sid, String sname, double grede) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.grede = grede;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
