package identifiers.second;

import identifiers.first.Parent;

public class Random {
    // Klasa w tej samej paczce, nie ma dostepu do pol/metod private, protected oraz default.

    Parent parent = new Parent();
    public void testIdentifier(){
        System.out.println(parent.first);
        parent.firstMethod();
    }
}
