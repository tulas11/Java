package TrialError;

public class Trial {

	public static void main(String[] args) {
		String a = "Yash";
		String b = "yash";
		String c= new String("yash"); // New reference in the heap memory.
		String d= new String("Yash");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(b==c); //Hashcode is same, But reference is different as we have created in new String.
		System.out.println(a.equals(c)); // The values are compared. 
		System.out.println(a.hashCode()==c.hashCode());
		System.out.println(a.hashCode()==d.hashCode());
		System.out.println(b.equals(c));

	}

}
