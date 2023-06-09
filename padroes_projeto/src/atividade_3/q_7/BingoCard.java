package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BingoCard implements Observer {
    private List<Integer> numeros;
    private boolean vencedor;

    public BingoCard() {
        numeros = new ArrayList<>();
        vencedor = false;
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            numeros.add(rand.nextInt(50) + 1);
        }
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    @Override
    public void update(int number) {
        if (numeros.contains(number)) {
            numeros.remove((Integer)number);
        }
        if (numeros.isEmpty()) {
            vencedor = true;
        }
    }
}
