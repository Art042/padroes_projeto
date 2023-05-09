package atividade_3.q_4;

import java.util.Scanner;

public class FabricaSanduiches extends Lanchonete {
    @Override
    protected Sanduiche criarSanduiche() {
        // Lógica para a criação de cada tipo de sanduíche
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de sanduíche você deseja? (1 - Vegetariano, 2 - Frango, 3 - Carne)");
        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                return new SanduicheVegetariano();
            case 2:
                return new SanduicheFrango();
            case 3:
                return new SanduicheCarne();
            default:
                throw new IllegalArgumentException("Tipo de sanduíche inválido!");
        }
    }
}