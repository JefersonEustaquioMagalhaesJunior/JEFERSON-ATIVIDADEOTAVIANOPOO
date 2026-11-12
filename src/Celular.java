public class Celular {
    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    public Celular(String marca, String modelo,
                   double preco, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.armazenamento = armazenamento;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPreco() {
        return preco;
    }
    public int getArmazenamento() {
        return armazenamento;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        }
    }
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        }
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    public void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        }
    }
    public void exibirResumo() {
        System.out.println("===== RESUMO DO CELULAR =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }
}
