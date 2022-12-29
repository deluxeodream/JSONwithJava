package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.example.utils.Constants.MEMBERS_JSON_FILE;
import static org.example.utils.FileUtils.createNewFileIfNotExist;
import static org.example.utils.NameUtils.nameFormatConverter;

public class Main {
    public static void main(String[] args) {

        try {

            createNewFileIfNotExist(MEMBERS_JSON_FILE);

            FileReader inputFileReader = new FileReader(MEMBERS_JSON_FILE);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Member>>(){}.getType();
            List<Member> inputList = gson.fromJson(inputFileReader, listType);
            inputFileReader.close();

            List<Member> outputList = nameFormatConverter(inputList);

            FileWriter outputFileWriter = new FileWriter(MEMBERS_JSON_FILE);
            gson.toJson(outputList, outputFileWriter);
            outputFileWriter.close();
            System.out.println("The data is up to date.");

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}