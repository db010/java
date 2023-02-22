public class User {

    public String userName;
    public String password;
    public User(){
        System.out.println("Pusty konstruktor");
    }
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        System.out.println("Hello z konstruktora");
    }

    public void sayHello(){
        System.out.println("Cześć, " + userName);
    }
}
