package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MapToString {
    public static void main(String[] args) {
        List<Object> df=new ArrayList<>();
        df.add(1);
        df.add(2);

        Map<String,Object> dds=new HashMap<>();
        dds.put("obke",df);
        Logger.getLogger(""+dds);
        System.out.println(dds.toString());


        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 30);
        data.put("city", "New York");

        // Transform the entries to a list of strings and collect them
        List<String> transformedList = data.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue()) // Transform each map entry to a string
                .collect(Collectors.toList()); // Collect the results into a List

        // Print the resulting list
        System.out.println("Transformed List: " + transformedList);

    }
}
