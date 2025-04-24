import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0, "Akchhat");
        System.out.println(list);
    }
    
}
