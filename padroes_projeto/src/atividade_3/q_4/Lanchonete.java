package atividade_3.q_4;

import atividade_3.q_4.Factory.Sanduiche;

public abstract class Lanchonete {
    public void montarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        System.out.println("Montando o sanduíche:");
        sanduiche.adicionarIngredientes();
    }
    protected abstract Sanduiche criarSanduiche();
}