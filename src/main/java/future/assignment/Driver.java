package future.assignment;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Capitalization capitalization = new Capitalization();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        capitalization.capitalizeWithoutLib1(text);
    }
}