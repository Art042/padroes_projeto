package atividade_3.q_4;

import java.util.Scanner;

import atividade_3.q_4.Factory.Sanduiche;
import atividade_3.q_4.Factory.LanchoneteJP;
import atividade_3.q_4.Factory.LanchoneteRT;
import atividade_3.q_4.Factory.LanchoneteCG;

public class CardapioSanduiches extends Lanchonete {
    @Override
    protected Sanduiche criarSanduiche() {
        try (// Lógica para a criação de cada tipo de sanduíche
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escolha a Lanchonete:\n1-CG\n2-JP\n3-RT");
			int tipo = scanner.nextInt();
			switch (tipo) {
			    case 1:
			        return new LanchoneteCG();
			    case 2:
			        return new LanchoneteRT();
			    case 3:
			        return new LanchoneteJP();
			    default:
			        throw new IllegalArgumentException("Lanchonete Não Cadastrada");
			}
		}
    }
}