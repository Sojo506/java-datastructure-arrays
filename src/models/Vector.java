package models;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int totalStudents = 0;

    public void add(Student student) {
        // receive a student and adds it

        // from this solution...
        /*for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }*/

        // to this one... so much better
        saveStorage();

        this.students[totalStudents] = student;
        totalStudents++;

    }

    public void insert(int index, Student student) {
        // inserts a student in a specif position
        saveStorage();

        if (!isPositionValid(index)) {
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = totalStudents - 1; i >= index; i--) {
            students[i + 1] = students[i];
        }

        students[index] = student;
        totalStudents++;
    }

    public Student get(int index) {
        // gets by position
        if (!isPositionValid(index)) {
            throw new IllegalArgumentException("invalid position");
        }

        return students[index];
    }

    public void remove(int index) {
        //removes by position
        if (!isPositionValid(index)) {
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = index; i < totalStudents; i++) {
            students[i] = students[i + 1];
        }

        totalStudents--;
    }

    public boolean exists(Student student) {
        //whether exists or not a student
        for (int i = 0; i < totalStudents; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }

        return false;
    }

    private void saveStorage() {
        if (totalStudents == students.length) {
            Student[] newArray = new Student[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[i];
            }

            this.students = newArray;
        }
    }

    private boolean isPositionValid(int position) {
        return position >= 0 && position < totalStudents;
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
