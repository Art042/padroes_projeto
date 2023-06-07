package atividade_4.q_6.Bridge;

import atividade_4.q_6.ClasseNegocio;
import atividade_4.q_6.Persistencia;

public class Carro extends ClasseNegocio {
    public Carro(Persistencia persistencia) {
        super(persistencia);
    }

    public void persiste() {
        System.out.println("Buscando Informações sobre Carro...");
        persistencia.enviarArquivo("arquivo_carro");
    }
}
