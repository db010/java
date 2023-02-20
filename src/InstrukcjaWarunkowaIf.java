public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
    int number = -9;
    if(number > 0) {
        System.out.println("Podana liczba jest większa od 0");
    } else if (number < -10) {
        System.out.println("Podana liczba jest mniejsza niz -10");
    } else if (number == 0) {
        System.out.println("Podana liczba jest rowna 0");
    } else {
        System.out.println("Liczba z przedziału 0 do -10");
    }
    }
}
