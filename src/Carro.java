public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }
    public void acelerar(double valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("Carro acelerou!");
        } else {
            System.out.println("Valor de aceleração inválido!");
        }
    }
    public void frear(double valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Carro freou!");
        } else {
            System.out.println("Valor de frenagem inválido!");
        }
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
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
    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }
    public void exibirDados() {
        System.out.println("===== DADOS DO CARRO =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
