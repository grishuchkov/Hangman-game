import java.util.Arrays;
import java.util.HashSet;

public class Word {
    private String word;
    private final char[] wordMeaning;
    private char[] wordMask;
    private HashSet<String> lettersFromUser = new HashSet<>(){{
        add("");
    }};


    public Word(String word) {
        this.word = word;
        wordMeaning = word.toCharArray();
        wordMask = new char[word.length()];
        setWordMask();
    }

    private void setWordMask(){
        int maskSize = word.length();
        for (int i = 0; i < maskSize; i++) {
            wordMask[i] = '_';
        }
    }

    public void printWordMeaning() {
        System.out.println("Исходное слово: " + Arrays.toString(wordMeaning));
    }

    public void printWordMask() {
        System.out.println(Arrays.toString(wordMask));
    }

    public boolean haveLetter(String letter) {
        boolean letterIsConsist = false;

        char charAt = letter.toLowerCase().charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if(wordMeaning[i] == charAt){
                wordMask[i] = charAt;
                letterIsConsist = true;
            }
        }
        return letterIsConsist;
    }

    public boolean isCorrectLetter(String letter){
        return letter.length() == 1;
    }

    public boolean wordIsOpen(){
        return Arrays.toString(wordMeaning).equals(Arrays.toString(wordMask));
    }

    public boolean letterEnteredBefore(String letter) {
        letter = letter.toLowerCase();
        if(lettersFromUser.contains(letter)){
            return true;
        }
        lettersFromUser.add(letter);
        return false;
    }
}
