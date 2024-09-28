package models;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int totalStudents = 0;

    public void adds(Student student) {
        // receive a student and adds it

        // from this solution...
        /*for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }*/

        // to this one... so much better
        this.students[totalStudents] = student;
        totalStudents++;

    }

    public Student get(int index) {
        // gets by position
        return null;
    }

    public void remove(int index) {
        //removes by position
    }

    public boolean exists(Student student) {
        //Sabremos si está el alumno o no en la lista
        //whether exists or not a student
        return false;
    }

    public int size() {
        // gets the length of students
        return totalStudents;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
