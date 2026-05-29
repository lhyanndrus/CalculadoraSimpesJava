import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criamos um leitor para capturar o que o usuário digita no teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- CALCULADORA SIMPLES ---");

        // 1. Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        // 2. Entrada do operador matemático
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);

        // 3. Entrada do segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        // 4. Estrutura de decisão para calcular o resultado
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                // Evitando a divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Não é possível dividir por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida! Use +, -, * ou /.");
                operacaoValida = false;
                break;
        }

        // 5. Exibe o resultado se a operação foi válida
        if (operacaoValida) {
            System.out.println("\nResultado: " + numero1 + " " + operacao + " " + numero2 + " = " + resultado);
        }

        // Fechamos o leitor para liberar memória (boa prática)
        leitor.close();
    }
}
