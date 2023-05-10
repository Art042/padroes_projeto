package atividade_3.q_5.Moeda;

public class EUAMoeda implements FormatoMoeda {
    public String format(double value) {
        return String.format("$ %.2f", value);
    }
}