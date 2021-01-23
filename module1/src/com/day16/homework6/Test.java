package com.day16.homework6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        read();
    }

    public static void read() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\b.txt"));
            String str = null;
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
