package atividade_3.q_4;

public abstract class Lanchonete {
    public void montarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        System.out.println("Montando o sandu�che:");
        sanduiche.adicionarIngredientes();
    }
    protected abstract Sanduiche criarSanduiche();
}