import java.util.ArrayList;

class CarrinhoCompras {
        private ArrayList<ItemCompra> itensCompra;

        public CarrinhoCompras() {
            this.itensCompra = new ArrayList<>();
        }

        public void inserirIngresso(ItemCompra item) {
            this.itensCompra.add(item);
        }

        public void excluirIngresso() {

        }

        public void alterarCompra(ItemCompra item) {

        }

        public void finalizarCompra() {

        }
    }

