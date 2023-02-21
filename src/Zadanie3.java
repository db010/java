public class Zadanie3 {
    public static void main(String[] args) {
        /*int number = 100;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 3");
            }
        }*/
        int[] liczby = new int[]{1, 2, 3, 4, 5}; //
        for (int i = 0; i < (liczby.length-1); i++) {
            int temp = liczby[i]; // temp 0 -> 1;
            liczby[i] = liczby[liczby.length - 1 - i];
            liczby[liczby.length - 1 - i] = temp;
        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("liczby[" + i + "] - " + liczby[i]);
        }
    }
}
/*
START int[]{1, 2, 3, 4, 5};

i[0] = 1
i[0] = i[5-1=4] - 5
i[4] = 1
            START int[]{5, 2, 3, 4, 1};

i[1] = 2
i[1] = i[5-2=3] = 4
i[3] = 2
        int[]{5, 4, 3, 2, 1};

i[2] = 3
i[2] = i[5-3=2] = 3
i[2] = 3
        int[]{5, 4, 3, 2, 1};

i[3] = 2
i[3] = i[5-4=1] =
i[1] =
        int[]{5, 2, 3, 4, 1};
*/


