import java.util.Scanner;
public class NotRepeatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            boolean found=false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    found=true;
                    break;
                }
                    
            }
            if(!found){
                System.out.println("The first non-repeating character in the string is: "+str.charAt(i));
                return;
            }
        }
    }
}
