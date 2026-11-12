public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    public void exibirDados() {
        System.out.println("===== DADOS DO PRODUTO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }
}
