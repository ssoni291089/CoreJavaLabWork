package wordlist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

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
                   if(!wordList.contains(word))
                   {
                      wordList.add(word);
                   }
               }

           }
           //printing a sorted list of words
           if (wordList != null) {
               Collections.sort(wordList);
               for(String w : wordList){
               System.out.println(w);
           }
       }
       }


       catch (IOException ex) {
           System.err.format("IOException: ", ex);
       }
}
}
