package atividade_4.q_4.Composite.Enums;

public enum MensagensErro {
    ARQUIVO_NAO_ENCONTRADO("Arquivo não encontrado."),
    DIRETORIO_NAO_ENCONTRADO("Diretório não encontrado."),
    ARQUIVO_DIRETORIO_NAO_ENCONTRADO("Arquivo ou diretório não encontrado."),
    NAO_FOI_POSSIVEL_LER_ARQUIVO("Não foi possível ler o arquivo: "),
	DIRETORIO_NAO_FORNECIDO("Diretório não fornecido! Forneça um diretório para a busca");

    private final String mensagem;

    MensagensErro(String message) {
        this.mensagem = message;
    }

    public String getMessage() {
        return mensagem;
    }

}
