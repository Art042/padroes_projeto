package atividade_3.q_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Brasil extends AbstractFactory {
    DateFormat createDateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy");
    }
    FormatoMoeda createCurrencyFormat() {
        return new BrasilMoeda();
    }
}
