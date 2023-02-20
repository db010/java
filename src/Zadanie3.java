public class Zadanie3 {
    public static void main(String[] args) {
        /*int number = 100;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 3");
            }
        }*/
        int[] liczby = new int[]{1, 3, 5, 7, 9}; //
        for (int i = 0; i < (liczby.length/2); i++) {
            int temp = liczby[i]; // temp 0 -> 1;
            liczby[i] = liczby[liczby.length - 1 - i];
            liczby[liczby.length - 1 - i] = temp;
        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("liczby[" + i + "] - " + liczby[i]);
        }
    }
}





