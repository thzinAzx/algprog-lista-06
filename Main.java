import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Vetor 5 inteiros");
            System.out.println("2 - Vetor 10 reais (ordem inversa)");
            System.out.println("3 - 4 notas e média");
            System.out.println("4 - Consoantes");
            System.out.println("5 - Pares e Ímpares");
            System.out.println("6 - Média de 10 alunos");
            System.out.println("7 - Soma e multiplicação");
            System.out.println("8 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: exercicio1(); break;
                case 2: exercicio2(); break;
                case 3: exercicio3(); break;
                case 4: exercicio4(); break;
                case 5: exercicio5(); break;
                case 6: exercicio6(); break;
                case 7: exercicio7(); break;
                case 8: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 8);
    }

    // 1
    public static void exercicio1() {
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2
    public static void exercicio2() {
        double[] vetor = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // 3
    public static void exercicio3() {
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;

        System.out.println("Notas:");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\nMédia: " + media);
    }

    // 4
    public static void exercicio4() {
        char[] vetor = new char[10];
        int consoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um caractere: ");
            vetor[i] = scanner.next().charAt(0);
        }

        System.out.println("Consoantes:");
        for (char c : vetor) {
            if ("aeiouAEIOU".indexOf(c) == -1) {
                System.out.print(c + " ");
                consoantes++;
            }
        }

        System.out.println("\nTotal de consoantes: " + consoantes);
    }

    // 5
    public static void exercicio5() {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int p = 0, i = 0;

        for (int j = 0; j < 20; j++) {
            System.out.print("Digite um número: ");
            numeros[j] = scanner.nextInt();

            if (numeros[j] % 2 == 0) {
                pares[p++] = numeros[j];
            } else {
                impares[i++] = numeros[j];
            }
        }

        System.out.println("Todos:");
        for (int n : numeros) System.out.print(n + " ");

        System.out.println("\nPares:");
        for (int j = 0; j < p; j++) System.out.print(pares[j] + " ");

        System.out.println("\nÍmpares:");
        for (int j = 0; j < i; j++) System.out.print(impares[j] + " ");
    }

    // 6
    public static void exercicio6() {
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;

            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota: ");
                soma += scanner.nextDouble();
            }

            medias[i] = soma / 4;

            if (medias[i] >= 7) {
                aprovados++;
            }
        }

        System.out.println("Alunos com média >= 7: " + aprovados);
    }

    // 7
    public static void exercicio7() {
        int[] vetor = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
            mult *= vetor[i];
        }

        System.out.println("Números:");
        for (int n : vetor) System.out.print(n + " ");

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + mult);
    }
}