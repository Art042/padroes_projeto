package atividade_3.q_5;

import java.text.SimpleDateFormat;
import java.util.Date;

class EUAData implements FormatoData {
    public String format(Date date) {
        return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }
}
