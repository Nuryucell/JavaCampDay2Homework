
public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Yeni kurs " + course.courseName + " eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName + " kursu silindi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.courseName + " kursu g�ncellendi.");
	}
	public void changeCourseInstructor(Course course) {
		System.out.println( course.courseName + " kursunun yeni e�itmeni " + course.instructorName + "'dir.");
		
	}
}
