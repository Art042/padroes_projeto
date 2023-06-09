package atividade_4.q_2.Clone;

import atividade_4.q_2.MedidorCelsiusIF;
import atividade_4.q_2.MedidorFarenheit;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusClassAdapter;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusObjectAdapter;

public class Experimento implements MedidorCelsiusIF, Cloneable {
    private MedidorCelsiusIF medidor;
    private AdaptadorFarenheitParaCelsiusClassAdapter adaptadorClass;
    private AdaptadorFarenheitParaCelsiusObjectAdapter adaptadorObject;

    public Experimento(MedidorCelsiusIF medidor, AdaptadorFarenheitParaCelsiusClassAdapter adaptadorClass, AdaptadorFarenheitParaCelsiusObjectAdapter adaptadorObject) {
        this.medidor = medidor;
        this.adaptadorClass = adaptadorClass;
        this.adaptadorObject = adaptadorObject;
    }

    @Override
    public Experimento clone() {
        try {
            Experimento experimentoClone = (Experimento) super.clone();
//            experimentoClone.medidor = (MedidorCelsiusIF) ((Object) medidor).clone();
            experimentoClone.adaptadorClass = (AdaptadorFarenheitParaCelsiusClassAdapter) adaptadorClass.clone();
            experimentoClone.adaptadorObject = (AdaptadorFarenheitParaCelsiusObjectAdapter) adaptadorObject.clone();
            return experimentoClone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void realizarExperimento() {
        double temperaturaCelsius = medidor.medirTemperatura();
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    }

	@Override
	public double medirTemperatura() {
		return 0;
	}
}
