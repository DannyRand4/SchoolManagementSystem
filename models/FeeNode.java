package models;

public class FeeNode {
    String studentID;
    double amount;
    FeeNode left, right;

    public FeeNode(String studentID, double amount) {
        this.studentID = studentID;
        this.amount = amount;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Student " + studentID + " -> Ksh " + amount;
    }
}
