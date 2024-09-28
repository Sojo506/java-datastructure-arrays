package models;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];

    public void adds(Student student) {
        // gets a student and adds it

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
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
