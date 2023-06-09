package atividade_4.q_4.Composite.Enums;

public enum MensagensErro {
    ARQUIVO_NAO_ENCONTRADO("Arquivo n�o encontrado."),
    DIRETORIO_NAO_ENCONTRADO("Diret�rio n�o encontrado."),
    ARQUIVO_DIRETORIO_NAO_ENCONTRADO("Arquivo ou diret�rio n�o encontrado."),
    NAO_FOI_POSSIVEL_LER_ARQUIVO("N�o foi poss�vel ler o arquivo: "),
	DIRETORIO_NAO_FORNECIDO("Diret�rio n�o fornecido! Forne�a um diret�rio para a busca");

    private final String mensagem;

    MensagensErro(String message) {
        this.mensagem = message;
    }

    public String getMessage() {
        return mensagem;
    }

}
