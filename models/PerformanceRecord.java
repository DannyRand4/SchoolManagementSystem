package models;

public class PerformanceRecord {
    String studentID;
    String subject;
    double score;

    public PerformanceRecord(String studentID, String subject, double score) {
        this.studentID = studentID;
        this.subject = subject;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student " + studentID + " - " + subject + ": " + score;
    }
}
