package com.mak_keywa;
import java.util.Comparator;
public class CourseComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.numberofcourse - o2.numberofcourse;
    }
}
