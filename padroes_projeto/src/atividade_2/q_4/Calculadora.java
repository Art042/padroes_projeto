package atividade_2.q_4;

public class Calculadora {

    private Desconto_Contexto descontocontexto;

    //Pre�o Normal (Com desconto)
    public double calcular(double Valor_Original){
        return Valor_Original - (Valor_Original * descontocontexto.executa());
    }

    //Promo��es Especiais
    public double calcular(double Valor_Original,double descontoEspecial){
    	descontocontexto.setDesconto(new Promocoes(descontoEspecial)); 
        return calcular(Valor_Original);
    }

}
