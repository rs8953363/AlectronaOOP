package Hashmap;

import java.util.*;

public class HashSetBasics {
    /*Code to check if two hashmaps are equal
     */
    static boolean checkIfHashMApsAreEqual(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character x : map1.keySet()) {
            if (map2.containsKey(x) == false)
                return false;
            if (map2.get(x) != map1.get(x))
                return false;
        }
        return true;
    }
    static boolean checkIfStringsAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        
        char ch;
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            if(s1Map.containsKey(ch))
                s1Map.put(ch, s1Map.get(ch)+1);
            else
                s1Map.put(ch, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            
        }
    return s1Map.equals(s2Map);
}
public static void main (String[] args){
    String s1 = "cinema";
    String s2 ="iceman";
    System.out.println(checkIfStringsAnagram(s1,s2));
}

HashMap<String, Integer> map = new HashMap<>();
map.put("Tugba", 38);
map.put("Tugba", 15); //update
        map.put("Ayse", 20);
        map.put("Fatma", 52);
        map.put("Hayriye", 71);
        //System.out.println(map.get("Tugba");
        map.remove("Tugba");
        int size = map.size();
        System.out.println(size);
        boolean containsKey = map.containsKey("Fatmaa");
        System.out.println(containsKey);
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);
        //map.clear();
//System.out.println(map.size());

for(Map.Entry<String, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + ":" +entry.getValue());
        }

for (String name:map.keySet())
        System.out.println(name+ " : " +map.get(name));

        }
}