public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Logowanie za pomoca: " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu to: " + numerIndeksu);
    }

    public void podajAdresEmail(){
        System.out.println("Moj adres email to: " + email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to " + nazwaUczelni);
    }

    public static void druga(){
        System.out.println("Jestem druga metoda");
        infoUczelnia(); // można wywoływać tylko metody statyczne - np. zalogujSie() nie zadziała bo nie jest static.
    }

}
