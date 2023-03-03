package org.example.aggregation;

import java.sql.SQLOutput;
import java.util.*;
public class Folder {
    List<File> files = new ArrayList<>();


    public Folder() {
        for(int x = 1; x <= 10; x++){

            //composition
            files.add(new File());
        }
        System.out.println("Number of files: "+ files.size());
    }

    public static void main(String[] args) {
        Folder folder = new Folder();
    }

    public Folder(File[] f){
        for(int x = 0; x < f.length; x++){

            //aggregation
            files.add(f[x]);
        }
        System.out.println("Number of files: "+ files.size());
    }
}

