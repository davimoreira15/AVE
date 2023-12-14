import java.util.Date;
class Pagamento {
    private Date dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;
    private double desconto;

    public Pagamento(Date dataHoraPagamento, int numeroPagamento, double valorPago, double desconto) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
        this.desconto = desconto;
    }


    public Date getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(Date dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean consultarPagamento(int numeroPagamento) {
        return this.numeroPagamento == numeroPagamento;
    }

    public void gerarImpressaoPagamento(Pedido pedido) {
        System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
        System.out.println("Data e Hora do Pedido: " + pedido.getDataHoraPedido());
        System.out.println("Valor Total do Pedido: " + pedido.getValorTotal());
        System.out.println("Status do Pedido: " + pedido.getStatusPedido());
        System.out.println("Data e Hora do Pagamento: " + this.dataHoraPagamento);
        System.out.println("Valor Pago: " + this.valorPago);
    }
}
