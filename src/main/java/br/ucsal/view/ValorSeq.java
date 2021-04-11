package br.ucsal.view;

import br.ucsal.model.Cinema;

public class ValorSeq{
	Cinema sala;
	public ValorSeq(Cinema sala){
		this.sala = sala;
	}
	public int calculo() {
		int faturamento = 0;
		if(sala.getIngressoA() <= 9 && sala.getIngressoB() <= 9) {
			if(sala.getIngressoA() * sala.getIngressoB() <= 60) {
				faturamento = sala.getIngressoA()*sala.getIngressoB()*10; 
			}else if(sala.getIngressoA()*sala.getIngressoB()>60) {
				if(sala.getIngressoA() % 2 == 0) {
					faturamento = ((sala.getIngressoA()/2)*sala.getIngressoB()*10) + ((sala.getIngressoA()/2)*sala.getIngressoB()*8);
				}else {
					faturamento = (((sala.getIngressoA()-1)/2)*sala.getIngressoB()*10) + (((sala.getIngressoA()+1)/2)*sala.getIngressoB()*8);
				}
			}
		}
		return faturamento;
	}
}