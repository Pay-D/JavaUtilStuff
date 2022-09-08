package de.reuter.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileReader {

    public static String getStringFromFile(File file) {
        BufferedReader br;
        try {
            br = new BufferedReader(new java.io.FileReader(file));
            String content = br.lines().collect(Collectors.joining());
            br.close();
            return content;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return null;
        } catch (IOException e) {
            System.out.println("Failed to closes BuffedReader at File: " + file.getAbsolutePath());
            return null;
        }
    }
}
