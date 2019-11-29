package generateText;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class generator implements generatetext{

    private Hashtable alphabet;
    private String language;
    private ArrayList parameters;
    private Random random;

    public void Generator(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        this.language = language;
        this.parameters = parameters;
    }

    @Override
    public void generateAphabet() {

        String alpha = "";
        for (int i = (int)'ა'; i <=(int)'ჰ'; i++) {
            alpha += (char)i;
        }

        System.out.println(alpha);
//      System.out.println((int)'a');
//      System.out.println((int)'ა');

        alphabet = new Hashtable();
        alphabet.put("en", alphabet('a', 'z'));
        alphabet.put("ge", alphabet('ა', 'ჰ'));
        System.out.println(alphabet.get("en"));
    }

    public String alphabet(char starter, char ender) {
        String alpha = "";
        for (int i = (int)'ა'; i <=(int)'ჰ'; i++) {
            alpha += (char)i;
        }
        return alpha;
    }

    @Override
    public char generateChar() {
        String symbols = alphabet.get("language").toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }

    @Override
    public String generateWord(int min, int max) {
        return null;
    }

    @Override
    public String generateSentence(int min, int max) {
        String word = "";
        int rand = random.nextInt(max-min+1)+min;
        for (int i=0, i<rand; i++) {
            word += generateChar();
        }
        return null;
    }
}
