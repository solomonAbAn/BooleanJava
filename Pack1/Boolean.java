package Pack1;


import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime number tester");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int i;
	boolean  isZero = (num == 0 || num <0);
	
		if (isZero) {
			System.out.println(num + " is not prime");
			System.exit(0);
		}
		for(i=2; i<num/2; i++) {
			if(num%i==0) {
				System.out.println(num + " is not Prime");
				System.exit(0);
			}	
			
			
			
		}System.out.println(num + " is prime");
	
	}

}
