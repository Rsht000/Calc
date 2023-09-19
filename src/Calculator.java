import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static String[] tokens;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {

                String zed = scanner.nextLine();
                tokens = zed.split(" ");
                if (tokens.length != 3) throw new Exception("Error symbol !=3 ");

                Pattern pro = Pattern.compile("[A-Z]+");
                Matcher mat = pro.matcher(zed);
                String oper = tokens[1];

                if (mat.find()) {
                    System.out.println(ResultRoma.intRoman(Op.calc(
                            RomaToArabic.romanNumbers(tokens[0]),
                            RomaToArabic.romanNumbers(tokens[2]), oper)));
                } else {
                    System.out.println(Op.calc(Integer.parseInt(tokens[0]),
                            Integer.parseInt(tokens[2]), oper));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


