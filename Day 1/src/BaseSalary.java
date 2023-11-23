//Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30% 
import java.util.Scanner;
public class BaseSalary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the salary for a month ");
		int msal = sc.nextInt();
		int ysal=msal*12;
		System.out.println("Yearly salary would become "+ysal);
		if (ysal<150000)
			System.out.println("Tax Free");
		else if (ysal>150000 && ysal<300000)
			System.out.println("Tax amount will be "+((ysal*0.2)+ysal));
		else
			System.out.println("Tax amount will be "+((ysal*0.3)+ysal));
		
		

	}

}
