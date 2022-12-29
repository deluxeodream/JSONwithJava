package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.example.utils.NameUtils.nameFormatConverter;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader inputFileReader = new FileReader("members.json");
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Member>>(){}.getType();
            List<Member> inputList = gson.fromJson(inputFileReader, listType);
            inputFileReader.close();

            List<Member> outputList = nameFormatConverter(inputList);

            FileWriter outputFileWriter = new FileWriter("members.json");
            gson.toJson(outputList, outputFileWriter);
            outputFileWriter.close();
            System.out.println("The data has been updated.");

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}