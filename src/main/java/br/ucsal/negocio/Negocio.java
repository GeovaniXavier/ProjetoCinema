package br.ucsal.negocio;

import br.ucsal.view.Cinema;

public class Negocio {
	private Cinema sala;
	private int fila; 
	private int coluna;
	public Negocio(Cinema sala, int fila, int coluna) {
		this.sala = sala;
		this.fila= fila;
		this.coluna = coluna;
	}

	public Negocio() {

	}

	public Cinema getSala() {
		return sala;
	}

	public void setSala(Cinema sala) {
		this.sala = sala;
	}

	public int cineVaga() {	

		int valor =0;	
		if(sala.getIngressoA() * sala.getIngressoB() <= 60) {
			valor = 10; 
		}else if(sala.getIngressoA()*sala.getIngressoB()>60) {
			if(sala.getIngressoA() % 2 == 0) {
				if(fila <= sala.getIngressoA()/2) {
					valor = 10;
				}
				else {
					valor = 8;
				}
			}else {
				if(fila <= (sala.getIngressoA()-1)/2) {
					valor = 10;
				}else {		
					valor = 8;
				}
			}
		}

		return valor;
	}
	public void cineLugar() {
		for (int i = 0; i < sala.getIngressoA(); i++) {
			for (int j = 0; j < sala.getIngressoB(); j++) {
				if(fila == i+1 && coluna == j+1 ) {
					if(sala.getMatrizz()[i][j].equals("$")) {
						sala.setBi(i, j, "X");
						sala.setTotalDeVendas(cineVaga());
						sala.setTdIngressos();
					}else {
						System.out.println("COMPRA FEITA COM SUCESSO.");			  
					}
				}
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < sala.getIngressoA(); i++) {
			if(i==0) {
				System.out.println();
				System.out.print(" ");

				for(int j = 0; j< sala.getIngressoB(); j++) {
					System.out.print(" " + (j+1));

					if(j == sala.getIngressoB()-1) {
						System.out.println();
					}
				}

			}
			System.out.print(i+1 + " ");
			for (int j = 0; j < sala.getIngressoB(); j++) {

				System.out.print(sala.getMatrizz()[i][j] + " ");
			}
			System.out.println();
		}
	}

}
