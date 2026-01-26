package org.example;

import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class IplJsonAnalyzer {

    public static void processJson() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("ipl.json"));

        for (JsonNode match : root) {

            ((ObjectNode) match).put(
                    "team1",
                    CensorUtil.maskTeam(match.get("team1").asText())
            );

            ((ObjectNode) match).put(
                    "team2",
                    CensorUtil.maskTeam(match.get("team2").asText())
            );

            ((ObjectNode) match).put(
                    "player_of_match",
                    CensorUtil.redactPlayer()
            );

            ObjectNode scoreNode = (ObjectNode) match.get("score");
            Iterator<Map.Entry<String, JsonNode>> fields = scoreNode.fields();
            ObjectNode newScore = mapper.createObjectNode();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                newScore.put(
                        CensorUtil.maskTeam(entry.getKey()),
                        entry.getValue().asInt()
                );
            }
            ((ObjectNode) match).set("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("ipl_censored.json"), root);

        System.out.println("Censored JSON generated");
    }
}
