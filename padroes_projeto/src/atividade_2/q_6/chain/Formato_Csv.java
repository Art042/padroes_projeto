package atividade_2.q_6.chain;

import atividade_2.q_6.Conta;
import atividade_2.q_6.Formato;
import atividade_2.q_6.Requisicao;

public class Formato_Csv  extends Formato_Chain{
	  public Formato_Csv() {
	        super(null);
	    }

	    @Override
	    public boolean formatoCerto(Requisicao requisicao) {
	        if(requisicao.getFormato() == Formato.CSV) {
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public String getFormatado(Requisicao requisicao, Conta conta) {
	        if(formatoCerto(requisicao)){
	            String formatoCSV = conta.getNumero() + "%" + conta.getSaldo();
	            return  formatoCSV;
	        }else{
	            if(this.nextFormato != null){
	                return this.nextFormato.getFormatado(requisicao, conta);
	            }else{
	                return "Formato nao localizado.";
	            }
	        }
	    }

}
