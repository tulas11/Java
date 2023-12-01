package inheritance;

public class Mango extends Fruit {
	
	public Mango(String colour, double weight, String name, Boolean fresh) {
		super(colour, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		return ("Sweet");
	}
	public String pulp() {
		return ("This is pulp of"+getName());
	}
}
