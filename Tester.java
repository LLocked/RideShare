public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        r.populateCars(32);
        r.populatePeople(32);
        for(int i = 0;i<32;i++){
            r.move();
        }
        System.out.println(r.toString());
    }
}
