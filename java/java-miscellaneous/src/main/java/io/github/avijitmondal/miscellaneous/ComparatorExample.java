package io.github.avijitmondal.miscellaneous;

import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(5, "Avijit", "Kolkata");
        students[1] = new Student(1, "Bijay", "Bangalore");
        students[2] = new Student(3, "Cintu", "Delhi");
        students[3] = new Student(6, "Sudip", "Mumbai");
        students[4] = new Student(4, "Nandu", "Assam");
        Arrays.sort(students, Student.StudentNameComparator);
        for (Student student : students)
            System.out.println(student);
    }
}
