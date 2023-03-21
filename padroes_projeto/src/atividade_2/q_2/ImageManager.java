package atividade_2.q_2;

import java.util.Scanner;

@SuppressWarnings("resource")
public class ImageManager {
	public static void main(String[] args) {

//	Rendered rendered = new Rendered();

		Renderer renderer = new Renderer();
		int escolha;
        System.out.println("\n1 - TV\n2 - Laptop\n3 - Smartphone\n");
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();
        
        if (escolha == 1){
			renderer.setStrategy(new TVRenderer());
        }else if(escolha == 2){
			renderer.setStrategy(new LaptopRenderer());
        }else if(escolha == 3){
			renderer.setStrategy(new SmartphoneRenderer());
		}else {
			return;
		}
		renderer.executaStrategy();
		
	}


}

 