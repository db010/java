import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int ageCheck = scanner.nextInt();
        if(ageCheck < 18) {
            System.out.println("Nie możesz kupić alkoholu");
        } else {
            System.out.println("Dziękujemy za zakupy");
        }
    }
}

