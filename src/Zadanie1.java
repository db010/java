import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int b = scanner.nextInt();

        System.out.println("Wynik dodawania a + b = " + (a+b) );
        System.out.println("Wynik odejmowania a - b = " + (a-b) );
        System.out.println("Wynik mnotażenia  a * b = " + (a*b) );
        System.out.println("Wynik dodawania a / b = " + (a/b) );
        System.out.println("Wynik modula a z b = " + (a%b) );
    }
}
