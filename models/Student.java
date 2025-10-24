package models;

public class Student {
    String id;
    String name;
    String course;

    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + course + ")";
    }
}
