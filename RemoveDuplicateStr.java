import java.util.Scanner;

public class RemoveDuplicateStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            if(result.indexOf(str.charAt(i))==-1){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
    
}
