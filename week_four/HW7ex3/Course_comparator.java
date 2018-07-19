package HW7ex3;

import java.util.Comparator;

public class Course_comparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {

    	return Integer.compare(s1.getCourse(), s2.getCourse());
    }
}
	