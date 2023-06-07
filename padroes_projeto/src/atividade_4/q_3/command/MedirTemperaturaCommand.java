package atividade_4.q_3.command;

import atividade_4.q_2.MedidorCelsiusIF;
import atividade_4.q_2.Adapter.AdaptadorFarenheitParaCelsiusClassAdapter;
import atividade_4.q_3.RoboAction;

public class MedirTemperaturaCommand implements RoboAction {
	MedidorCelsiusIF adpt_temp = new AdaptadorFarenheitParaCelsiusClassAdapter();
	//Usei o Adapter da questao anterior temperatura Random
	
	double temp = adpt_temp.medirTemperatura();

    public void execute() {
        System.out.println("Medindo temperatura . . .");
        if(temp < 0) {
        	 System.out.println("Tá frio!");
        }else {
        	 System.out.println("Tá Calor!");
        }
    }
}
