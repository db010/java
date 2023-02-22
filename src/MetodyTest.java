public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int wynik = metody.pobierzWynik();
        System.out.println("Wynik to " + wynik);
        metody.policzWynikParam(10);
        metody.add(2,3);
    }
}
