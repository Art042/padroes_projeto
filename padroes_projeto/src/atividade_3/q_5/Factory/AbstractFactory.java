package atividade_3.q_5.Factory;

import java.text.SimpleDateFormat;

import atividade_3.q_5.Moeda.FormatoMoeda;

public abstract class AbstractFactory {
    public abstract java.text.DateFormat createDateFormat();
    public abstract FormatoMoeda createCurrencyFormat();
}