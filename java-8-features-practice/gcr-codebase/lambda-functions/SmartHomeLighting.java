import java.util.*;

interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON for motion detected");
        LightAction night = () -> System.out.println("Dimmed lights for night");
        LightAction voice = () -> System.out.println("Lights ON via voice command");

        List<LightAction> triggers = Arrays.asList(motion, night, voice);
        for (LightAction t : triggers) t.execute();
    }
}