package seminar8.decoratorEx;

//DecoratorConcretA
public class DecoratorPizzaTaraneasca extends DecoratorPizza {

	public DecoratorPizzaTaraneasca(AbstractPizza pizza){
		super(pizza);
	}
	
	@Override
	public String getIngrediente(){
		return super.getIngrediente() + ", porumb";
	}
}
