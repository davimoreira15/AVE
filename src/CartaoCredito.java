

    class CartaoCredito {
        private char numCartao;
        private String bandeiraCartao;
        private char digitoVerificador;
        private String nomeTitular;

        public CartaoCredito(char numCartao, String bandeiraCartao, char digitoVerificador, String nomeTitular) {
            this.numCartao = numCartao;
            this.bandeiraCartao = bandeiraCartao;
            this.digitoVerificador = digitoVerificador;
            this.nomeTitular = nomeTitular;
        }
    }

