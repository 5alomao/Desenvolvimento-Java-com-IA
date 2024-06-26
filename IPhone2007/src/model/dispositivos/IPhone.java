package model.dispositivos;

import model.comportamentos.AparelhoTelefonico;
import model.comportamentos.NavegadorInternet;
import model.comportamentos.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public void tocarMusica() {
		System.out.println("TOCANDO MUSICA");
	}
	
	public void pausarMusica() {
		System.out.println("MUSICA PAUSADA");
	}
	
	public void selecionarMusica() {
		System.out.println("MUSICA SELECIONADA");
	}
	
	public void atender() {
		System.out.println("LIGACAO ATENDIDA");
	}

	public void ligar() {
		System.out.println("LIGACAO EFETUADA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");
	}
	
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA");
	}
	
	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
	}
	
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}
}
