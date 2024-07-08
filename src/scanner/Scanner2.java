package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(("C:\\1\\txt.txt")));


            scanner.useDelimiter("\\W");
           // С помощью метода useDelimiter() вы можете настроить, как сканер будет разделять вводимые данные,
            // что полезно при обработке текстовых файлов, пользовательского ввода и других сценариев.

            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("We have a problem!");
        }
        finally {
            scanner.close();
        }

    }


}

