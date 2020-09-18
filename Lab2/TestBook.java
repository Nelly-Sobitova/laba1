package Lab2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book( " Унесенные призраками"," Маргарет Митчелл", 560, 788 );
        Book d2 = new Book( " Идиот", " Федор Достоевский", 455 ,600 );
        Book d3 = new Book(" Война и Мир", "Лев Толстой", 599, 896 );
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}