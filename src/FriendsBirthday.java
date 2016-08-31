import javax.swing.JOptionPane;

public class FriendsBirthday {

	public static void main(String[] args) {

		String firstFriend = JOptionPane.showInputDialog("Enter first friend name: ");
		String firstFriendBday = JOptionPane.showInputDialog("Enter "+firstFriend+" birthday:");
		
		String secondFriend = JOptionPane.showInputDialog("Enter second friend name: ");
		String secondFriendBday = JOptionPane.showInputDialog("Enter "+secondFriend+" birthday:");
		
		String thirdFriend = JOptionPane.showInputDialog("Enter third friend name: ");
		String thirdFriendBday = JOptionPane.showInputDialog("Enter "+thirdFriend+" birthday:");
		
		JOptionPane.showMessageDialog(null, "Your friend Bday are:\n"+firstFriend+"\t\t\t"+firstFriendBday
						+"\n"+secondFriend+"\t\t\t"+secondFriendBday
						+"\n"+thirdFriend+"\t\t\taaeefr"+thirdFriendBday);	}

}
