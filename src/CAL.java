import java.util.Scanner;
public class CAL {
//bas 3am bi5abirna eno aya project fithin
	public static void main(String[] args) {
		Scanner input = new
Scanner(System.in);
// int= integer char = letter double = decimal nb 
		System.out.println("pick an operation(+,-,*,/");
// hay system.... metil print out 
		char operator = input.next().charAt(0);
// 3rafna sho y3ni operator w loption to input
// men hot charAT la2no char mish int
		System.out.println("enter your first number");
		int int1 = input.nextInt();
// metil hon
		System.out.println("enter your second number");
		int int2 = input.nextInt(); 
		int result ;
// 3rafna eno result hieh integer
		if (operator == '+') {
			result = int1 + int2 ;
		}else if (operator=='-') {
			result = int1 - int2;
		}else if (operator=='*') {
			result =int1 * int2;
		}else if (operator =='/') {
			result = int1/int2;
		}else {
			System.out.println("invalid operation");
			return;
// iza mish men hol l2rba3a reject 
	} System.out.println(result);
		
	}	
}	