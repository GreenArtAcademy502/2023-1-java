package com.green.java.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathTest {
    public static void main(String[] args) {
        Path path = Paths.get("download");
        String absPath = path.toFile().getAbsolutePath();
        System.out.println(absPath);
    }
}
