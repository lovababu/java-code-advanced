package org.avol.java.fileio;

import java.io.IOException;
import java.io.InputStream;

public class ReadFileByteByByte {

    //handle I/O of raw binary data.
    //Programs use byte streams to perform input and output of 8-bit bytes. All byte stream classes are descended from InputStream and OutputStream.
    public static void main(String[] args) {
        InputStream inputStream = ReadFileByteByByte.class.getResourceAsStream("/text.log");

        if (inputStream != null) {
            try (inputStream) {
                int bite;
                while ((bite = inputStream.read()) != -1) {
                    System.out.print(bite + " : " + (char)bite + ",");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Resource not found: myFile.txt");
        }
    }

}
