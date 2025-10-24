
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduler {
    private Queue<String> courseQueue = new LinkedList<>();
    private final int MAX_CAPACITY = 3;

    public void registerCourse(String studentName) {
        if (courseQueue.size() < MAX_CAPACITY) {
            courseQueue.add(studentName);
            System.out.println(studentName + " registered successfully.");
        } else {
            System.out.println("Sorry, course is full.");
        }
    }

    public void allocateCourse() {
        if (!courseQueue.isEmpty()) {
            String student = courseQueue.poll();
            System.out.println(student + " has been allocated to the course.");
        } else {
            System.out.println("No students in queue.");
        }
    }

    public void showQueue() {
        System.out.println("\nCurrent Course Queue: " + courseQueue);
    }

    // ✅ Small test main
    public static void main(String[] args) {
        System.out.println("Testing Course Scheduler...");
        CourseScheduler scheduler = new CourseScheduler();

        scheduler.registerCourse("Danny");
        scheduler.registerCourse("Freddy");
        scheduler.registerCourse("Musa");
        scheduler.registerCourse("Tom"); // this one will fail because full

        scheduler.showQueue();
        scheduler.allocateCourse();
        scheduler.showQueue();
    }
}
