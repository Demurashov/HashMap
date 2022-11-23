import java.util.HashMap;
import java.util.Map;


public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut" +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu" +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit" +
            "anim id est laborum.";

    public static void main(String[] args) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char var = text.charAt(i);
            if (Character.isLetter(var)) {
                if (charMap.containsKey(var)) {
                    charMap.put(var, charMap.get(var) + 1);
                } else {
                    charMap.put(var, 1);
                }
            }
        }
        System.out.println(charMap);
        System.out.println("Реже всего встречающаяся буква: "+GetMin(charMap).getKey()+" встречается "+GetMin(charMap).getValue()+" раз");
        System.out.println("Чаще всего встречающаяся буква: "+GetMax(charMap).getKey()+" встречается "+GetMax(charMap).getValue()+" раз");
    }

    public static Map.Entry GetMax(HashMap<Character, Integer>  input){
        int max=0;
        Map.Entry<Character, Integer> maxMap = null;
        for (Map.Entry<Character, Integer> item:input.entrySet()) {
            if (item.getValue()>max) {
                max=item.getValue();
                maxMap=item;
            }
        }
        return maxMap;
    }
    public static Map.Entry GetMin(HashMap<Character, Integer>  input){
        int min=Integer.MAX_VALUE;
        Map.Entry<Character, Integer> minMap = null;
        for (Map.Entry<Character, Integer> item:input.entrySet()) {
            if (item.getValue()<min) {
                min=item.getValue();
                minMap=item;
            }
        }
        return minMap;
    }
}
