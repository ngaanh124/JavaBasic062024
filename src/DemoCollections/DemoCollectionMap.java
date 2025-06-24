package DemoCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
//Khai bao kieu du liwu map
        //Ko luu duoc 2 key trung lap
        Map <String, String> map = new HashMap<>();
        Map <Integer, Double> map2 = new HashMap<>();

        //Them du lieu
        map.put("language","Java");
        map.put("Framework","TestNG");
        map2.put(1,111D);

        System.out.println("Map1: " + map);
        System.out.println("Map2: " + map2);

        //update value
        map.put("Language", "Playwright");

        System.out.println(map.containsKey("Language"));
        System.out.println(map.containsValue("Java"));
        //map.remove("")

        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
