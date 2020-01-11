import java.util.Scanner;

public class UserInput {
	
	Scanner input = new Scanner(System.in);
	
	public int inputInt() {
		return input.nextInt();
	}
	public double inputDouble() {
		return input.nextDouble();
	}
	public String inputString() {
		return input.next();
	}
	
	
	
}
