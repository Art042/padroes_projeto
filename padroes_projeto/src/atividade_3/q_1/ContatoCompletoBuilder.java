package atividade_3.q_1;

class ContatoCompletoBuilder implements Builder {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ContatoCompleto: " + nome + ", " + endereco + ", " + telefone + ", " + email;
    }
}