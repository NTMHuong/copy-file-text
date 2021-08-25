package com.codegym;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        copyFileText("taptinnguon.txt", "taptindich.txt");
    }

    public static void copyFileText(String fileSource, String fileTarget) {
        try {
            File fileRead = new File(fileSource);
            FileReader fileReader = new FileReader(fileRead);
            BufferedReader br = new BufferedReader(fileReader);

            File fileWrite = new File(fileTarget);
            FileWriter fileWriter = new FileWriter(fileWrite);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            String line = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line + "\n");
                count++;
            }
            bw.write("count: " + count + "\n" );
            bw.close();
            br.close();

        } catch (IOException e) {
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }

    }
}
