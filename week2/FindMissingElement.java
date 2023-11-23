package assignments.week2;			

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int missingElement[]={1, 4,3,2,8, 6, 7}; // 1,2,3,4,6,7,8
		Arrays.sort(missingElement);
		for (int i = 0; i < missingElement.length; i++) {
			if (missingElement[i]!=i+1) { // mis[1]!=1+1 , 1!=1,
				System.out.println(i+1);
				break;
			}

		}

	}

}
