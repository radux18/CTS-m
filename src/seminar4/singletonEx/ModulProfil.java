package seminar4.singletonEx;

public class ModulProfil {
	public ModulProfil() {
		//ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1", "superGame");
		ConexiuneBD conexiune = ConexiuneBD.getConexiune();
	}
}
