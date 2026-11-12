public class Pessoa {
private String nome;
private int idade;
private String cpf;

public Pessoa(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    if (nome != null && !nome.trim().isEmpty()) {
        this.nome = nome;
    }
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    if (idade >= 0) {
        this.idade = idade;
    }
}
public String getCpf() {
    return cpf;
}
public void exibirDados() {
    System.out.println("===== DADOS DO PARTICIPANTE =====");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + cpf);
}
}