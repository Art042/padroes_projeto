package atividade_3.q_5.Factory;

import java.text.SimpleDateFormat;

import atividade_3.q_5.Moeda.EUAMoeda;
import atividade_3.q_5.Moeda.FormatoMoeda;

class EUA extends AbstractFactory {
    public java.text.DateFormat createDateFormat() {
        return (java.text.DateFormat) new SimpleDateFormat("MM/dd/yyyy");
    }
    public FormatoMoeda createCurrencyFormat() {
        return new EUAMoeda();
    }
}
