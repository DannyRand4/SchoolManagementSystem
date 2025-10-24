
class FeeNode {
    int studentId;
    double amount;
    FeeNode left, right;

    public FeeNode(int id, double amt) {
        studentId = id;
        amount = amt;
    }
}

public class FeeTracker {
    private FeeNode root;

    public void insert(int id, double amount) {
        root = insertRec(root, id, amount);
    }

    private FeeNode insertRec(FeeNode root, int id, double amount) {
        if (root == null) {
            return new FeeNode(id, amount);
        }
        if (id < root.studentId)
            root.left = insertRec(root.left, id, amount);
        else if (id > root.studentId)
            root.right = insertRec(root.right, id, amount);
        return root;
    }

    public void showPayments() {
        System.out.println("\n--- Fee Payments (Sorted by ID) ---");
        inorder(root);
    }

    private void inorder(FeeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Student " + root.studentId + " -> Ksh " + root.amount);
            inorder(root.right);
        }
    }

    // ✅ Small test main
    public static void main(String[] args) {
        System.out.println("Testing Fee Tracker...");
        FeeTracker fees = new FeeTracker();

        fees.insert(102, 12000);
        fees.insert(101, 9500);
        fees.insert(103, 15000);

        fees.showPayments();
    }
}
