package org.example;

//import java.util

import java.util.ArrayList;

public class StringUtils {
    public StringUtils(){}

    public static String joinArray(ArrayList<String> source, final char del){
        if(source == null){
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (String st : source) {
            result.append(st);
            //System.out.println(st);
            result.append(del);
        }
        return result.toString();
    }
}
