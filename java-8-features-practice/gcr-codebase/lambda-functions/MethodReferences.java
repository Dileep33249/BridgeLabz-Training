import java.util.*;

class Invoice {
    String id;
    Invoice(String id) { this.id = id; }
    public String toString() { return "Invoice ID: " + id; }
}

public class MethodReferences {
    public static void main(String[] args) {
        // 1. Print patient IDs
        List<String> patients = Arrays.asList("P101", "P102", "P103");
        patients.forEach(System.out::println);

        // 2. Uppercase employee names
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> upper = new ArrayList<>();
        for (String n : names) upper.add(n.toUpperCase());
        System.out.println(upper);

        // 3. Create invoice objects from IDs
        List<String> ids = Arrays.asList("INV1", "INV2", "INV3");
        List<Invoice> invoices = new ArrayList<>();
        for (String id : ids) invoices.add(new Invoice(id));
        for (Invoice i : invoices) System.out.println(i);
    }
}