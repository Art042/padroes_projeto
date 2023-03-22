package atividade_2.q_2;

//import java.util.Scanner;

public class ImageManager {
	public static void main(String[] args) {


		Renderer renderer = new Renderer();
        
		if(renderer instanceof Renderer) {
			renderer.setStrategy(new TVRenderer());
		}
		else if(renderer instanceof Renderer) {
			renderer.setStrategy(new LaptopRenderer());
		}
		else if(renderer instanceof Renderer) {
			renderer.setStrategy(new SmartphoneRenderer());
		}else {
			return;
		}

		renderer.executaStrategy();
		
	}


}

 