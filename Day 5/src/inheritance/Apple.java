package inheritance;

public class Apple extends Fruit {

	public Apple(String colour, double weight, String name, Boolean fresh) {
		super(colour, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return ("Sweet n Sour");
	}

	public String jam() {
		return ("This is jam of" + getName());
	}

}
