package com.sse.jb.DayThree;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class DayThreeAssignment3 {

    public static void assignmentThreeCharCount(String[] args) {
        try {
//            FileInputStream fis = new FileInputStream("src/com/ss/jb/three/text.txt");
            FileInputStream fis = new FileInputStream("test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            int count = 0;

            while ((i = bis.read()) !=-1) {
                char a = (char)i;
                if (a == args[0].charAt(0)) {
                    count++;
                }
//                System.out.println(a);
            }

            System.out.println(count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

}
