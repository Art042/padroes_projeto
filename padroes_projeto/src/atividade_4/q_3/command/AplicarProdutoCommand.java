package atividade_4.q_3.command;

import atividade_4.q_3.RoboAction;

public class AplicarProdutoCommand implements RoboAction {
    private String produto;

    public AplicarProdutoCommand(String produto) {
        this.produto = produto;
    }

    public void execute() {
        System.out.println("Aplicando produto . . .");
        System.out.println(produto+" aplicado!");
    }
}
