import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class imageIo {
    public static void main(String[] args) {
        try{
            File f1 = new File("image.png");
            BufferedImage img = ImageIO.read(f1);
            ImageIO.write(img, "png", f1);
        }catch(IOException e){
            e.printStackTrace();
            
        }

        


}
}
