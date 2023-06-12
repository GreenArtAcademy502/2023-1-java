package com.green.java.file;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("D:/a.txt");
        System.out.println(f.exists());
        //f.delete();

        File f2 = new File("D:/b.txt");
        System.out.println(f2.exists());


        File dic = new File("D:/abc");
        if(!dic.exists()) {
            dic.mkdir();
        }
    }
}
