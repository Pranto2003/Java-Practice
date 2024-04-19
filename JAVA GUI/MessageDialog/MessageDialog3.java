import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class MessageDialog3{
	public static void main(String[] args){
		ImageIcon icon=new ImageIcon("circle-outline-of-small-size-connected-to-arrow-pointing-to-the-right.png");
		
		//5 parameters
		JOptionPane.showMessageDialog(null,"Wrong Password","Warning",2,icon);
	}
}