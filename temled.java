package antigripe;

public class temled implements Compiurer{

	@Override
	public void ligar() {
		System.out.println("LIGANDO...");
		
	}

	@Override
	public void reiniciar() {
		 System.out.println("REINICIANDO...");
		
	}

	@Override
	public void desligar() {
		System.out.println("Estamos desligando... mas ainda terá led");
		
	}

	@Override
	public void carregandoSistema() {
		System.out.println("O Sistema está carregando... por favor aguarde");
		
	}

}
