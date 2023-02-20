public class For {
    public static void main(String[] args) {
        int number = 100;
        // i specjalna zmienna sterujaca, krok przejscia 2
        for(int i = 0; i < number;i=i+2){
            System.out.println(i);
        }
        // i specjalan zmienna sterujaca
        for(int i = 0; i < number;i++){
            if(i%5==0)
                System.out.println(i);
        }
        for(int j = 0; j < number;j++){
            System.out.println(j);
        }
    }
}
