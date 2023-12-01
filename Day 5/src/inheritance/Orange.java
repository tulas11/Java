package inheritance;

public class Orange extends Fruit {
	
	public Orange(String colour, double weight, String name, Boolean fresh) {
		super(colour, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		return ("Citrus");
	}
	public String juice() {
		return ("This is juice of"+getName());
	}
}
