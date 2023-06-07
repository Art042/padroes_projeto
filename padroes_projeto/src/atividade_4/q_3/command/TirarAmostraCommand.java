package atividade_4.q_3.command;

import atividade_4.q_3.RoboAction;

public class TirarAmostraCommand implements RoboAction {
	private String amostra;

    public TirarAmostraCommand(String amostra) {
        this.amostra = amostra;
    }

    public void execute() {
        System.out.println("Tirando amostra . . .");
        System.out.println("Amostra de "+amostra+" colhida!");
    }
}
