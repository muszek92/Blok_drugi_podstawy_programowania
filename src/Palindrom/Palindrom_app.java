package Palindrom;

import java.util.Scanner;

public class Palindrom_app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Program sprawdzający palindromy  -----");
        System.out.println();
        System.out.println("Podaj słowo lub zdanie: ");
        String inputString = scanner.next();

        String revertString = new StringBuilder(inputString).reverse().toString();
        if (inputString.equalsIgnoreCase(revertString)){ // IgnoreCase - ignoruj spacje
            System.out.println("Ciąg znaków jest palindromem");
        }else {
            System.out.println("Ciąg znaków nie jest palindromem");
        }
    }
}
