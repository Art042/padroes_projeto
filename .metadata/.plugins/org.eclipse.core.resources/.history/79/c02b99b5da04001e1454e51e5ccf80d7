package atividade_4.q_4;

import java.io.File;
import java.io.IOException;

import atividade_4.q_4.Composite.Arquivo;
import atividade_4.q_4.Composite.Diretorio;
import atividade_4.q_4.Composite.Elemento;
//import atividade_4.q_4.Composite.Enums.MensagensErro;

public class ElementoFactory {
    public static Elemento criarElemento(String nome) throws IOException {
        File file = new File(nome);

        if (file.isFile()) {
            return new Arquivo(nome);
        } else if (file.isDirectory()) {
            return new Diretorio(nome);
        }

        throw new IOException();
    }
}