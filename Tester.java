public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        r.populateCars(32);
        r.populatePeople(32);
        r.move();
        r.move();
        r.move();
        r.move();
        r.move();
        r.move();
        r.move();
        r.move();
        r.move();

        System.out.println(r.toString());
    }
}
