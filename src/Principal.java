import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        LocalDate dataAtual = LocalDate.now();

        einstein.calculaIdade(dataAtual);
        newton.calculaIdade(dataAtual);

        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos hoje.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos hoje.");
    }
}
