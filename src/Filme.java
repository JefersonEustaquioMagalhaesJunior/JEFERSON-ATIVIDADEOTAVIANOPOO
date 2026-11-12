public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public int getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }
    public void setDiretor(String diretor) {
        if (diretor != null && !diretor.trim().isEmpty()) {
            this.diretor = diretor;
        }
    }
    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento > 0) {
            this.anoLancamento = anoLancamento;
        }
    }
    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        }
    }
    public void exibirInformacoes() {
        System.out.println("===== INFORMAÇÕES DO FILME =====");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
    }
}


