package atividade_2.q_2;

public class SmartphoneRenderer implements ImageManagerStrategy{
	Renderer renderer = new Renderer();
	
	public boolean mostrarImagem () { 
		
		System.out.println ( "Mostrando uma imagem no smartphone..." );
		return false; 

	}
}
