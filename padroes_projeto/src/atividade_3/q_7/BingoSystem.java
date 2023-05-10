package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoSystem implements Subject {

    private List<Observer> observers;
    private List<Integer> numerosSorteados;
    private List<BingoCard> cartelas;
    private int numCartelas;
    private boolean fimDeJogo;

    public BingoSystem(int numCartelas) {
        this.observers = new ArrayList<>();
        this.numerosSorteados = new ArrayList<>();
        this.cartelas = new ArrayList<>();
        this.numCartelas = numCartelas;
        this.fimDeJogo = false;
        criarCartelas();
    }

    private void criarCartelas() {
        for (int i = 0; i < numCartelas; i++) {
            cartelas.add(new BingoCard());
        }
    }

    private void sortearNumero() {
        Random random = new Random();
        int num = random.nextInt(50) + 1;
        numerosSorteados.add(num);
        System.out.println("Número sorteado: " + num);
        notifyObservers(num);
    }

    public void StartBingo() {
        System.out.println("Iniciando bingo com " + numCartelas + " cartelas:");
        for (int i = 0; i < numCartelas; i++) {
            System.out.println("Cartela " + (i+1) + ": " + cartelas.get(i).getNumeros());
        }
        while (!fimDeJogo) {
            sortearNumero();
            for (Observer observer : observers) {
                if (((BingoCard)observer).isVencedor()) {
                    fimDeJogo = true;
                    break;
                }
            }
        }
        BingoCard cartelaVencedora = null;
        for (Observer observer : observers) {
            if (((BingoCard)observer).isVencedor()) {
                cartelaVencedora = (BingoCard)observer;
                break;
            }
        }
        if (cartelaVencedora != null) {
            System.out.println("Cartela " + (cartelas.indexOf(cartelaVencedora)+numCartelas) + " é a vencedora!");
        } else {
            System.out.println("Nenhuma cartela venceu.");
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int num) {
        for (Observer observer : observers) {
            observer.update(num);
        }
    }
}
