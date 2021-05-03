
public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Yeni kurs " + course.courseName + " eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName + " kursu silindi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.courseName + " kursu güncellendi.");
	}
	public void changeCourseInstructor(Course course) {
		System.out.println( course.courseName + " kursunun yeni eðitmeni " + course.instructorName + "'dir.");
		
	}
}
