package wordlist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        Charset charset = Charset.forName("UTF-8");
        ArrayList<String> wordList = new ArrayList<>();

        try {
            //Reading from the file
            Path filePath = Paths.get("C:\\Users\\shsoni\\IdeaProjects\\WordList\\prideandprejudice.txt");
            BufferedReader reader = Files.newBufferedReader(filePath, charset);
            String line = null;
            // inserting the words into arraylist
            while ((line = reader.readLine()) != null) {
                String[] stringWords = line.split("\\W+");
                for (String word : stringWords )
                {

                        wordList.add(word);

                }

            }

            //counting the times each word exists in the wordlist
            Collections.sort(wordList);
            Map<String, Integer> wordCount = new HashMap<String, Integer>();
            if (wordList != null) {
            for(String w : wordList) {
                Integer count = wordCount.get(w);
                wordCount.put(w, (count==null) ? 1 : count+1);
            }

            //printing a sorted list of words
                wordCount.forEach((key,value)-> System.out.println(key +" : "+ value));
         }
        }


        catch (IOException ex) {
            System.err.format("IOException: ", ex);
        }
    }
}
