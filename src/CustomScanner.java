import java.util.Scanner;

public class CustomScanner {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    }
    */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwsza liczbe");
    int firstNumber= scanner.nextInt();
    System.out.println(firstNumber*firstNumber);
}
}
