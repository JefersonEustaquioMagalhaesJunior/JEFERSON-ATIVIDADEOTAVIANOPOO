public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            this.largura = 1.0;
        }
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1.0;
        }
    }
    public double calcularArea() {
        return largura * altura;
    }
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
    public void exibirDados() {
        System.out.println("===== DADOS DO RETÂNGULO =====");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
