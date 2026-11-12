public class Aluno {
    private int matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }
    public boolean verificarAprovacao() {
        return mediaFinal >= 6;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getMediaFinal() {
        return mediaFinal;
    }
    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    public void setMediaFinal(double mediaFinal) {
        if (mediaFinal >= 0 && mediaFinal <= 10) {
            this.mediaFinal = mediaFinal;
        }
    }
    public void exibirDados() {
        System.out.println("===== DADOS DO ALUNO =====");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Média final: " + mediaFinal);
        if (verificarAprovacao()) {System.out.println("Situação: APROVADO");
        } else {System.out.println("Situação: REPROVADO");
        }
    }
}
