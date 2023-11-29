//2.1:Create Show room application for Vehicle management
//2.2:create a class with data members(id,name,color,price)
//2.3 create constructor to initialize data member
//2.4 add discount as static data member in Vehicle class 
//2.5 use static block to assign.
//2.6 create getter setter and override  toString()(hint:show discount)
//2.7 create tester class....create array to store 10 vehicle...create menu driven program 
//1:show all
//2:add vehicle...
//3:edit color
//4:edit price 
//5:remove 
package BusinessLogic;

public class vehicle {
	public int id; // How to make it private and still use it
	private String name;
	private String colour;
	private int price;
	private static int discount;

	public vehicle() {
//		super();
		this.id = 1;
		this.name = "Ferrari";
		this.colour = "MatteBlack";
		this.price = 1000000;
	}

	static {
		discount = 10000;
	}

	public vehicle(int id, String name, String colour, int price) {
//		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return (" id"+id+" name"+name+" colour"+colour+" price"+price+" discount"+discount);
	}

	public boolean check(int id) {
		// TODO Auto-generated method stub
		return (this.id==id);
	}

}
