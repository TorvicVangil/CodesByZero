import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate dataNascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public void calculaIdade(LocalDate dataAtual) {
        this.idade = (int) ChronoUnit.YEARS.between(dataNascimento, dataAtual);
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }
}
