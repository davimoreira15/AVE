import java.util.ArrayList;
import java.util.Date;
class Evento {
    private String nomeEvento;
    private Date dataRealizacao;
    private String descEvento;
    private String local;
    private int qtdeIngresso;
    private double valor;
    private ArrayList<Tag> tags;

    public Evento(String nomeEvento, Date dataRealizacao, String descEvento, String local,
                  int qtdeIngresso, double valor) {
        this.nomeEvento = nomeEvento;
        this.dataRealizacao = dataRealizacao;
        this.descEvento = descEvento;
        this.local = local;
        this.qtdeIngresso = qtdeIngresso;
        this.valor = valor;
        this.tags = new ArrayList<>();
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void inserirTag(Tag tag) {
        this.tags.add(tag);
    }

    public boolean consultarEvento(String nome) {
        return this.nomeEvento.equals(nome);
    }
}
