import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite a Agência!");
        String agencia = scanner.nextLine();
        try {
            System.out.println("Por favor, digite o número da Agência!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, informe um saldo!");
            double saldo = scanner.nextDouble();

            scanner.close();

            System.out.println("Olá"
                    .concat(", ")
                    .concat(nomeCliente)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(agencia)
                    .concat(", conta " + numero)
                    .concat(" e seu saldo " + String.format("%.2f",saldo))
                    .concat(" já está disponível para saque"));

        } catch (InputMismatchException e) {
            System.out.println("Erro! O valor que você informou está incorreto, por favor informe apenas números válidos!");
        }

    }
}
