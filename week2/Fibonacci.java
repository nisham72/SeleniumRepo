package assignments.week2;

public class Fibonacci {

	public static void main(String[] args) {

	int inputRange=8,n1=0,n2=1;
	for(int i=1;i<=inputRange;++i) {
		System.out.println(n1+"");
		
		int sum=n1+n2;
		n1=n2;
		n2=sum;
	}
	}

}
