public class FinalTest {

    public static void main(String[] args) {
        final int x = 2; // nie mozna zmienic juz tej wartosci
        final Person person = new Person("Tom",23);
        person.age = 25; // istniejacy obiekt mozemy edytowac, ale nie mozemy sworzyc nowej osoby.

    }
}
