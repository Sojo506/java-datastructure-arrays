package models;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Student another = (Student) obj;
        return another.getName().equals(this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
