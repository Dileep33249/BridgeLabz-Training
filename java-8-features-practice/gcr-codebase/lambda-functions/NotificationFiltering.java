import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("High BP", "Normal BP", "Low Sugar", "Medication Due");
        Predicate<String> important = a -> a.contains("High") || a.contains("Due");

        for (String a : alerts) if (important.test(a)) System.out.println("Important Alert: " + a);
    }
}