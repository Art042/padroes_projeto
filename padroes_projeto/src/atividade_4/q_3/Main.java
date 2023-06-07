package atividade_4.q_3;

import atividade_4.q_3.command.AplicarProdutoCommand;
import atividade_4.q_3.command.CalcularCommand;
import atividade_4.q_3.command.MedirTemperaturaCommand;
import atividade_4.q_3.command.TirarAmostraCommand;

public class Main {
    public static void main(String[] args) {

        RoboAction aplicarProduto = new AplicarProdutoCommand("Oregano");
        RoboAction medirTemperatura = new MedirTemperaturaCommand();
        RoboAction tirarAmostra = new TirarAmostraCommand("Queijo");
        RoboAction calcular = new CalcularCommand();
        Experimento experimento = new Experimento();

        experimento.adicionarAcao(aplicarProduto);
        experimento.adicionarAcao(medirTemperatura);
        experimento.adicionarAcao(tirarAmostra);
        experimento.adicionarAcao(calcular);

        experimento.executarExperimento();
    }
}







