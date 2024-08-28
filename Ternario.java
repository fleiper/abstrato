package antigripe;

public class Ternario {

	public static void main(String[] args) {
		temled luzinha = new temled();
		clt home = new clt();
		
		
		System.out.println("PC GAMER");
		luzinha.ligar();
		luzinha.desligar();
		luzinha.reiniciar();
		luzinha.carregandoSistema();
		System.out.println("==============================================================");
		System.out.println("PC COMUM");
		home.ligar();
		home.desligar();
		home.reiniciar();
		home.carregandoSistema();

	}

}
