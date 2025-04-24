
import java.util.Stack;

public class stackCollection {
    public static void main(String[] args) {
        Stack<Integer> data=new Stack<>();
        data.push(3);
        data.push(7);
        data.push(6);
        data.push(5);
        System.out.println(data);
        System.out.println(data.pop());
        System.out.println(data.peek());
        
        

    }
}
