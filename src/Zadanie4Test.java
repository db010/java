import java.util.Scanner;
public class Zadanie4Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zadanie4 wynik = new Zadanie4();
        int firstNumber, secondNumber;
        System.out.println("Podaj pierwsza liczbe");
        firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        secondNumber = scanner.nextInt();
        System.out.println("Dodawanie: " + wynik.dodawanie(firstNumber,secondNumber));
        System.out.println("Odejmowanie: " + wynik.odejmowanie(firstNumber,secondNumber));
        System.out.println("Mnożenie: " + wynik.mnozenie(firstNumber,secondNumber));
        System.out.println("Dzielenie: " + wynik.dzielenie(firstNumber,secondNumber));
        System.out.println("Modulo: " + wynik.modulo(firstNumber,secondNumber));
    }
}
