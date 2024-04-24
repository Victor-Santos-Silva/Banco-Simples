import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Valores do cliente
        String nome = "Harry Potter";
        String tipoConta = "Corrente";
        double saldo = 2500.0;

        //Apresentando os dados para o cliente
        System.out.println("Dados dos Cliente: ");
        System.out.println(nome);
        System.out.println(tipoConta);
        System.out.println("R$ " + saldo);
        System.out.println();

        //Loop + Menu
        do {
                //menu
                System.out.println("Menu: ");
                System.out.println("1 - Consultar Valor");
                System.out.println("2 - Receber Valor");
                System.out.println("3 - Transferir Valor");
                System.out.println("4 - Sair");

                //pegando dado que o usuario inserir
                System.out.print("Digite um numero: ");
                int numero = sc.nextInt();

                //opcoes para o usuario escolher
                switch (numero) {
                    case 1:
                        System.out.println("Vamos consultar Valor");
                        System.out.println();
                        System.out.println("Saldo atual: " + saldo);
                        System.out.println();
                        continue;
                    case 2:
                        System.out.print("Quanto você quer receber?  ");
                        double deposito = sc.nextDouble();
                        System.out.println("Saldo atualizado: " + (saldo += deposito));
                        continue;
                    case 3:
                        System.out.print("Quanto você quer tranferir? ");
                        double tranferencia = sc.nextDouble();

                        if (tranferencia < saldo) {
                            System.out.println("Saldo atualizado: " + (saldo -= tranferencia));
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        continue;
                    case 4: {
                        System.out.println("Você saiu. Obrigado e volte sempre.");
                        System.exit(0);
                    }
                    default:{
                        System.err.println("Tente novamente com os numeros que estão no menu.");
                    }
                }
        }while (true);
    }
}
