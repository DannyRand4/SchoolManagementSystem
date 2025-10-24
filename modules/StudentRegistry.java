

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, String> students = new HashMap<>();

    // Add a new student
    public void addStudent(String id, String name) {
        students.put(id, name);
    }

    // Find a student by ID
    public String findStudent(String id) {
        return students.getOrDefault(id, "Student not found");
    }

    // Remove a student
    public void removeStudent(String id) {
        students.remove(id);
    }

    // Display all students
    public void showAllStudents() {
        System.out.println("\n--- Student List ---");
        for (String id : students.keySet()) {
            System.out.println(id + " -> " + students.get(id));
        }
    }

    // ✅ Small test main
    public static void main(String[] args) {
        System.out.println("Testing Student Registry...");
        StudentRegistry reg = new StudentRegistry();

        reg.addStudent("S001", "Danny");
        reg.addStudent("S002", "Freddy");
        reg.addStudent("S003", "Musa");

        reg.showAllStudents();

        System.out.println("\nSearching for S002: " + reg.findStudent("S002"));

        reg.removeStudent("S001");
        System.out.println("\nAfter removing S001:");
        reg.showAllStudents();
    }
}
