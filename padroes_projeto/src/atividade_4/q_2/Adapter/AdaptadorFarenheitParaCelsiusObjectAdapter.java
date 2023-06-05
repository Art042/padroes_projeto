package atividade_4.q_2.Adapter;

import atividade_4.q_2.MedidorCelsiusIF;
import atividade_4.q_2.MedidorFarenheit;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF {
    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    public double medirTemperatura() {
        double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
        double temperaturaCelsius = converterFarenheitParaCelsius(temperaturaFarenheit);
        return temperaturaCelsius;
    }

    private double converterFarenheitParaCelsius(double temperaturaFarenheit) {
        return (temperaturaFarenheit-32.0)*5/9; 
        // Por algum motivo se fosse (temperaturaFarenheit-32.0)*1.8 n�o retornava o valor correto;
    }
}
