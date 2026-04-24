import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcao;

        do {
            System.out.println(" Calculadora ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = calculadora.somar(a, b);
                        System.out.println("Resultado da soma: " + resultado);
                        break;
                    case 2:
                        resultado = calculadora.subtrair(a, b);
                        System.out.println("Resultado da subtração: " + resultado);
                        break;
                    case 3:
                        try {
                            resultado = calculadora.dividir(a, b);
                            System.out.println("Resultado da divisão: " + resultado);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        resultado = calculadora.multiplicar(a, b);
                        System.out.println("Resultado da multiplicação: " + resultado);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

            System.out.println();

        } while (opcao != 0);

        System.out.println("Calculadora encerrada!");
        scanner.close();
    }
}

