package atividade_4.q_4.Composite;

import java.io.File;
import java.io.IOException;

import atividade_4.q_4.Composite.Enums.MensagensErro;

public class Arquivo extends Elemento {
    private File file;

    public Arquivo(String nomeArquivo) throws IOException {
        file = new File(nomeArquivo);
        if (!file.isFile()) {
            throw new IOException(MensagensErro.ARQUIVO_NAO_ENCONTRADO.getMessage());
        }
    }

    public long tamanho() {
        return file.length();
    }
}
