//Conhecer e importar a classe Scanner

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        String nomeCliente;
        String agencia;
        int numero;
        float saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Obter pela Scanner os valores digitados no terminal
        //Exibir as mensagens para o nosso usuário
        System.out.println("\nSeja bem-vind@!");
        System.out.println("Por gentileza, digite abaixo alguns dados referentes a sua conta.");

        System.out.println("\nNome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("\nAgência: ");
        agencia = scanner.nextLine();

        System.out.println("\nNúmero: ");
        numero = scanner.nextInt();

        System.out.println("\nSaldo: ");
        saldo = scanner.nextFloat();

        scanner.close();

        nomeCliente = nomeCliente.toUpperCase();

        //Exibir a mensagem final da conta criada
        System.out.println(
                "\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.\n");
    }
}
