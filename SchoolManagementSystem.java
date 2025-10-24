public class SchoolManagementSystem {
    public static void main(String[] args) {
        System.out.println("\n===== SCHOOL MANAGEMENT SYSTEM =====");

        StudentRegistry registry = new StudentRegistry();
        CourseScheduler scheduler = new CourseScheduler();
        FeeTracker fees = new FeeTracker();
        LibrarySystem library = new LibrarySystem();
        PerformanceAnalytics analytics = new PerformanceAnalytics();

        // --- Student Registry ---
        registry.addStudent("S001", "Danny");
        registry.addStudent("S002", "Freddy");
        registry.showAllStudents();

        // --- Course Scheduler ---
        scheduler.registerCourse("Danny");
        scheduler.registerCourse("Freddy");
        scheduler.showQueue();
        scheduler.allocateCourse();

        // --- Fee Tracker ---
        fees.insert(1, 12000);
        fees.insert(2, 9500);
        fees.showPayments();

        // --- Library System ---
        library.borrowBook("Data Structures");
        library.borrowBook("Java for Beginners");
        library.showBorrowedBooks();
        library.returnBook();

        // --- Performance Analytics ---
        analytics.addSubject("Math");
        analytics.addSubject("Programming");
        analytics.addRelation("Math", "Programming");
        analytics.showSubjects();

        System.out.println("\n===== END OF SYSTEM TEST =====");
    }
}
