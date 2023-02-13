package Lambda.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
 * them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
 * - Input: Pesho Gosho Adasha
 * - Output:
 *   - Pesho
 *   - Gosho
 *   - Adasha*/
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java\\JAVA_ADVANCE\\Files\\fileTxt");
        List<String> lines = Files.readAllLines(path);

        List<String> words = new ArrayList<>();
        for(String line : lines){
            for (String word : line.split(" ")) {
                words.add(word);
            }
        }
        printWords(
                words,
                word -> System.out.println(word),
                word-> !word.isBlank(),
                ()-> "-",
                word -> word.toUpperCase()
        );
                printWords(
                words,
                word -> System.err.println(word),
                        word-> word.length()>10,
                        ()->"***",
                        word->word.toLowerCase()

        );
    }
    public static void printWords(
            List<String> words,
            Consumer<String> consumer,
            Predicate<String> predicate,
            Supplier<String> supplier,
            Function<String, String> function
    ){
        for(String word: words) {
            if (predicate.test(word)) {
            String newWord =function.apply(word);
                consumer.accept(supplier.get()+newWord);
            }
        }
    }
}
