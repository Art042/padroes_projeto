package atividade_3.q_2;

import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private String cidade;
    private String editores;
    private String nomeOriginal;
    private List<String> autores;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    private Livro() {}

    public static Builder builder() {
        return new Builder();
    }

    public String getnomeNacional() {
        return nomeNacional;
    }

    public int getano() {
        return ano;
    }

    public String getcidade() {
        return cidade;
    }

    public String geteditores() {
        return editores;
    }

    public List<String> getTradutores() {
		return tradutores;
	}


	public List<String> getAutores() {
		return autores;
	}


	public String getNomeOriginal() {
		return nomeOriginal;
	}


	public int getPaginas() {
		return paginas;
	}


	public long getIsbn() {
		return isbn;
	}


	public static class Builder {
        private Livro livro;

        public Builder() {
            livro = new Livro();
        }

        public Builder nomeNacional(String nomeNacional) {
            livro.nomeNacional = nomeNacional;
            return this;
        }
        
        public Builder nomeOriginal(String nomeOriginal) {
            livro.nomeOriginal = nomeOriginal;
            return this;
        }

        public Builder ano(int ano) {
            livro.ano = ano;
            return this;
        }
        
        public Builder isbn(long isbn) {
            livro.isbn = isbn;
            return this;
        }
        
        public Builder paginas(int paginas) {
            livro.paginas = paginas;
            return this;
        }
        
        public Builder autores(List<String> autores) {
        	livro.autores = autores;
        	return this;
        }
        
        
        
        public Builder tradutores(List<String> tradutores) {
        	livro.tradutores = tradutores;
        	return this;
        }

        public Builder cidade(String cidade) {
            livro.cidade = cidade;
            return this;
        }

        public Builder editores(String editores) {
        	livro.editores = editores;
            return this;
        }

        public Livro build() {
            return livro;
        }
    }
}
