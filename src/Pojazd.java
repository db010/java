public class Pojazd {

    public String marka,model;
    public int rok, przebieg;
    public Pojazd(){}
    public Pojazd(String marka, String model,int rok,int przebieg){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        System.out.println("Twój pojazd to " + marka + " " + model + " " + rok + " " + przebieg);
    }
}

