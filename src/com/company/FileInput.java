package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    public String fileRead() {
        String line = "";

        try {
            int character;
            while ((character = in.read()) != -1) {
                character += 1111998;
                System.out.print((char)character);
                line += Character.toString((char)character);
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}