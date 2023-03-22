package atividade_2.q_5;

public class Notas_5 extends Contador{
    public Notas_5() {
        super(null);
    }

    @Override
    public String Contar(double valor) {
        return "\nNotas de 2: " + (int)(valor/5);
    }

}
