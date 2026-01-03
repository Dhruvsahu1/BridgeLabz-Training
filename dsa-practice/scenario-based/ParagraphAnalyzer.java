import java.util.Scanner;

public class ParagraphAnalyzer {
    public int countWords(String paragraph){
        String words[] = paragraph.split(" ");
        return words.length;
    }
    public String getLongestWord(String paragraph){
        String words[] = paragraph.split(" ");
        String LongestWord = "";
        for(String word: words){
            if(word.length()>LongestWord.length()){
                LongestWord = word;
            }
        }
        return LongestWord;
    }
    public String replaceSameOccurenceWord(String paragraph, String oldWord, String newWord) {

    if (paragraph == null || oldWord == null || newWord == null) {
        return paragraph;
    }

    StringBuilder sb = new StringBuilder();
    String[] words = paragraph.split(" ");

    for (int i = 0; i < words.length; i++) {
        if (words[i].equals(oldWord)) {
            words[i] = newWord;
        }

        sb.append(words[i]);

        if (i < words.length - 1) {
            sb.append(" ");
        }
    }

    return sb.toString();
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the paragraph: ");
        String paragraph = sc.nextLine();
        if(paragraph.isEmpty()){
            System.out.println("paragraph is empty!");
        }
        if(paragraph.trim().isEmpty()){
            System.out.println("paragraph only have spaces!");
        }
        ParagraphAnalyzer pa = new ParagraphAnalyzer();
        System.out.println("Total words in this paragraph: "+pa.countWords(paragraph));
        System.out.println("Longest word in this paragraph: "+pa.getLongestWord(paragraph));
        System.out.println("please enter the word that you want to be replaced: ");
        String oldWord = sc.nextLine();
        System.out.println("please enter the new word: ");
        String newWord = sc.nextLine();
        
        System.out.println("updated text: "+pa.replaceSameOccurenceWord(paragraph,oldWord,newWord));
    }
}
