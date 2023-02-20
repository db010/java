public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;
        boolean fifthValue = 2 > 1; // true

        // && - true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && thirdValue); // true
        System.out.println(secondValue && thirdValue); // false - bo całowść wyrażenia false

        // || - true wtedy gdy jedno wyrażenie składowe jest rowne true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || fourthValue); // false

        // ! negacja - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); // false - bo firstValue było true
        System.out.println(!secondValue); // true - bo secondValue było false
        System.out.println(!(firstValue&&secondValue)); // true bo było wynikiem false.
        System.out.println(!fifthValue); // false
    }
}
