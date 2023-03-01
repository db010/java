public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 12,"ASG");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();

        Footballer footballer = new Footballer("Mike",29,"PSG");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }

}
