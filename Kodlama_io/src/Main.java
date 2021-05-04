
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Talha","KOCA","talhakoca@talhakoca","12345","Python","%65");
		Student student2 = new Student();
		student2.setId(1);
		student2.setFirstName("Talha");
		student2.setLastName("KOCA");
		student2.setEmail("talha@talha");
		student2.setPassword("1234");
		student2.setCourse("JAVA");
		student2.setProcess("%99");
		
		Instructor instructor = new Instructor(
				1,"Engin", "DEMÝROÐ","engin@engin","1111","ANGULAR-REACT");
		
	
		StudentManager studentManager = new StudentManager();
		
		studentManager.launchCourse("C#");
		studentManager.add(student1);
		studentManager.delete(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.addTask();
	}

}
