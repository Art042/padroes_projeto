package atividade_2.q_2;

public class TVRenderer implements ImageManagerStrategy{
	Renderer renderer = new Renderer();
	
	public boolean mostrarImagem () { 
		
		System.out.println ( "Mostrando uma imagem na TV..." );
		return true; 
		 
	}
}
