
public class Student extends User {

	private String course;
	private String process;

	public Student() {
		
	}

	public Student(
			int id,String firstName,
			String lastName, String email,
			String password, String course,
			String process
			) {
		super(id,firstName,lastName,email,password);
		this.course = course;
		this.process = process;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
}
