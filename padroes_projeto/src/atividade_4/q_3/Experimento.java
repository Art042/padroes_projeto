package atividade_4.q_3;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private List<RoboAction> acoes;

    public Experimento() {
        acoes = new ArrayList<>();
    }

    public void adicionarAcao(RoboAction acao) {
        acoes.add(acao);
    }

    public void executarExperimento() {
        for (RoboAction acao : acoes) {
            acao.execute();
        }
    }
}