package InOut.NIO.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * ##### IO Exercise 2
 * Write a Java program to find the longest word in a text file.*/
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java\\JAVA_ADVANCE\\Files\\fileTxt");
        List<String> lines = Files.readAllLines(path);
        String longestWord = "";
        for(String line : lines){
            for (String word : line.split(" ")) {
                if(word.length()> longestWord.length()){
                    longestWord = word;
                }

            }

        }
        System.out.println(longestWord);
    }
}
