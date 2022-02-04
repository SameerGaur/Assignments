import java.util.*;

public class Assignment1Q7 {

    interface ConvertKeyValueToString{
        public String convertKeyValueToString(HashMap<String, Integer> map);
    }
    public static  ConvertKeyValueToString convertKeyValueToString(){
        return (map)->{
            String result="";
            for(Map.Entry<String,Integer> mp: map.entrySet()){
                String key = mp.getKey();
                int value = mp.getValue();

                result += key + Integer.toString(value);
            }
            return result;
        };
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alex",1);
        hashMap.put("Rio",2);
        hashMap.put("Paul",3);
        hashMap.put("Ussoup",4);
        hashMap.put("Hawks",5);

        System.out.println("String after append key-value all pairs into a single string:\n");

        System.out.println(convertKeyValueToString().convertKeyValueToString(hashMap));
    }
}