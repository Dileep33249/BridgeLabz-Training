import java.util.*;
import java.util.stream.Collectors;
class Claim {
    private String claimType;
    private double amount;

    public Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim("Health", 20000),
                new Claim("Health", 30000),
                new Claim("Vehicle", 15000),
                new Claim("Vehicle", 25000),
                new Claim("Life", 50000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              Claim::getClaimType,
                              Collectors.averagingDouble(Claim::getAmount)
                      ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " Average Claim = " + avg)
        );
    }
}
