package atividade_3.q_3;

public class AvaliadorDeProcesso {

	public static void main(String[] args) {
		Processo processo_1 = new Processo();
		Processo processo_2 = new Processo();
		
		
		System.out.println("Processo 1:"+processo_1.getStatus());
		System.out.println("Processo 2:"+processo_2.getStatus());
		
		processo_1.acao(1);
		processo_2.indeferido(2);
		
		System.out.println("Processo 1:"+processo_1.getStatus());
		System.out.println("Processo 2:"+processo_2.getStatus());
		
		processo_1.deferido(1);
		processo_2.acao(2);
		
		System.out.println("Processo 1:"+processo_1.getStatus());
		System.out.println("Processo 2:"+processo_2.getStatus());
		

	}

}
