package atividade_4.q_4.Composite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import atividade_4.q_4.Composite.Enums.MensagensErro;

public class Diretorio extends Elemento {
    private File diretorio;
    private List<Elemento> elementos;

    public Diretorio(String nomeDiretorio) throws IOException {
        diretorio = new File(nomeDiretorio);
        if (!diretorio.isDirectory()) {
            throw new IOException(MensagensErro.DIRETORIO_NAO_ENCONTRADO.getMessage());
        }

        elementos = new ArrayList<>();
        File[] arquivos = diretorio.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                try {
                    if (arquivo.isFile()) {
                        elementos.add(new Arquivo(arquivo.getPath()));
                    } else if (arquivo.isDirectory()) {
                        elementos.add(new Diretorio(arquivo.getPath()));
                    }
                } catch (IOException e) {
                    System.out.println(MensagensErro.NAO_FOI_POSSIVEL_LER_ARQUIVO.getMessage() + arquivo.getName());
                }
            }
        }
    }

    //Calculo de tamanho do Diretório somado por tamanho de arquivos
    public long tamanho() {
        long tamanhoTotal = 0;

        if (elementos != null) {
            for (Elemento elemento : elementos) {
                tamanhoTotal += elemento.tamanho();
            }
        }

        return tamanhoTotal;
    }
}
