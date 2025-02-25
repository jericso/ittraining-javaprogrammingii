package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
/* alternate
import java.nio.file.Files;
*/
import java.io.PrintWriter;
import java.io.IOException;

public class SaveableDictionary {

    private Map<String, String> translator;
    private Map<String, String> backTranslator;
    private String fileName;

    public SaveableDictionary() {
        this.translator = new HashMap<>();
        this.backTranslator = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.fileName = file;
    }

    public void add(String word, String translation) {
        this.translator.putIfAbsent(word, translation);
        this.backTranslator.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        String translation = null;

        translation = this.translator.get(word);
        if (translation != null) {
            return translation;
        } else {
            return this.backTranslator.get(word);
        }
    }

    public void delete(String word) {
        String translation, backTranslation = null;

        translation = this.translator.remove(word);
        if (translation != null) {
            backTranslation = this.backTranslator.remove(translation);
        } else {
            translation = this.backTranslator.remove(word);
            backTranslation = this.translator.remove(translation);
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            
            return true;
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }
   
        /* alternate
        try {
            Files.lines(Paths.get(this.fileName))
                    .map(line -> line.split(":"))
                    .forEach(parts -> {
                        this.add(parts[0], parts[1]);
                    });

            return true;
        } catch (IOException ex) {
            return false;
        }
        */
    }

    public boolean save() {
        try (PrintWriter printWriter = new PrintWriter(this.fileName)) {
            for (String word : this.translator.keySet()) {
                printWriter.println(word + ":" + this.translator.get(word));
            }
            printWriter.close();

            return true;
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }
    }
}
