
public class Course {
	public Course() { 
		System.out.println("kurs alan� �al��t�");
}
	public Course(int id, String courseName, String instructorName, String detail) {
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.detail = detail;
		
	}
	int id;
	String courseName;
	String instructorName;
	String detail;
}
