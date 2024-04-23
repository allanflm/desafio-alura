import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Allan";
        String tipoConta = "Corrente";
        double saldo = 1999.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("***********************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual é o valor que voce deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é de: R$" + valor);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valo que voce deseja receber.");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu novo valor é de: R$" + saldo);
            }else if(opcao != 4){
                System.out.println("ERRO - Opção invalida!");
            }
        }
    }
}