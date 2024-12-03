public class PrincipalUniversidade {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        System.out.println(einstein.informaNome() + " trabalhou na universidade " + princeton.getNome());
        System.out.println(newton.informaNome() + " trabalhou na universidade " + cambridge.getNome());
    }
}
