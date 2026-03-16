package M1Questions.KeyGeneration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {

            String str = sc.nextLine();

            // Validation
            if(str == null || str.length() == 0) {
                System.out.println("Invalid Input (empty string)");
                continue;
            }

            if(str.length() < 6) {
                System.out.println("Invalid Input (length < 6)");
                continue;
            }

            if(str.contains(" ")) {
                System.out.println("Invalid Input (contains space)");
                continue;
            }

            if(str.matches(".*\\d.*")) {
                System.out.println("Invalid Input (contains digits)");
                continue;
            }

            if(!str.matches("[a-zA-Z]+")) {
                System.out.println("Invalid Input (contains special character)");
                continue;
            }

            // Key generation
            String key = generateKey(str);
            System.out.println("The generated key is - " + key);
        }
    }

    static String generateKey(String str) {

        // Step 1: lowercase
        str = str.toLowerCase();

        // Step 2: remove even ASCII characters
        StringBuilder filtered = new StringBuilder();

        for(char c : str.toCharArray()) {
            if((int)c % 2 != 0) {
                filtered.append(c);
            }
        }

        // Step 3: reverse
        filtered.reverse();

        // Step 4: uppercase characters at even index
        for(int i = 0; i < filtered.length(); i++) {
            if(i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }
}