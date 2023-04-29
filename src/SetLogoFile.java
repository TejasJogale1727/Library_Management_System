
/**
 *
 * @author tejas eknath jogale
 */
import java.awt.Image;
import javax.swing.*;

public class SetLogoFile {
    public void setLogo(JLabel lb, String s){
        String mainFilePath = ".\\Images\\";
        ImageIcon imIco = new ImageIcon(mainFilePath+s);
        Image im = imIco.getImage();
        lb.setIcon(new ImageIcon(im));
    }
}
