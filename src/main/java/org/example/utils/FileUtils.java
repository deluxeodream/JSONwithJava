package org.example.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void createNewFileIfNotExist(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("[]");
            fileWriter.close();
        }
    }
}
