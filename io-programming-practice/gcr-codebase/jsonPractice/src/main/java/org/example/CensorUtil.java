package org.example;

public class CensorUtil {

    public static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}
