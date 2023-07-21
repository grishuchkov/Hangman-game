import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Dictionary {
    private final static int MIN_NUMBER_LETTERS = 5;
    private final static int MAX_NUMBER_LETTERS = 10;

    private final List<String> wordDictionary = new ArrayList<>();

    private InputStream file = Dictionary.class.getResourceAsStream("dictionary.txt");
    private List<String> listWords = new BufferedReader(new InputStreamReader(file, StandardCharsets.UTF_8))
            .lines().collect(Collectors.toList());

    public Dictionary(){
        setDictionary(listWords);
    }

    private void setDictionary(List<String> wordsArray){
        for (int i = 0; i < wordsArray.size(); i++) {
            String word = wordsArray.get(i);
            if(word.length() < MIN_NUMBER_LETTERS){
                continue;
            }
            if(word.length() > MAX_NUMBER_LETTERS){
                continue;
            }
            if(word.contains("-")){
                continue;
            }
            wordDictionary.add(word);
        }
    }

    public String getRandomWord(){
        int dictionarySize = wordDictionary.size();
        int indexOfRandomWord = ThreadLocalRandom.current().nextInt(0, dictionarySize + 1);
        return wordDictionary.get(indexOfRandomWord);
    }
}
