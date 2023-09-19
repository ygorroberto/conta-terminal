import java.util.Locale;
import java.util.Scanner;

/**
 * <h3>Conta Terminal</h3>
 * Programa que recebe os parâmetros do usuário
 * e depois lista-os conforme digitado.
 * <p>Elaborado para o curso da DIO (Java)
 * em parceria com a Fundacão Bradesco.</p>
 *
 * @author Ygor Roberto Guedes
 *
 * @param Integer numeroConta   - Recebe o número da conta.
 * @param String numeroAgencia  - Recebe o número da agência.
 * @param String nomeCliente    - Recebe o nome do cliente.
 * @param Double saldo          - Recebe o saldo.
 */
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\n");
        System.out.println("-------------------------------------------");

        System.out.println("O número da conta digitada é: " + numeroConta);
        System.out.println("O número da agência é: " + numeroAgencia);
        System.out.println("O nome do cliente é: " + nomeCliente);
        System.out.println("O saldo da conta é: " + saldo);

    }
}
