package atividade_4.q_1;

import atividade_4.q_1.Adapter.SomadorExistenteAdapter;
import atividade_4.q_1.Cliente;

public class Main {

	public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado adapter = new SomadorExistenteAdapter(somadorExistente);

        Cliente cliente = new Cliente(adapter);
        cliente.executar();
    }

}
