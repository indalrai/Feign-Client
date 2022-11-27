package ManyToMany_Mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	@Column(name = "Projects_Name")
	private String pname;

	@ManyToMany(mappedBy="projects")
	private List<Emp> emp;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	public Project(int pid, String pname, List<Emp> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}