import java.util.*;

public class Program {

    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    public Map<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (CreatorStats c : records) {
            int count = 0;
            if (c.WeeklyLikes != null) {
                for (double v : c.WeeklyLikes) {
                    if (v >= likeThreshold) {
                        count++;
                    }
                }
            }
            if (count > 0) {
                result.put(c.CreatorName, count);
            }
        }
        return result;
    }

    public double CalculateAverageLikes() {
        double total = 0;
        int weeks = 0;
        for (CreatorStats c : CreatorStats.EngagementBoard) {
            if (c.WeeklyLikes != null) {
                for (double v : c.WeeklyLikes) {
                    total += v;
                    weeks++;
                }
            }
        }
        if (weeks == 0)
            return 0;
        return total / weeks;
    }

    public static void main(String[] args) {
        Program p = new Program();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter your choice:");

            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                continue;
            }

            if (choice == 1) {
                System.out.println("Enter Creator Name:");
                String name = sc.nextLine();

                double[] likes = new double[4];
                System.out.println("Enter weekly likes (Week 1 to 4):");
                for (int i = 0; i < 4; i++) {
                    String line;
                    do {
                        line = sc.nextLine().trim();
                    } while (line.isEmpty());
                    likes[i] = Double.parseDouble(line);
                }

                CreatorStats record = new CreatorStats(name, likes);
                p.RegisterCreator(record);
                System.out.println("Creator registered successfully");

            } else if (choice == 2) {
                System.out.println("Enter like threshold:");
                String line;
                do {
                    line = sc.nextLine().trim();
                } while (line.isEmpty());
                double threshold = Double.parseDouble(line);

                Map<String, Integer> top = p.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);
                if (top.isEmpty()) {
                    System.out.println("No top-performing posts this week");
                } else {
                    for (Map.Entry<String, Integer> e : top.entrySet()) {
                        System.out.println(e.getKey() + " - " + e.getValue());
                    }
                }

            } else if (choice == 3) {
                double avg = p.CalculateAverageLikes();
                if (Math.abs(avg - Math.round(avg)) < 1e-9) {
                    System.out.println("Overall average weekly likes: " + (long) Math.round(avg));
                } else {
                    System.out.println("Overall average weekly likes: " + avg);
                }

            } else if (choice == 4) {
                System.out.println("Logging off - Keep Creating with StreamBuzz!");
                break;
            }
        }

        sc.close();
    }
}