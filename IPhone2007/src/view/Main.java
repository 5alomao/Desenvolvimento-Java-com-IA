package view;

import model.dispositivos.IPhone;

public class Main {

	public static void main(String[] args) {

		IPhone obj = new IPhone();

		obj.selecionarMusica();
		obj.tocarMusica();
		obj.pausarMusica();

	}

}
