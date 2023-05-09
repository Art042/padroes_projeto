package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoCaller {
    private List<Integer> numbers = new ArrayList<Integer>();

    public BingoCaller() {
        // Inicializa uma lista com os números possíveis
        for (int i = 1; i <= 75; i++) {
            numbers.add(i);
        }

    }
    public void startCallingNumbers() {
        // Sorteia os números e notifica as cartelas
        Random random = new Random();
        while (!numbers.isEmpty()) {
            int index = random.nextInt(numbers.size());
            int number = numbers.remove(index);
            System.out.println("Chamando número " + number);
            notifyObservers(number);
            try {
                Thread.sleep(1000); // Aguarda 1 segundo entre cada chamada
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Após chamar todos os números, verifica se alguma cartela é a cartela premiada
        for (BingoCard card : cards) {
            if (card.isWinningCard()) {
                System.out.println("Cartela premiada encontrada!");
                break;
            }
        }
 }
}
