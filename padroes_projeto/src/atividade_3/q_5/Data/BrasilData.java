package atividade_3.q_5.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

class BrasilData implements FormatoData {
    public String format(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}