package antigripe;
public class clt implements Compiurer{

	@Override
	public void ligar() {
		System.out.println("ligando");
	}

	@Override
	public void reiniciar() {
		System.out.println("reiniciando");
	}

	@Override
	public void desligar() {
		System.out.println("Estamos desligando");
		
	}

	@Override
	public void carregandoSistema() {
		System.out.println("O Sistema está carregando");
		
	}
}