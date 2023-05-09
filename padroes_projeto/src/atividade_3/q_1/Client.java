package atividade_3.q_1;

class Client {
    public static void main(String[] args) {
        Builder builder_internet = new ContatoInternetBuilder();
        Builder builder_telefone = new ContatoTelefoneBuilder();
        Builder builder_completo = new ContatoCompletoBuilder();

        Director directo_internet = new Director(builder_internet);
        Director directo_telefone = new Director(builder_telefone);
        Director directo_completo = new Director(builder_completo);

        directo_internet.construirContato("Artur", "Rua 666, nº 007", "9999999999", "Artur@acad.ifma.edu.br");
        directo_telefone.construirContato("Artur", "Rua 666, nº 007", "9999999999", "Artur@acad.ifma.edu.br");
        directo_completo.construirContato("Artur", "Rua 666, nº 007", "9999999999", "Artur@acad.ifma.edu.br");

        System.out.println(directo_internet.getContato());
        System.out.println(directo_telefone.getContato());
        System.out.println(directo_completo.getContato());
    }
}