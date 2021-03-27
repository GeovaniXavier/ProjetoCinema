package br.ucsal;

public class Cinema {

	private int IngressoA;
	private int IngressoB;
	private String[][] Matriz;
	private ValorSeq uni = new ValorSeq(this);
	private	double Vendas;
	private double IngressosVendidos;

	public Cinema() {

	}

	public Cinema(int IngressoA, int IngressoB) {
		this.IngressoA = IngressoA;
		this.IngressoB = IngressoB;
	}


	public double getTdIngressos() {
		return IngressosVendidos;
	}

	public void setTdIngressos() {
		this.IngressosVendidos++;
	}

	public double getTotalDeVendas() {
		return Vendas;
	}

	public void setTotalDeVendas(int VendasT) {
		this.Vendas += VendasT;
	}

	public String[][] getMatrizz() {
		return Matriz;
	}

	public void setBi(int i, int j, String v) {
		Matriz[i][j] = v;
	}

	public int getIngressoA() {
		return IngressoA;
	}

	public void setIngressoA(int IngressoA) {
		this.IngressoA = IngressoA;
	}

	public int getIngressoB() {
		return IngressoB;
	}

	public void setIngressoB(int IngressoB) {
		this.IngressoB = IngressoB;
	}
	public void imprimir() {
		for (int i = 0; i < IngressoA; i++) {
			if(i==0) {
				System.out.println();
				System.out.print(" ");

				for(int j = 0; j< IngressoB; j++) {
					System.out.print(" " + (j+1));

					if(j == IngressoB-1) {
						System.out.println();
					}
				}

			}
			System.out.print(i+1 + " ");
			for (int j = 0; j < IngressoB; j++) {

				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void CriarAssentos() {

		Matriz = new String [IngressoA][IngressoB];
		for (int i = 0; i < IngressoA; i++) {
			for (int j = 0; j < IngressoB; j++) {
				Matriz[i][j] = "$";
			}

		}
	}
	public int TotalFaturado() {
		return uni.calculo();
	}
	public double percentualDeVendas() {	
		double percentual =  Vendas/(TotalFaturado());
		return percentual * 100;
	}
}

