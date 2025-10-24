
import java.util.*;

public class PerformanceAnalytics {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addSubject(String subject) {
        graph.putIfAbsent(subject, new ArrayList<>());
    }

    public void addRelation(String subject1, String subject2) {
        graph.get(subject1).add(subject2);
        graph.get(subject2).add(subject1); // undirected graph
    }

    public void showSubjects() {
        System.out.println("\n--- Subject Performance Graph ---");
        for (String subject : graph.keySet()) {
            System.out.println(subject + " -> " + graph.get(subject));
        }
    }

    // ✅ Small test main
    public static void main(String[] args) {
        System.out.println("Testing Performance Analytics...");
        PerformanceAnalytics analytics = new PerformanceAnalytics();

        analytics.addSubject("Math");
        analytics.addSubject("Programming");
        analytics.addSubject("AI");

        analytics.addRelation("Math", "Programming");
        analytics.addRelation("Programming", "AI");

        analytics.showSubjects();
    }
}
