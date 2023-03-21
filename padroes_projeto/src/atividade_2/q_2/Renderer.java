package atividade_2.q_2;


public class Renderer {
	
    private ImageManagerStrategy strategy;

    public void setStrategy(ImageManagerStrategy strategy) {
        this.strategy = strategy;
    }

    public void executaStrategy(){
        strategy.mostrarImagem();
    }

}
