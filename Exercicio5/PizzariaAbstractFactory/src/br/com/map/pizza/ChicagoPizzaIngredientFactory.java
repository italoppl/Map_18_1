package br.com.map.pizza;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new RegiannoCheese();
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
		return new FreshClams();
	}

}
