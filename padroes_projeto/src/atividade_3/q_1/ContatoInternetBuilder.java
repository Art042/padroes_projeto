package atividade_3.q_1;

class ContatoInternetBuilder implements Builder {
    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ContatoInternet: " + nome + ", " + email;
    }

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		
	}
}