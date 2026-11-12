public class Principal {
    public static void main(String[] args) {

        // Atividade 1
        Fatura fatura = new Fatura(
                101,
                "Teclado",
                2,
                75.50
        );
        System.out.println("===== DADOS DA FATURA =====");
        System.out.println("Número do item: " + fatura.getNumeroItem());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço unitário: R$ " + fatura.getPrecoUnitario());
        System.out.println("Valor total da fatura: R$ " + fatura.calcular_valor_Fatura());
    }
}
// Atividade 2
Elevador elevador = new Elevador();

        elevador.inicializar(10, 5);
        elevador.entrar();
        elevador.subir();
        elevador.sair();
        elevador.descer();

        System.out.println("Pessoas: " + elevador.getPessoasPresentes());
        System.out.println("Andar: " + elevador.getAndarAtual());
        System.out.println("Capacidade: " + elevador.getCapacidade());
        }
        }

// Atividade 1.1
Pessoa pessoa = new Pessoa(
        "Carlos Silva",
        25,
        "123.456.789-00"
);
        pessoa.exibirDados();
        pessoa.setNome("Carlos Oliveira");
        pessoa.setIdade(26);
        pessoa.setCpf("987.654.321-00");

        System.out.println("\n===== DADOS ATUALIZADOS =====");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
        }
        }

public static void main(String[] args) {

    // Atividade 1.2
    Produto produto = new Produto("Notebook", 3500.00, 10);

    produto.exibirDados();
    produto.setNome("Notebook Dell");
    produto.setPreco(4000.00);
    produto.setQuantidade(15);

    System.out.println("\n===== PRODUTO ATUALIZADO =====");
    System.out.println("Nome: " + produto.getNome());
    System.out.println("Preço: R$ " + produto.getPreco());
    System.out.println("Quantidade: " + produto.getQuantidade());
    System.out.println("Total em estoque: R$ " + produto.calcularValorTotal());
}
}

// Atividade 1.3
ContaBancaria conta = new ContaBancaria(12345, "João Silva");

        conta.exibirDados();

        System.out.println("\n===== DEPÓSITOS =====");
        conta.depositar(1000.00);
        conta.depositar(500.00);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        System.out.println("\n===== SAQUE =====");

        conta.sacar(300.00);
        conta.sacar(2000.00);
        System.out.println("\n===== DADOS ATUALIZADOS =====");
        conta.exibirDados();
    }
            }

// Atividade 1.4
Carro carro = new Carro("Toyota", "Corolla", 2024);

        carro.exibirDados();

        System.out.println("\n===== ACELERANDO =====");
        carro.acelerar(50);
        carro.acelerar(30);
        System.out.println("Velocidade atual: " +carro.getVelocidadeAtual() + " km/h");
        System.out.println("\n===== FRENANDO =====");
        carro.frear(20);
        System.out.println("Velocidade atual: " +carro.getVelocidadeAtual() + " km/h");
        carro.frear(100);
        System.out.println("\n===== DADOS FINAIS =====");
        carro.exibirDados();
    }
            }

// Ativiade 1.5
Livro livro = new Livro(
        "Dom Casmurro",
        "Machado de Assis",
        1899
);
        livro.exibirDados();

        System.out.println("\n===== EMPRÉSTIMO =====");
        livro.emprestar();

        System.out.println("Disponível: " + livro.isDisponivel());
        System.out.println("\n===== DEVOLUÇÃO =====");
        livro.devolver();
        System.out.println("Disponível: " + livro.isDisponivel());
        System.out.println("\n===== DADOS FINAIS =====");
        livro.exibirDados();
    }
            }

// Atividade 1.6
Funcionario funcionario = new Funcionario(
        "Maria Oliveira",
        3000.00,
        "Analista de Sistemas"
);
        funcionario.exibirDados();
        funcionario.setNome("Maria Silva");
        funcionario.setSalarioBase(4000.00);
        funcionario.setCargo("Desenvolvedora");

        System.out.println("\n===== DADOS ATUALIZADOS =====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário base: R$ " +funcionario.getSalarioBase());
        System.out.println("Salário líquido: R$ " +funcionario.calcularSalarioLiquido());
        }
        }

// Atividade 1.7
Retangulo retangulo = new Retangulo(5.0, 3.0);

        retangulo.exibirDados();
        retangulo.setLargura(8.0);
        retangulo.setAltura(4.0);

        System.out.println("\n===== RETÂNGULO ATUALIZADO =====");
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        }
        }

// Atividade 1.8
Aluno aluno = new Aluno(12345, "João Silva", 8.5);
        aluno.exibirDados();

Aluno aluno2 = new Aluno(67890, "Maria Oliveira", 5.0);
        System.out.println("\n===== SEGUNDO ALUNO =====");
        aluno2.exibirDados();

        aluno2.setMediaFinal(7.0);
        System.out.println("\n===== APÓS ALTERAÇÃO =====");
        aluno2.exibirDados();
    }
            }


// Ativiadem 1.9
Filme filme = new Filme(
        "Interestelar",
        "Christopher Nolan",
        2014,
        169
);
        filme.exibirInformacoes();
        filme.setTitulo("A Origem");
        filme.setAnoLancamento(2010);
        filme.setDuracao(148);
        System.out.println("\n===== FILME ATUALIZADO =====");

        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Ano: " + filme.getAnoLancamento());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
        }
        }

// 1.10
Celular celular = new Celular(
        "Samsung",
        "Galaxy S20",
        3999.90,
        256
);
        celular.exibirResumo();
        celular.setModelo("Galaxy S20 Ultra");
        celular.setPreco(5499.90);
        celular.setArmazenamento(512);
        System.out.println("\n===== CELULAR ATUALIZADO =====");

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Preço: R$ " + celular.getPreco());
        System.out.println("Armazenamento: " +celular.getArmazenamento() + " GB");
        }
        }