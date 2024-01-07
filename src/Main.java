import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Frutta> frutti = new LinkedList<>();

        frutti.add(new Frutta("Mela"));
        frutti.add(new Frutta("Pera"));
        frutti.add(new Frutta("Banana"));
        frutti.add(new Frutta("Kiwi"));
        frutti.add(new Frutta("Melone"));

        for(Frutta f : frutti) {
            System.out.println(f);
        }
        frutti.set(0, new Frutta("Mango"));
        frutti.set(4, new Frutta("Ananas"));

        for(Frutta s : frutti) {
            System.out.println(s);
        }
    }
}