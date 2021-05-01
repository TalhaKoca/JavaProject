
public class Instructor extends User {
	
	private String projects;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String projects) {
		super(id,firstName, lastName, email, password);
		this.projects = projects;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}
	
	
}
