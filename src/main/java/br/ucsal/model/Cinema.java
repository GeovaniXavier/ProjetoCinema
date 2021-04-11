package br.ucsal.model;

import br.ucsal.view.ValorSeq;

public class Cinema {

	private int ingressoA;
	private int ingressoB;
	private String[][] matriz;
	private ValorSeq uni;

	private	double vendas;
	private double ingressosVendidos;

	public Cinema() {

	}

	public Cinema(int IngressoA, int IngressoB) {
		this.ingressoA = IngressoA;
		this.ingressoB = IngressoB;
	}

	public void setUni(ValorSeq uni) {
		this.uni = uni;
	}


	public double getTdIngressos() {
		return ingressosVendidos;
	}

	public void setTdIngressos() {
		this.ingressosVendidos++;
	}

	public double getTotalDeVendas() {
		return vendas;
	}

	public void setTotalDeVendas(int VendasT) {
		this.vendas += VendasT;
	}

	public String[][] getMatrizz() {
		return matriz;
	}

	public void setBi(int i, int j, String v) {
		matriz[i][j] = v;
	}

	public int getIngressoA() {
		return ingressoA;
	}

	public void setIngressoA(int IngressoA) {
		this.ingressoA = IngressoA;
	}

	public int getIngressoB() {
		return ingressoB;
	}

	public void setIngressoB(int IngressoB) {
		this.ingressoB = IngressoB;
	}
	public void CriarAssentos() {

		matriz = new String [ingressoA][ingressoB];
		for (int i = 0; i < ingressoA; i++) {
			for (int j = 0; j < ingressoB; j++) {
				matriz[i][j] = "$";
			}

		}
	}
	public int TotalFaturado() {
		return uni.calculo();
	}
	public double percentualDeVendas() {	
		double percentual =  vendas/(TotalFaturado());
		return percentual * 100;
	}
}

