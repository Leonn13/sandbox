package org.example.collections;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Set<String> setOfStuff = new TreeSet<>();
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");

        setOfStuff.add("There");
        setOfStuff.add("Hi");
        setOfStuff.add("Aaa");
        System.out.println(setOfStuff);
    }
}
