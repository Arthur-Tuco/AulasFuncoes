import java.util.Scanner;

public class calculadoraSimples {
    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora Simples ---");
        System.out.println("1. Soma");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Opção (número): ");
        int opcao = sc.nextInt();

        return opcao;
    }

    public static float entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada dados ---");
        System.out.println("Número: ");
        return sc.nextFloat();
    }

    public static float adicao(float x, float y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada dados 2 ---");
        return x + y;
    }

    public static float subtracao(float n1, float n2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada dados 3 ---");
        return n1 - n2;
    }

    public static float multiplicacao(float n1, float n2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada dados 4 ---");
        return n1 * n2;
    }

    public static float divisao(float n1, float n2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada dados 5 ---");
        return n1 / n2;
    }

    public static void imprimeDados(float resultado) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Imprimir dados ---");
        System.out.println("Resultado: " + resultado);
    }

    public static float controle(int op, float n1, float n2) {
        System.out.println("--- Controlador ---");
        float resultado = 0;

        if (op == 1) {
            resultado = adicao(n1, n2);
        }
        if (op == 2) {
            resultado = subtracao(n1, n2);
        }
        if (op == 3) {
            resultado = multiplicacao(n1, n2);
        }
        if (op == 4) {
            resultado = divisao(n1, n2);
        }
        if (op >= 5 || op < 0) {
            System.out.println("Opção inválida");
        }
        return resultado;
    }

    public static void main(String[] args) {
        int opcao = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float resultado = controle(opcao, n1, n2);
        imprimeDados(resultado);
    }
}
