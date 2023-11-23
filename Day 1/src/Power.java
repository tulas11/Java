//Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
import java.util.Scanner;
public class Power {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Number should be power by: ");
		int power = sc.nextInt();
		int result=1;
		for(int i=1; i<=power; i++) {
			result=result*num;
		}
		System.out.println("Number is "+ num +" Power is "+ power +" Ans: "+ result);
		
		

	}

}
