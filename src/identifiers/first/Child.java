package identifiers.first;

public class Child extends Parent {
    // Klasa potomna w tej samej paczce, nie ma dostepu do pol private
    public void testIdentifier(){
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            firstMethod();
            secondMethod();
            thirdMethod();
    }
}
