import java.util.Scanner;

public class TextFormatter{
    public String Formatter(String s){
        s.trim();
        if(s== null || s.length()==0){
            return "";
        }
        boolean isCapitalized = true;
        boolean spaceAllowed = false;

        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(isCapitalized){
                    sb.append(Character.toUpperCase(ch));
                    isCapitalized = false;
                }else{
                    sb.append(Character.toLowerCase(ch));
                }
                spaceAllowed = true;
            }
            else if(ch == ' ' && spaceAllowed){
                sb.append(' ');
                spaceAllowed = false;
            }
            else if(ch == '!'||ch=='?'||ch=='.'){
                sb.append(ch);
                sb.append(' ');
                isCapitalized = true;
                spaceAllowed = false;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Paragraph that is expected to be formatted: ");
        String paragraph = sc.nextLine();
        TextFormatter tf = new TextFormatter();
        System.out.println("formatted Paragraph: "+ tf.Formatter(paragraph));
    }
}