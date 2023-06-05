package atividade_4.q_2.Clone;

import atividade_4.q_2.MedidorCelsiusIF;
import atividade_4.q_2.MedidorFarenheit;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusClassAdapter;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusObjectAdapter;

public class Experimento implements Cloneable {
    private MedidorCelsiusIF medidor;
    private AdaptadorFarenheitParaCelsiusClassAdapter adaptadorClass;
    private AdaptadorFarenheitParaCelsiusObjectAdapter adaptadorObject;

    // Construtor
    public Experimento() {
        // Inicializar os objetos necessários para o experimento
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        adaptadorClass = new AdaptadorFarenheitParaCelsiusClassAdapter();
        adaptadorObject = new AdaptadorFarenheitParaCelsiusObjectAdapter(medidorFarenheit);
        medidor = adaptadorObject;
    }

    // Método clone()
    @Override
    public Experimento clone() {
        try {
            Experimento experimentoClone = (Experimento) super.clone();

            // Clonar os objetos AdaptadorFarenheitParaCelsiusClassAdapter e AdaptadorFarenheitParaCelsiusObjectAdapter
            experimentoClone.adaptadorClass = (AdaptadorFarenheitParaCelsiusClassAdapter) adaptadorClass.clone();
            experimentoClone.adaptadorObject = (AdaptadorFarenheitParaCelsiusObjectAdapter) adaptadorObject.clone();

            // Clonar o objeto MedidorCelsiusIF
            experimentoClone.medidor = (MedidorCelsiusIF) medidor.clone();

            return experimentoClone;
        } catch (CloneNotSupportedException e) {
            // Lidar com exceção de clonagem, se necessário
            return null;
        }
    }

    // Outros métodos do experimento...

    public void realizarExperimento() {
        double temperaturaCelsius = medidor.medirTemperatura();
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    }
}


