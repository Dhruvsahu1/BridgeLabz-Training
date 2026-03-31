package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static boolean checkReverse(String a , String b) {
        if(a.length()!=b.length()) {
            return false;
        }
        for(int i = a.length()-1;i>=0;i--) {
            if(a.charAt(i)!=b.charAt(a.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word ");
        String first_word = sc.nextLine().toLowerCase();
        String checkFirst[] = first_word.split(" ");
        if(checkFirst.length>1) {
            System.out.println(first_word+" is an invalid word");
        }
        else {
            System.out.println("Enter the second word ");
            String second_word = sc.nextLine().toLowerCase();
            String checkSecond[] = second_word.split(" ");
            if(checkSecond.length>1) {
                System.out.println(second_word+" is an invalid word");
            }
            else {
                if(checkReverse(first_word,second_word)) {
                    StringBuilder sb = new StringBuilder();
                    String word = first_word.toLowerCase();
                    String vowel = "aeiou";
                    for(int i =0;i<word.length();i++) {
                        if(vowel.contains(String.valueOf(word.charAt(i)))) {
                            sb.append("@");
                        }else {
                            sb.append(word.charAt(i));
                        }
                    }
                    System.out.println(sb.reverse().toString());
                }
                else{
                    String concatedString = (first_word+second_word).toUpperCase();
                    String vowelUpper = "AEIOU";
                    int vowelCount = 0;
                    int consonantsCount = 0;

                    for(int i=0;i<concatedString.length();i++) {
                        char ch = concatedString.charAt(i);
                        if(vowelUpper.contains(String.valueOf(ch))) {
                            vowelCount++;
                        } else if(Character.isLetter(ch)) {
                            consonantsCount++;
                        }
                    }

                    if(vowelCount > consonantsCount) {
                        String res = "";
                        Set<Character> st = new HashSet<Character>();

                        for(int i = 0; i < concatedString.length(); i++) {
                            char ch = concatedString.charAt(i);

                            if(vowelUpper.contains(String.valueOf(ch)) && !st.contains(ch)) {
                                st.add(ch);
                                res += ch;
                            }

                            if(res.length() == 2) {
                                System.out.println(res);
                                break;
                            }
                        }
                    }

                    else if(consonantsCount > vowelCount) {
                        String res = "";
                        Set<Character> st = new HashSet<Character>();

                        for(int i = 0; i < concatedString.length(); i++) {
                            char ch = concatedString.charAt(i);

                            if(!vowelUpper.contains(String.valueOf(ch)) && Character.isLetter(ch) && !st.contains(ch)) {
                                st.add(ch);
                                res += ch;
                            }

                            if(res.length() == 2) {
                                System.out.println(res);
                                break;
                            }
                        }
                    }

                    else {
                        System.out.println("Vowels and consonants are equal");
                    }
                }
            }
        }
    }
}
