
import java.util.Deque;
import java.util.LinkedList;

public class dequeCollection {
    public static void main(String[] args) {
        Deque<String> d=new LinkedList<>();
        d.addLast("hello");
        d.addLast("hi");
        d.addFirst("akchhat");

        System.out.println(d);
    }
}
