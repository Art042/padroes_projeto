package atividade_2.q_5;

public class Notas_100 extends Contador {
	public Notas_100() {
        super(new Notas_50());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 100){
            return "\nNotas de 100: " + (int)(valor/100) + this.nextContador.Contar(valor%100);
        }else{
            return this.nextContador.Contar(valor%100);
        }
    }

}
