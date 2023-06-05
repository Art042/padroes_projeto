package atividade_4.q_2;

import java.util.Random;

public class MedidorCelsius implements MedidorCelsiusIF, Cloneable {
    public double medirTemperatura() {
        double temperaturaCelsius = new Random().nextDouble() * 100; // Valor aleatório em Celsius (0 a 100)
        return temperaturaCelsius;
    }
    

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
