package atividade_3.q_5;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        String localeCode = "US"; // c�digo de localidade informado pelo usu�rio
        AbstractFactory factory = FormatoPais.getFactory(localeCode);
        java.text.DateFormat dateFormat = factory.createDateFormat();
        FormatoMoeda currencyFormat = factory.createCurrencyFormat();
        Date date = new Date();
        double value = 1.99;
        System.out.println("Data: " + dateFormat.format(date)); 
        System.out.println("Valor: " + currencyFormat.format(value)); 
    }
}