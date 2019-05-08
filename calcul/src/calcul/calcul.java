package calcul;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		System.out.print("Input a: ");
		a=sc.nextInt();
		System.out.print("Input b: ");
		b=sc.nextInt();
		SimpleCalculator c = new SimpleCalculator();
		
		try {
			int n;
			System.out.println("press 1 to add, press 2 to subtract");
			n=sc.nextInt();
			if(n==1) {
				c.add(a,b);
			}
			else if(n==2) {
				c.subtract(a, b);
			}
			c.getResult();
				
		}catch(AddZeroException e){
			System.out.println("AddZeroException");
		}
		catch(SubtractZeroException e) {
			System.out.println("SubtractZeroException");
		}
		catch(OutOfRangeException e) {
			System.out.println("OutOfRangeException");
		}
		sc.close();
	}
}