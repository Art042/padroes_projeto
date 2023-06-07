package atividade_4.q_6.Bridge;

import atividade_4.q_6.ClasseNegocio;
import atividade_4.q_6.Persistencia;

public class Pessoa extends ClasseNegocio {
    public Pessoa(Persistencia persistencia) {
        super(persistencia);
    }

    public void persiste() {
        System.out.println("Buscando Informações sobre Pessoa...");
        persistencia.enviarArquivo("arquivo_pessoa");
    }
}
