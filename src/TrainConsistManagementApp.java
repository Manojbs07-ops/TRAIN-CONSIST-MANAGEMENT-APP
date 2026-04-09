import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================\n");

        // Using LinkedHashSet instead of LinkedList
        Set<String> consist = new LinkedHashSet<>();

        // Add bogies (same as UC4 concept)
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("Cargo");
        consist.add("Guard");

        // Try adding duplicate (new improvement in UC5)
        consist.add("Sleeper"); // will NOT be added

        // Display final consist
        System.out.println("Final Train Formation:");
        System.out.println(consist + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are removed and order is preserved using LinkedHashSet.\n");

        System.out.println("UC5 formation setup completed...");
    }
}
