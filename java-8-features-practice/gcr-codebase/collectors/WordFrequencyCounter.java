
import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String paragraph = "java stream api makes java powerful stream api is useful";

        Map<String, Long> wordCount =
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.toMap(
                    word -> word,
                    word -> 1L,
                    Long::sum
                ));

        System.out.println(wordCount);
    }
}
