package atividade_4.q_5.Composite;

import java.util.ArrayList;
import java.util.List;

import atividade_4.q_5.Componente;

public class Tabela implements Componente {
    private List<Componente> linhas = new ArrayList<>();

    public void adicionar(Componente l) {
        linhas.add(l);
    }

    public void imprimir() {
        for (Componente linha : linhas) {
            linha.imprimir();
        }
    }
}
