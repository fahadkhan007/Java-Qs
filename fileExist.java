import java.io.File;

public class fileExist {
    public static void main(String[] args) {
        File f1 = new File("abc.txt");
        if(f1.exists()){
            System.out.println("File exists: "+f1.getAbsolutePath());
        }else{
            System.out.println("File does not exist");
        }
    }
}