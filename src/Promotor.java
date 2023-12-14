
    class Promotor extends Pessoa {
        private String CNPJ;
        private String endereco;

        public Promotor(String nome, String CPF, String telefone, String senha, String CNPJ, String endereco) {
            super(nome, CPF, telefone, senha);
            this.CNPJ = CNPJ;
            this.endereco = endereco;
        }

        public void publicaEvento(Evento evento) {
            System.out.println("Evento publicado");
        }
    }

