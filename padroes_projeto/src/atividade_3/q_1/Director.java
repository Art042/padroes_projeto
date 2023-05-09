package atividade_3.q_1;

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construirContato(String nome, String endereco, String telefone, String email) {
        builder.setNome(nome);
        builder.setEndereco(endereco);
        builder.setTelefone(telefone);
        builder.setEmail(email);
    }

    public String getContato() {
        return builder.toString();
    }
}