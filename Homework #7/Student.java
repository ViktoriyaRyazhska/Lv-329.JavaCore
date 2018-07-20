import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student() {}
    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(Integer course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public Integer getCourse() {
        return course;
    }

    public static void printStudents(List students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student variable = iterator.next();
            if (variable.getCourse().equals(course)) {
                System.out.println(variable);
            }
        }
    }

    @Override
    public String toString() {
        return "Student:\n■ Name: " + name + ".\n■ Course: " + course + ".";
    }
}