package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class BingoCard implements BingoObserver {
    private int[][] numbers = new int[5][5];
    private boolean[][] marks = new boolean[5][5];
    private boolean isWinningCard = false;

    public void generateCard() {
        // Gera uma cartela com 25 números aleatórios não repetidos
        Random random = new Random();
        List<Integer> allNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= 75; i++) {
            allNumbers.add(i);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int index = random.nextInt(allNumbers.size());
                numbers[i][j] = allNumbers.get(index);
                allNumbers.remove(index);
            }
        }
    }
    public void markNumber(int number) {
        // Marca um número na cartela, se estiver presente
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers[i][j] == number) {
                    marks[i][j] = true;
                    checkWinningCard();
                    return;
                }
            }
        }
    }
    private void checkWinningCard(BingoCard card) {
        // Obtém os números da cartela
        List<Integer> cardNumbers = card.getNumbers();
        
        // Verifica se todos os números da cartela estão presentes na lista de números sorteados
        if (numbers.containsAll(cardNumbers)) {
            card.setWinningCard(true);
        } else {
            card.setWinningCard(false);
        }
    }
    
    protected abstract void setWinningCard(boolean b);
	public boolean isWinningCard() {
        return isWinningCard;
    }
}