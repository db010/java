import java.util.Scanner;

public class PlacZabawCheck {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numerKota = 0;
                PlacZabaw[] listaKotow = new PlacZabaw[3];
                PlacZabaw kot = new PlacZabaw();
                int koniec = 0;
                do {
                        System.out.println("Podaj imie kota");
                        String imie = scanner.next();
                        kot.imie = imie;
                        System.out.println("Podaj kolor kota");
                        String kolor = scanner.next();
                        kot.kolor = kolor;
                        System.out.println("Podaj wiek kota");
                        int wiek = scanner.nextInt();
                        kot.wiek = wiek;
                        System.out.println("Czy dodac nowego kota?");
                        koniec = scanner.nextInt();
                        System.out.println(koniec);
                        numerKota++;
                        for(int i = 0; i < numerKota;i++){
                                listaKotow[i] = kot;
                                System.out.println("KOT DODANY");
                                listaKotow[i].opisKota();
                        }
                } while (koniec != 1);
                System.out.println(koniec);
                /*for(int i = 0; i < listaKotow.length; i++){
                        listaKotow[i].opisKota();
                }*/
        }
}
