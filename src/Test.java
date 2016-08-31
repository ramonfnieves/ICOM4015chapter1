import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL("http://www.obalearn.com/wp-content/uploads/2014/06/Bienvenido.png");
		
		JOptionPane.showMessageDialog(null, "Welcomo to ICOM4015", "Hello", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}