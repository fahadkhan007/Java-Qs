import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> name=new LinkedList<>();
        name.add("hello");
        name.add("hi");
        name.add("hola");
        name.addFirst("Akchhat");
        name.addLast("fahad");
        for(String s : name){
            System.out.println(s);
        }

    }
}
