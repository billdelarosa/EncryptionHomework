package com.company;

import java.io.*;

public class FileOutput {

    Writer out = null;
    private String fileName;

    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new FileWriter(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
        catch(IOException e) {
            System.out.println("IO Exception Error: " + fileName + " " + e);
        }
    }

    public void decryptFile(String line) {
        char temp;
        for (int i = 0; i < line.length(); i++) {
            temp = line.charAt(i);
            temp -= 1111998;
            fileWrite(Character.toString(temp));
        }
    }

    public void fileWrite(String line) {
        try {
            out.write(line);
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}