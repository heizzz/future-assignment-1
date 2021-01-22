package future.assignment;
import java.util.Scanner;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Capitalization capitalization = new Capitalization();
        Scanner sc= new Scanner(System.in);
        String test= sc.nextLine();
        capitalization.capitalizeWithLib2(test);
        capitalization.capitalizeWithoutLib2(test);
    }
}