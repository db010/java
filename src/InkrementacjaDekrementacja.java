public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++; // inkrementacja - pierwsze przypisanie b = a potem zwiększenie a
        System.out.println("Wartość a: " + a); // 1
        System.out.println("Wartość b: " + b); // 0
        int c = ++a; // preinkrementacja - pierwsza a potem przypisanie c do a
        System.out.println("Wartość c: " + c); // 2
        System.out.println("Wartość a: " + a); // 2

        int d = 0;
        System.out.println("Wartość d: " + d);
        int e = d--; // dekrementacja
        System.out.println("Wartość d: " + d);
        System.out.println("Wartość e: " + e);
        int f = --d; // predekrementacja
        System.out.println("Wartość d: " + d);
        System.out.println("Wartość f: " + f);
    }
}
