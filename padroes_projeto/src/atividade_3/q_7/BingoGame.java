package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class BingoGame extends Observable {
    private List<BingoCard> cards;
    private List<Integer> numbers;

    public BingoGame() {
        cards = new ArrayList<>();
        numbers = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            numbers.add(i);
        }
    }

    public void addCard(BingoCard card) {
        cards.add(card);
    }

    public BingoCard getCard(int index) {
        return cards.get(index);
    }

    public void startCallingNumbers() {
        Random random = new Random();
        while (!numbers.isEmpty()) {
            int index = random.nextInt(numbers.size());
            int number = numbers.remove(index);
            System.out.println("Chamando n�mero " + number);
            setChanged();
            notifyObservers(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (BingoCard card : cards) {
            checkWinningCard(card);
        }
    }

    private void checkWinningCard(BingoCard card) {
        List<Integer> cardNumbers = card.getNumbers();
        if (numbers.containsAll(cardNumbers)) {
            card.setWinningCard(true);
        } else {
            card.setWinningCard(false);
        }
    }
}

