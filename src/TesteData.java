
public class TesteData {
    public static void main(String[] args) {
        Data data = new Data(12, 10, 2023);
        System.out.println("Data inicial: " + data);

        data.avancarDias(10);
        System.out.println("Avançar 10 dias: " + data);

        data.retrocederDias(20);
        System.out.println("Retroceder 20 dias: " + data);
    }
}
