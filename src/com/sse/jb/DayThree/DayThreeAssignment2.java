package com.sse.jb.DayThree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DayThreeAssignment2 {

    public static void assignmentTwoAppend(String filePath) {

        try {
            File textFile = new File(filePath);
            if (!textFile.exists()) {
                textFile.createNewFile();
                System.out.println("Created File!");
            }
            FileWriter fileWriter = new FileWriter(textFile.getName(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nThis is content added by code! I hope!");
            bufferedWriter.close();
            System.out.println("The try worked, we are not in the catch");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
