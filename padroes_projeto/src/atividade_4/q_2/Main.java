package atividade_4.q_2;

import atividade_4.*;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusObjectAdapter;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusClassAdapter;


public class Main {

    public static void main(String[] args) {
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF adaptador = new AdaptadorFarenheitParaCelsiusObjectAdapter(medidorFarenheit);
        MedidorCelsiusIF adaptador2 = new AdaptadorFarenheitParaCelsiusClassAdapter();
        
        double temperaturaCelsius = adaptador.medirTemperatura();
        double temperaturaCelsius2 = adaptador2.medirTemperatura();
        double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
        System.out.println("Temperatura: " + temperaturaCelsius+" Graus Celsius. - Versão Object");
        System.out.println("Temperatura: " + temperaturaCelsius2+" Graus Celsius. - Versão ClassAdapter");
        System.out.println("Temperatura: " + temperaturaFarenheit+" Graus Farenheit.");
    }

}
