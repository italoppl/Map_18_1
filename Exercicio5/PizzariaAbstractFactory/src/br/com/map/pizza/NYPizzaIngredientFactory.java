package br.com.map.pizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozarellaCheese();
	}

	@Override
	public Veggies createVeggies() {
		// TODO Auto-generated method stub
		return new Vegetais();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new PepperoniR();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FrozenClams();
	}

}
