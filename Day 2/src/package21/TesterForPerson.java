
package package21;

public class TesterForPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Yash",24,"Mumbai"); //parameterized constructor gets called
		Person p2=new Person(); //default constructor gets called
		
        System.out.println("Initial values:");
        System.out.println("Name: " + p1.getname() + ", Age: " + p1.getage() + ", City: " + p1.getcity());

        // Use setters to modify values
        p1.setname("Yash Tulaskar");
        p1.setage(28);
        p1.setcity("California");

        // Use getters again to display modified values
        System.out.println("\nModified values:");
        System.out.println("Name: " + p1.getname() + ", Age: " + p1.getage() + ", City: " + p1.getcity());

        // Use the display method
        System.out.println("\nUsing display method:");
        p1.display();
	    
	}

}
