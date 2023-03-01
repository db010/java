package identifiers.first;

public class Random {
    // Klasa w tej samej paczce, nie ma dostepu do pol/metod private

    Parent parent = new Parent();
    public void testIdentifier(){
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
    }
}
