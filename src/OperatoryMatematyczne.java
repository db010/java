// umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber/secondNumber; // 0,66
        int mod = secondNumber%firstNumber; // 4 mieści się w 6 1, 2

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynika odejmowania " + substraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynika dzielenia " + division);
        System.out.println("Wynika modulo " + mod);

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber;
        System.out.println(("Po odejmowaniu " + firstNumber));
        firstNumber*=secondNumber;
        System.out.println(("Po mnożeniu " + firstNumber));
        firstNumber/=thirdNumber;
        System.out.println(("Po dzieleniu " + firstNumber));
        firstNumber%=secondNumber;
        System.out.println("Modulo " + firstNumber);
    }
}
