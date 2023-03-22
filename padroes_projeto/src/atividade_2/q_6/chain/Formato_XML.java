package atividade_2.q_6.chain;

import atividade_2.q_6.Conta;
import atividade_2.q_6.Formato;
import atividade_2.q_6.Requisicao;

public class Formato_XML extends Formato_Chain{
    public Formato_XML() {
        super(new Formato_Csv());
    }

    @Override
    public boolean formatoCerto(Requisicao requisicao) {
        if(requisicao.getFormato() == Formato.XML) {
            return true;
        }
        return false;
    }

    @Override
    public String getFormatado(Requisicao requisicao, Conta conta) {
        if(formatoCerto(requisicao)){
            String formatoXML = "<conta>\n";
            formatoXML += "\t<numero>" + conta.getNumero() + "</numero>\n";
            formatoXML += "\t<saldo>" + conta.getSaldo() + "</saldo>\n</conta>";
            return  formatoXML;
        }else{
            if(this.nextFormato != null){
                return this.nextFormato.getFormatado(requisicao, conta);
            }else{
                return "Formato nao localizado.";
            }
        }
    }
}
