package InOut.IO.ex1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * #### IO Exercise 1
 * Create a file with a „lorem ipsum" paragraph within – it can be done by copy-pasting existing paragraph or generating it dynamically using Java library.
 * - Read that file.
 * - Count words.
 * - *Count special signs (like comma, dot, spaces).
 * - *Select one word and print it's number of occurrences.
 *
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java\\JAVA_ADVANCE\\Files\\fileTxt");
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
        occurencesByWordCounter(occurencesOfWord);
    }
    private static void occurencesByWordCounter(Map<String,Integer> occurencesOfWord){
        System.out.println(occurencesOfWord.get("accident,")!=null ? occurencesOfWord.get("accident,"):0);}

}
