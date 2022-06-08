package com.unitedcoder.collectiondatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //define map for websites
        //key--google  value: google website
        Map<String,String>websites = new HashMap<>();
        websites.put("Google", "https://www.google.com");
        websites.put("yahoo", "https://www.yahoo.com");
        websites.put("youtube", "https://www.youtube.com");

        System.out.println(websites.get("yahoo"));
        Set<String> keySet = websites.keySet();
        for (String value: websites.values()){
            System.out.println(value);
        }
    }
}
