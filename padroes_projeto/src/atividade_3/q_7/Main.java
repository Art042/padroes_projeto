package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos Jogadores irão Participar(Número de Cartelas): ");
        int numCartelas = scanner.nextInt();
        List<BingoCard> cartelas = new ArrayList<>();
        for (int i = 0; i < numCartelas; i++) {
            cartelas.add(new BingoCard());
        }
        BingoSystem bingo = new BingoSystem(numCartelas);
        for (BingoCard cartela : cartelas) {
            bingo.registerObserver(cartela);
        }
        bingo.StartBingo();
    }
}
