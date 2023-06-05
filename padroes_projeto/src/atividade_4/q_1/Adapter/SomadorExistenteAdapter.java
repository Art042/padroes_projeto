package atividade_4.q_1.Adapter;

import java.util.ArrayList;
import java.util.List;

import atividade_4.q_1.Cliente;
import atividade_4.q_1.SomadorEsperado;
import atividade_4.q_1.SomadorExistente;

public class SomadorExistenteAdapter implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public SomadorExistenteAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor) {
            lista.add(i);
        }
        return somadorExistente.somaLista(lista);
    }
}
