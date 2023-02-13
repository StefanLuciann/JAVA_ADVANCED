package Homework.ex7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
* HOMEWORK
 * Write a program that will count the occurrences of each word in a text file and then save the results in the form of a table in a new file*/
public class Main {
    public static void main(String[] args) throws IOException {
        File file =new File("D:\\Java\\JAVA_ADVANCE\\Files\\Exemplu");
        Map<String ,Integer> occurencesOfWord = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;
            while((line = bufferedReader.readLine())!=null){
                for (String word : line.split(" ")) {
                    if(!occurencesOfWord.containsKey(word)){
                        occurencesOfWord.put(word,1);
                    }else{
                        int value = occurencesOfWord.get(word);
                        occurencesOfWord.put(word,value+1);
                    }
                }
            }
        }
        System.out.println(occurencesOfWord);
    }

}



