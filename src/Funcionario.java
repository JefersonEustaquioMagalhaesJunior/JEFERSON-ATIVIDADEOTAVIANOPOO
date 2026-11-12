public class Funcionario {
    private String nome;
    private double salarioBase;
    private String cargo;
    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }
    public double calcularSalarioLiquido() {
        double desconto = salarioBase * 0.10;
        return salarioBase - desconto;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public String getCargo() {
        return cargo;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }
    }
    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        }
    }
    public void exibirDados() {
        System.out.println("===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Salário líquido: R$ " + calcularSalarioLiquido());
    }
}
