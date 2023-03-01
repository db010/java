import org.w3c.dom.ls.LSOutput;

public class App {
    public String name;
    public App(String name){
        this.name = name;
    }
    public void appInfo(){
        System.out.println("Nazwa aplikacji to " + name);
    }
}
