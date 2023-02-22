public class StudentCheck {
    public static void main(String[] args) {
        Student user1 = new Student();
        user1.imie = "Damian";
        user1.nazwisko = "Barcik";
        user1.nick = "Dymek";
        user1.email = "barcikdamian@gmail.com";
        user1.numerIndeksu = 11111;

        Student user2 = new Student();
        user2.imie = "Marta";
        user2.nazwisko = "Trojner-Barcik";
        user2.nick = "Martusza";
        user2.email = "martatrojner@gmail.com";
        user2.numerIndeksu = 22222;

        Student user3 = new Student();
        user3.imie = "Maksymilian";
        user3.nazwisko = "Barcik";
        user3.nick = "Maks";
        user3.email = "maks@gmail.com";
        user3.numerIndeksu = 33333;

        Student[] studenci = new Student[3];
        studenci[0] = user1;
        studenci[1] = user2;
        studenci[2] = user3;

        for (int i = 0; i < studenci.length; i++){
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajAdresEmail();
        }

    }
}

