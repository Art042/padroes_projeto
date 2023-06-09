package atividade_2.q_6;

import atividade_2.q_6.chain.Controller;

public class Relatorio_Conta {

	public static void main(String[] args) {
		 Controller formatador = new Controller();

	        Conta conta = new Conta(0042, 1.99);
	        Requisicao requisicaoJson = new Requisicao(Formato.JSON);
	        Requisicao requisicaoCSV = new Requisicao(Formato.CSV);
	        Requisicao requisicaoXML = new Requisicao(Formato.XML);

	        System.out.println("Formato JSON: \n" + formatador.getFormatado(requisicaoJson, conta));
	        System.out.println("\nFormato CSV: \n" + formatador.getFormatado(requisicaoCSV, conta));
	        System.out.println("\nFormato XML: \n" + formatador.getFormatado(requisicaoXML, conta));

	}

}
