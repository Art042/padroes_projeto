package atividade_3.q_1;


class ContatoTelefoneBuilder implements Builder {
    private String nome;
    private String telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "ContatoTelefone: " + nome + ", " + telefone;
    }

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}