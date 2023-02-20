public class Tablice {
    public static void main(String[] args) {
        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzien";
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        int[] numbers = new int[] {1,4,6};
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 10;

        System.out.println(winterMonths.length);
        for (int i = 0; i < winterMonths.length; i++){
            System.out.println(winterMonths[i]);
        }
    }
}
