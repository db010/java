public class Switch {
    public static void main(String[] args) {
        String danie = "Pizza";

        switch (danie) {
            case "Danie":
                System.out.println("Cena to 22 zł");
                break;
            case "Losos":
                System.out.println("Cena to 35 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }
    }
}
