package br.com.alura.screenmatch.main;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Integer> usingHashMap = new HashMap<>();

        usingHashMap.put("Cat", 1);
        usingHashMap.put("Dog", 2);
        usingHashMap.put("Rat", 3);

        int value = usingHashMap.get("Dog");
        System.out.println("Value of the key dog: " + value);

        usingHashMap.remove("Cat");

        for (String key : usingHashMap.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " +usingHashMap.get(key));
        }
    }
}
