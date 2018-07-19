import java.util.ArrayList;
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

    public void printStudents(List students, Integer course) {
        List<Student> variable = new ArrayList<>();
        variable.addAll(students);
        Iterator<Student> iterator = variable.iterator();
        while (iterator.hasNext()) {
            Student variable0 = iterator.next();
            if (variable0.getCourse().equals(course)) {
                System.out.println(variable0);
            }
        }
    }

    @Override
    public String toString() {
        return "Student:\n■ Name: " + name + ".\n■ Course: " + course + ".";
    }
}