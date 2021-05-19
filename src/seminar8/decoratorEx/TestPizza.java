package seminar8.decoratorEx;

public class TestPizza {
	public static void main(String[] args) {
		//clasa de baza ce urmeaza a fi decorata
		PizzaSimpla pizzaSimpla = new PizzaSimpla("Simpla", 10);

		DecoratorPizzaTaraneasca pizzaTaraneasca = new DecoratorPizzaTaraneasca(pizzaSimpla);
		DecoratorPizzaExotica pizzaExotica = new DecoratorPizzaExotica(pizzaSimpla);
		
		System.out.println(pizzaSimpla.getIngrediente());
		System.out.println(pizzaTaraneasca.getIngrediente());
		System.out.println(pizzaExotica.getIngrediente());

		System.out.println(pizzaSimpla.getIngrediente());
		
		//decorare pizza prin adaugare sunca la lista de ingrediente
		DecoratorPizza simpleWithHam= new DecoratorPizza(pizzaSimpla) {
					@Override
					public String getIngrediente(){
						return this.pizza.getIngrediente() + " cu Sunca";
					}
				};
		System.out.println(simpleWithHam.getIngrediente());
	}

}
