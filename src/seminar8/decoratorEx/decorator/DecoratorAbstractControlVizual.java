package seminar8.decoratorEx.decorator;

public abstract class DecoratorAbstractControlVizual extends AbstractControlVizual{
	
	protected AbstractControlVizual controlVizual;

	public DecoratorAbstractControlVizual(AbstractControlVizual controlVizual) {
		super();
		this.controlVizual = controlVizual;
	}

	//operatie()
	@Override
	public void click() {
		this.controlVizual.click();
	}
	
	
}
