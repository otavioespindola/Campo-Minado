package br.com.otavioespindola.cm;

import br.com.otavioespindola.cm.modelo.Tabuleiro;
import br.com.otavioespindola.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
	
		new TabuleiroConsole(tabuleiro);			
	}
}
