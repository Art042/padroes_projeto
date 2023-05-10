package atividade_3.q_5.Moeda;

public class BrasilMoeda implements FormatoMoeda {
    public String format(double value) {
        return String.format("R$ %.2f", value);
    }
}