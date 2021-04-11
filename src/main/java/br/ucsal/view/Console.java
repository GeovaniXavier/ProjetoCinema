package br.ucsal.view;

import java.util.Scanner;

import br.ucsal.model.Cinema;
import br.ucsal.negocio.Negocio;

public class Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Negocio cine = new Negocio();
		Cinema esp = new Cinema();
		int v1 = 0;
		int v2 = 0;
		int v3 = 0; 
		int vf = 0;
		int opcao =  1;

		System.out.print("Digite o numero de filas: " + "\n>");
		v1 = scan.nextInt();

		System.out.print("Digite o numero de cadeiras por fila:" + "\n>");
		v2 = scan.nextInt();

		if(v1 > 9 || v2> 9) {
			System.out.print("filas e cadeiras por fila não podem ser maior do que nove. ");
			System.exit(0);
		}
		System.out.println("\n\n" + "Cinema: ");
		esp.setIngressoA(v1);
		esp.setIngressoB(v2);
		esp.CriarAssentos();
		esp.setUni(new ValorSeq(esp));
		cine.setSala(esp);
		cine.imprimir();
		while(opcao != 0) {
			System.out.println("\n" + "1. EXIBIR LUGARES" +
					"\n" + "2. COMPAR INGRESSO" + 
					"\n" + "3. DETALHES" + 
					"\n" + "0. SAIR"+ "\n");	
			opcao = scan.nextInt();
			if(opcao == 3) {
				System.out.println("INGRESSOS VENDIDOS: " + esp.getTdIngressos());
				System.out.print("PERCENTUALIDADE : ");
				System.out.printf("%.2f", esp.percentualDeVendas());
				System.out.print("%" + "\n");
				System.out.println("FATURAMENTO ATÉ O MOMENTO: " + esp.getTotalDeVendas());
				System.out.println("FATURAMENTO FECHADO: " + esp.TotalFaturado());
			}
			else if(opcao == 1) {
				cine.imprimir();
			}
			else if(opcao == 2) {	
				System.out.print("Digite o numero da fila: " + "\n>");
				v3 = scan.nextInt();
				System.out.print("Digite o numero do assento da fila:" + "\n>");
				vf = scan.nextInt();
				if(v3 > v1 || vf> v1) {
					System.out.print("Lugar Invalido.");
					System.exit(0);
				}
				System.out.print("Valor do ingreço:" + "\n>");
				cine = new Negocio(esp, v3, vf);
				System.out.println("R$" + cine.cineVaga());
				cine.cineLugar();

			}else if(opcao == 0){
				opcao = 0;
			}
			else {
				System.out.println("Opção incorreta.");
			}
		}
		scan.close();
	}
}