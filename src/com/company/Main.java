package com.company;

public class Main {

    public static void main(String[] args) {

        FileInput inFile = new FileInput("readthis.txt");
        String line = inFile.fileRead();

        FileOutput outFile = new FileOutput("encryptedfile.txt");
        outFile.fileWrite(line);
        outFile.fileClose();
        inFile.fileClose();

        FileOutput decryptedFileOutput = new FileOutput("decryptedfile.txt");
        decryptedFileOutput.decryptFile(line);
        decryptedFileOutput.fileClose();
    }
}
