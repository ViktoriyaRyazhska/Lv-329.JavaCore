package Task_3;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student() {
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public static void printStudent(List students, Integer course) {
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            Student st = (Student) iterator.next();
            if (st.getCourse().equals(course)) {
                System.out.println(st.getName() + " in " + st.getCourse() + " course.");
            }
        }
    }

    @Override
    public String toString() {
        return name + " in " + course + " course.";
    }
}
