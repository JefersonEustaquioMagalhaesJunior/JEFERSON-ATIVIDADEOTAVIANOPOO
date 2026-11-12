public class Fatura {
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(int numeroItem, String descricao, int quantidade, double precoUnitario) {

        this.numeroItem = numeroItem;
        this.descricao = descricao;

        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double calcular_valor_Fatura() {
        return quantidade * precoUnitario;
    }
    public int getNumeroItem() {
        return numeroItem;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}