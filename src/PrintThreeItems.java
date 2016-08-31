import java.util.Scanner;

public class PrintThreeItems {

	public static void main(String[] args) {

		String firstName, secondName, thirdName;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Name your three best friends: ");
		
		firstName = in.nextLine();
		secondName = in.nextLine();
		thirdName = in.nextLine();
		
		System.out.println("\nYour three best friends are: \n" + firstName + "\n" + secondName + "\n" + thirdName);

		in.close();
	}

}
