import java.util.Scanner;
public class Atm_Program {
	public static void main(String args[]) {
		Scanner tag = new Scanner(System.in);
		float balance=50000;
		while(true) {
		System.out.println("Enter 1 for withdraw");
		System.out.println("Enter 2 check balance");
		int c=tag.nextInt();
		int d;
		if(c==1)
		{
			System.out.println("Enter how much you want to withdraw =");
			float n=tag.nextFloat();
			if(n<=balance)
			{
				balance=balance-n;
				System.out.println("Withdrawl Syccesfull");
				System.out.println("Want to check balance Enter 1 Otherwise 0");
				d=tag.nextInt();
				if(d==1)
				{
					System.out.println("Your account balance="+balance);
					System.out.println("Thanku for using My ATM");
				}
				else
				{
					System.out.println("Thanku for using my ATM");
				}
			}
			else
			{
				System.out.println("Not have Sufficient Balance");
			}
			
		}
		else if(c==2)
		{
			
			System.out.println("Your account balance="+balance);
			System.out.println("Thanku for using My ATM");
		}
		else {
			System.out.println("Please Enter Correct Input");
		}
		System.out.println();
		System.out.println();
		
	}
	}

}
