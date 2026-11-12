public class Elevador {
    private int andarAtual;
    private int capacidade;
    private int pessoasPresentes;
    private int totalAndares;

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }
    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Pessoa entrou no elevador.");
        } else {
            System.out.println("Elevador lotado!");
        }
    }
    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Pessoa saiu do elevador.");
        } else {
            System.out.println("Elevador vazio!");
        }
    }
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu um andar.");
        } else {
            System.out.println("Já está no último andar!");
        }
    }
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu um andar.");
        } else {
            System.out.println("Já está no térreo!");
        }
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        if (capacidade >= 0 && capacidade >= pessoasPresentes) {
            this.capacidade = capacidade;
        }
    }
    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
    public void setPessoasPresentes(int pessoasPresentes) {
        if (pessoasPresentes >= 0 && pessoasPresentes <= capacidade) {
            this.pessoasPresentes = pessoasPresentes;
        }
    }
}
