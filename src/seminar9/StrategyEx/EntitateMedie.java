package seminar9.StrategyEx;

public class EntitateMedie implements IProcesabil{

	@Override
	public int proceseaza(int[] valori) {
		if(valori == null)
			return 0;
		int medie = 0;
		for(int i=0;i<valori.length;i++)
			medie+=valori[i];
		return medie/valori.length;
	}

}
