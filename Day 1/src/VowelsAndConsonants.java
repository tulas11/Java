//Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)
import java.util.Scanner;
public class VowelsAndConsonants {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char check = sc.next().charAt(0);
		if (check=='a' || check=='e' || check=='i' || check=='o' || check=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");	
	}

}
