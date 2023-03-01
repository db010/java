public class ReadOnly {

    // getName = pobiera wartosc z pola prywatnego, setName = ustawia wartosci pola prywatnego
    private String name = "Damian";

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
