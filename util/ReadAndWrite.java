package util;

import model.Facility.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadAndWrite {
    public static List<String> readFile(String pathFile){
        List<String>stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
    // Viết file
    public static void writeFile(String pathFile,String test,boolean append){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(test);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFileWithMap(String pathFile, Map<String, Facility>facilityMap,boolean append){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<String> strings = facilityMap.keySet();
            String str = "";
            for (String key:strings) {
                str = facilityMap.get(key).getInformationFacilityToCsv();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

