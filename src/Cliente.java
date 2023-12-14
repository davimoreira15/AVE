
    class Cliente extends Pessoa {
        public Cliente(String nome, String CPF, String telefone, String senha) {
            super(nome, CPF, telefone, senha);
        }

        public boolean confirmaUsuario(String nome) {
            return this.getNome().equals(nome);
        }
    }

