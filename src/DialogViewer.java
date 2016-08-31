import javax.swing.JOptionPane;

public class DialogViewer
{
	public static void main(String[] args)
	{

		String myName = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showInputDialog("Hello, World and "+myName+"!\nWhat would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, "+myName+ " I'm afraid I can't do that.");	}
}