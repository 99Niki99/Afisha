package Afisha.reviews.model;

import jakarta.persistence.criteria.Root;
import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.time.LocalDateTime;

public class JsonSimpleParser {
    public Root parse(String json) {
        Root root = new Root();
        JSONParser parser = new JSONParser(json);

        try (FileReader reader = new FileReader("package.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

            String id = (String) rootJsonObject.get("id");
            String eventName = (String) rootJsonObject.get("eventName");
            LocalDateTime eventDate = (LocalDateTime) rootJsonObject.get("eventDate");
            String ratingType = (String) rootJsonObject.get("ratingType");
            String sourceName = (String) rootJsonObject.get("sourceName");
            String sourceType = (String) rootJsonObject.get("sourceType");
        } catch (Exception e) {
            System.out.println("Parsing error" + e.getMessage());
        }
        return null;
    }
}
