import java.util.*;


public class Assignment2Q8_1 {
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Paris", "France");
        cityCode.put("New York", "USA");

        Iterator iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));

            cityCode.put("Istanbul", "Turkey");
        }
    }
}