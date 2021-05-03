
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# + Angular Kursu", "Engin Demiroð", "Bitti");
		Course course2 = new Course(2,"Java + React Kursu", "Engin Demiroð", "Devam Ediyor");

		
		Course[] courses = {course1, course2};
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		System.out.println(courses.length);
		
		Instructor instructor1 = new Instructor(1, "Engin Demiroð");
		Instructor instructor2 = new Instructor(2, "Nur Yücel");
		Instructor instructor3 = new Instructor(3, "Fatma Kaya");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
	}

}
