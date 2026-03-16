package M1Questions.DynamicTemplateProcessor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {

            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();

            int index = 0;

            while(index < line.length()) {

                int start = line.indexOf("${", index);

                if(start == -1) {
                    result.append(line.substring(index));
                    break;
                }

                result.append(line.substring(index, start));

                int end = line.indexOf("}", start);

                if(end == -1) {
                    result.append("INVALID");
                    break;
                }

                String placeholder = line.substring(start + 2, end);
                String replacement = processPlaceholder(placeholder);

                result.append(replacement);

                index = end + 1;
            }

            System.out.println(result.toString());
        }
    }

    static String processPlaceholder(String placeholder) {

        String[] parts = placeholder.split(":");

        if(parts.length != 2)
            return "INVALID";

        String type = parts[0];
        String value = parts[1];

        switch(type) {

            case "UPPER":
                return value.toUpperCase();

            case "LOWER":
                return value.toLowerCase();

            case "DATE":
                return convertDate(value);

            case "REPEAT":
                return repeat(value);

            default:
                return "INVALID";
        }
    }

    static String convertDate(String date) {

        try {

            String[] parts = date.split("-");

            if(parts.length != 3)
                return "INVALID";

            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if(day < 1 || day > 31 || month < 1 || month > 12)
                return "INVALID";

            return year + "/" +
                    String.format("%02d", month) + "/" +
                    String.format("%02d", day);

        } catch(Exception e) {
            return "INVALID";
        }
    }

    static String repeat(String value) {

        try {

            String[] parts = value.split(",");

            if(parts.length != 2)
                return "INVALID";

            String word = parts[0];
            int count = Integer.parseInt(parts[1]);

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < count; i++)
                sb.append(word);

            return sb.toString();

        } catch(Exception e) {
            return "INVALID";
        }
    }
}