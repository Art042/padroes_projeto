package atividade_3.q_5.Factory;

public class FormatoPais {
    public static AbstractFactory getFactory(String localeCode) {
        switch(localeCode) {
            case "BR":
                return new Brasil();
            case "US":
                return new EUA();
            default:
                throw new IllegalArgumentException("Código de localidade inválido.");
        }
    }
}