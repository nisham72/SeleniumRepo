package assignments.week2;

public class IsPrime {

	public static void main(String[] args)
	{
		int num=13;
		int count=0;
		if (num==2) {
			System.out.println("Number is a prime number " +count);
		}else
			for(int i=2; i< num;i++) {
				if(num % i == 0) {
					count++;
					System.out.println("Numebrnn" +count);
				}
			}

		if(count == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");

		}
}
}