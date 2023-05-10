package atividade_3.q_5;

import java.text.SimpleDateFormat;

class EUA extends AbstractFactory {
    java.text.DateFormat createDateFormat() {
        return (java.text.DateFormat) new SimpleDateFormat("MM/dd/yyyy");
    }
    FormatoMoeda createCurrencyFormat() {
        return new EUAMoeda();
    }
}
