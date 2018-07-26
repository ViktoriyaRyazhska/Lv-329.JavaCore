package Task_3;

import java.util.*;

public class Main {
    public static void main(String args []) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Don",1));
        students.add(new Student("Robert",1));
        students.add(new Student("Ivan",2));
        students.add(new Student("Adam",3));
        students.add(new Student("Georg",3));

        Student.printStudent(students,1);

        students.sort(new NameComparator());
        System.out.println("Sorting by name : ");
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println("Sorting by course : ");
        students.sort(new CourseComparator());
        for (Student student: students) {
            System.out.println(student);
        }
    }
}



