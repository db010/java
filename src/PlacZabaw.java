public class PlacZabaw {
    public static void main(String[] args) {
        int[] number = new int[] {5, 8 ,10};
        for(int i = 0; i < number.length/2; i++){
            int temp = number[i];
            number[i] = number[number.length-1-i];
            number[number.length-1-i] = temp;
        }
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
