
import java.util.Scanner;
public class ReverseStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string: "+sb);

    }
}
