import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

//Declaração de Variável
        int numeroConta; //Armazena o número da Conta Bancária
        String numeroAgencia; //Armazena o número da Agência Bancária
        String nomeCliente; //Armazena o nome do cliente
        Double saldoConta; //Armazena o saldo da Conta Bancária
        
        Scanner leitor = new Scanner(System.in);  


//Entrada de Dados
        System.out.println("Digite o número da Conta: ");
        numeroConta = leitor.nextInt();

        System.out.println("Digite o número da Agência: ");
        numeroAgencia = leitor.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = leitor.next();

        System.out.println("Digite o valor a ser investido");
        saldoConta = leitor.nextDouble();


//Exibir as mensagens conta criada
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Número da Agência: " + numeroAgencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("O valor depositado foi: " + saldoConta);
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia+ ",conta " +numeroConta+ " e seu saldo de " +saldoConta+ " reais já está disponível para saque");

        leitor.close();
    }
}
