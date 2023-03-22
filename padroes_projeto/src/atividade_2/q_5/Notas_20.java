package atividade_2.q_5;

public class Notas_20 extends Contador{
	public Notas_20() {
        super(new Notas_5());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 20){
            return "\nNotas de 20: " + (int)(valor/20) + this.nextContador.Contar(valor%20);
        }else{
            return this.nextContador.Contar(valor%20);
        }

    }

}
