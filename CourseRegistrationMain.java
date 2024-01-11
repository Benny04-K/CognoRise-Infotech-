package StudentRegistration;

public class CourseRegistrationMain 
{

	    public static void main(String[] args) {
	        // Initialize Course Manager and Student Manager
	        CourseManager courseManager = new CourseManager();
	        StudentManager studentManager = new StudentManager();

	        // Add some sample courses
	        Course course1 = new Course("CS101", "Introduction to Programming", "Fundamentals of programming", 30, "Mon/Wed/Fri 10:00 AM");
	        Course course2 = new Course("ENG201", "English Composition", "Improving writing skills", 25, "Tue/Thu 2:00 PM");
	        Course course3 = new Course("MATH301", "Calculus", "Basic calculus concepts", 20, "Mon/Wed 1:30 PM");

	        courseManager.addCourse(course1);
	        courseManager.addCourse(course2);
	        courseManager.addCourse(course3);

	        // Add some sample students
	        Student student1 = new Student(101, "John Doe");
	        Student student2 = new Student(102, "Jane Smith");

	        studentManager.addStudent(student1);
	        studentManager.addStudent(student2);

	        // Display available courses
	        courseManager.displayCourses();

	        // Perform student registration
	        System.out.println("\nStudent Registration:");
	        Student selectedStudent = studentManager.getStudentByID(101);
	        Course selectedCourse = courseManager.getCourseByCode("CS101");

	        if (selectedStudent != null && selectedCourse != null) {
	            selectedStudent.registerForCourse(selectedCourse);
	        }

	        // Display updated student information
	        studentManager.displayStudents();

	        // Perform course removal
	        System.out.println("\nCourse Removal:");
	        selectedStudent.dropCourse(selectedCourse);

	        // Display updated student information after course removal
	        studentManager.displayStudents();
	    }
}
