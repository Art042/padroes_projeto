package atividade_3.q_5.Factory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import atividade_3.q_5.Moeda.BrasilMoeda;
import atividade_3.q_5.Moeda.FormatoMoeda;

public class Brasil extends AbstractFactory {
    public DateFormat createDateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy");
    }
    public FormatoMoeda createCurrencyFormat() {
        return new BrasilMoeda();
    }
}
