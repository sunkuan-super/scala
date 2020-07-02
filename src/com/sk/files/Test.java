package com.sk.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("D://aaa.txt");
        writer.println("123");
        writer.close();
        System.out.println("12312");
    }
}
