package atividade_4.q_6.Bridge.SGBD_Classes;

import atividade_4.q_6.Persistencia;

public class PersistenciaJson implements Persistencia {
    public void enviarArquivo(String arquivo) {
        System.out.println("Enviando arquivo JSON para a Base de Dados: " + arquivo);
    }
}