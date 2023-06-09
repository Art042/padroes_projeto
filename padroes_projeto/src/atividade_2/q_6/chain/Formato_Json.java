package atividade_2.q_6.chain;

import atividade_2.q_6.Conta;
import atividade_2.q_6.Formato;
import atividade_2.q_6.Requisicao;

public class Formato_Json extends Formato_Chain{
    public Formato_Json() {
        super(new Formato_XML());
    }

    public boolean formatoCerto(Requisicao requisicao) {
        if(requisicao.getFormato() == Formato.JSON) {
            return true;
        }
        return false;
    }

    public String getFormatado(Requisicao requisicao, Conta conta) {
        if(formatoCerto(requisicao)){
            String formatoJson = "{\n";
            formatoJson += "\tnumero: " + conta.getNumero() + ",\n";
            formatoJson += "\tsaldo: " + conta.getSaldo() + "\n}";
            return  formatoJson;
        }else{
            if(this.nextFormato != null){
                return this.nextFormato.getFormatado(requisicao, conta);
            }else{
                return "Formato nao localizado.";
            }
        }

    }

}
