import java.util.Scanner;
public class PalindromeStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("The string is a palindrome.");
        
        }else{
            System.out.println("the string is not a palindrome.");
        }
    }
}


