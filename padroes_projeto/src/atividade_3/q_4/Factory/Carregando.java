package atividade_3.q_4.Factory;

public class Carregando {

	public static void barra_carregando(char icone,int repeticoes, long delayMillis) {
	    for(int i = 0; i < repeticoes; i++) {
	        System.out.print(icone);
	        try {
	            Thread.sleep(delayMillis);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
