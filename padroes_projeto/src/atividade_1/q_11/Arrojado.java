package atividade_1.q_11;

import java.util.Random;

public class Arrojado implements RealizadorDeInvestimentos_Interface{
	Random random = new Random();
	
	public double realizar_investimento(Double valor) {
    	
    	
        int resultado = random.nextInt(100)+1;
        if(resultado > 80){ //20%
            return valor*0.05;
        }else if(resultado > 50){
            return valor*0.03;
        }
        return valor*0.006;
    }

}
