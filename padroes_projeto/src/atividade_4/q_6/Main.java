package atividade_4.q_6;

import atividade_4.q_6.Bridge.Carro;
import atividade_4.q_6.Bridge.Pessoa;
import atividade_4.q_6.Bridge.SGBD_Classes.PersistenciaJson;
import atividade_4.q_6.Bridge.SGBD_Classes.PersistenciaXML;

public class Main {
    public static void main(String[] args) {
        // XML
        Persistencia persistenciaXML = new PersistenciaXML();

        ClasseNegocio pessoaXML = new Pessoa(persistenciaXML);
        pessoaXML.persiste();

        ClasseNegocio carroXML = new Carro(persistenciaXML);
        carroXML.persiste();

        System.out.println("=====================================");

        //JSON
        Persistencia persistenciaJson = new PersistenciaJson();

        ClasseNegocio pessoaJson = new Pessoa(persistenciaJson);
        pessoaJson.persiste();

        ClasseNegocio carroJson = new Carro(persistenciaJson);
        carroJson.persiste();
    }
}
