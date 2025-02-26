import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String tipoDeConta = "Conta corrente";
        String chavePix = "21521k5210alda12";
        double saldo = 2150.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;

        Scanner le = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = le.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo bancário é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = le.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = le.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcão inválida!");
            }
        }
    }
}

