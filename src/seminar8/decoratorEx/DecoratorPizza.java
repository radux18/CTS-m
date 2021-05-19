 package seminar8.decoratorEx;

//Decorator
public abstract class DecoratorPizza extends AbstractPizza {
	//produsDecorat
	protected final AbstractPizza pizza;
	
	public DecoratorPizza(AbstractPizza Pizza){
		this.pizza = Pizza;
	}

	@Override
	public String getIngrediente() {
		return pizza.getIngrediente();
	}

}
