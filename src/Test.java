
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
	System.out.println("Enter three numbers: ");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	float b = input.nextFloat();
	float c = input.nextFloat();
	String hexadecimal = Integer.toHexString(a).toUpperCase();
	String binary = Integer.toBinaryString(a);
	String binaryPadded = String.format("%10s", binary).replace(' ', '0');
	System.out.printf("|%-10s|", hexadecimal);
	System.out.printf("%s|", binaryPadded);
	System.out.printf("%10.2f|", b);
	System.out.printf("%-10.3f|", c);
		

	}

}
