package HW7ex3;


import java.util.List;

public class Student {

	@Override
	public String toString() {
		return studName;
	}

	private String studName;

	private int course;

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String studName, int course) {
		super();
		this.studName = studName;
		this.course = course;
	}

	public void printStudents(List<Student> studName, Integer course) {
		/*method printStudents (List students, Integer course), which receives a list
		 * of students and the course number and prints to the console the names of the
		 * students from the list, which are taught in this course (use an iterator)
		 * 
		я не додумавя як ввести число і видати тільки по ітератору курс і хто там вчиться...;
		*/
	}

}
