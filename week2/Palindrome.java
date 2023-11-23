package assignments.week2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int input=num;
		int rev=0;
		while(num!=0) {
			rev = rev*10+num%10;
			num=num/10;
		}
		if (input==rev) {
			System.out.println("Number is a palindrome "+num);
			System.out.println("Number is Palindrome "+rev);
			System.out.println("Number is Palindrome "+input);
		}
		else
		{
			System.out.println("Number is not Palindrome "+rev);
			System.out.println("Number is not Palindrome "+input);

		}
	}
}