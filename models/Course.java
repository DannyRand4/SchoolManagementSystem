package models;

import java.util.ArrayList;

public class Course {
    String courseName;
    int capacity;
    ArrayList<String> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public boolean enrollStudent(String studentID) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentID);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return courseName + " | Capacity: " + capacity + " | Enrolled: " + enrolledStudents.size();
    }
}
