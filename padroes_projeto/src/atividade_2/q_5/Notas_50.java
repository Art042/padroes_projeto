package atividade_2.q_5;

public class Notas_50 extends Contador{
	   public Notas_50() {
	        super(new Notas_20());
	    }

	    @Override
	    public String Contar(double valor) {
	        if(valor >= 50){
	            return "\nNotas de 50: " + (int)(valor/50) + this.nextContador.Contar(valor%50);
	        }else{
	            return this.nextContador.Contar(valor%50);
	        }

	    }
}
