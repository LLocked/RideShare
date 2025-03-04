public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.toString());
        r.populateCars(5);
        









        Person a = new Person(4, 6);
        Person b = new Person(2, 3);
        Person c = new Person(7, 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Car n = new Car(5,9);
        System.out.println(n);
        n.addPassenger(a);
        System.out.println(n);

    }
}
