import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=n+m;
        System.out.println(sum);
        sc.close();
    }
}
