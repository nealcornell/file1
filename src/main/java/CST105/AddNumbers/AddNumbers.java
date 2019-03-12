package CST105.AddNumbers;

//import java.util.scanner;

public class AddNumbers {
	
//	static Scanner scannerForKim = new Scanner(System.in);

	public static void main(String[] args) {
	int num1 = 2;
	int num2 = 15;
	int num3 = 9;
	int num4 = addEm(num1, num2, num3);
	int num5 = subtractEm(num3, num1);
		System.out.println("The sum of " + num1 + " and " + num2 + " and " + num3 + " is " + num4 + "."); 
		System.out.println("The difference of " + num3 + " and " + num1 + " is " + num5 + "."); 
		
	}
	private static int addEm(int num1, int num2, int num3) {
		int result;
		result = num1 + num2 + num3;
		return result;
	}
	
	private static int subtractEm(int num3, int num1) {	
		int result;
		result = num3 - num1;
		return result;

	}

}
