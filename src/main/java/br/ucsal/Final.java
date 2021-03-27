package br.ucsal;

public class Final {

	private Cinema sala;
	private int fila, coluna;
	public Final(Cinema sala, int fila, int coluna) {
		this.sala = sala;
		this.fila= fila;
		this.coluna = coluna;
	}
	public int CineVaga() {	

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
	public void CineLugar() {
		for (int i = 0; i < sala.getIngressoA(); i++) {
			for (int j = 0; j < sala.getIngressoB(); j++) {
				if(fila == i+1 && coluna == j+1 ) {
					if(sala.getMatrizz()[i][j].equals("S")) {
						sala.setBi(i, j, "X");
						sala.setTotalDeVendas(CineVaga());
						sala.setTdIngressos();

					}else {
						System.out.println("COMPRA FEITA COM SUCESSO.");			  
					}
				}
			}
		}
	}
}

