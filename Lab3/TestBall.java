package Lab3;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball (40,90);
        Ball b2 = new Ball (180,90);
        Ball b3 = new Ball (145,89);
        Ball b4 = new Ball (100,100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move (15,20);
        b2.move (35,40);
        b3.move (19,90);
        b4.move (50,64);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}