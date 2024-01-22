package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //StringUtils stUtil = new StringUtils();
        ArrayList<String> sArr = new ArrayList<>(Arrays.asList("a","b"));
        System.out.println(org.example.StringUtils.joinArray(sArr,'3'));

    }
}