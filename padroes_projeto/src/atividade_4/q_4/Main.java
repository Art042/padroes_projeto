package atividade_4.q_4;

import java.io.IOException;

import atividade_4.q_4.Composite.Elemento;
import atividade_4.q_4.Composite.Enums.MensagensErro;

public class Main {
    public static void main(String[] args) {
        
    	String endereco = "Caminho Diretorio";
    	
    	if (endereco.length() == 0) {
            System.out.println(MensagensErro.DIRETORIO_NAO_FORNECIDO.getMessage());
    	}try {
            Elemento elemento = ElementoFactory.criarElemento(endereco);
            long tamanho = elemento.tamanho();
            System.out.println("Tamanho total: " + tamanho + " bytes");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}