import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Rain", "rain, rain, rain");
        trackList.put("Sky", "Sky, Sky, Sky");
        trackList.put("Air", "Air, Air, Air");
        trackList.put("Fire", "Fire, Fire, Fire");

        System.out.println(trackList.get("Fire"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}
