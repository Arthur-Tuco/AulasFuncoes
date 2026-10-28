import java.util.Scanner;

public class Exemplo1Funcoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número 1: ");
        int x = scan.nextInt();

        System.out.println("Número 2: ");
        int y = scan.nextInt();

        int menor = minimo(x, y);
        System.out.println(menor);
    }
    static int minimo(int a, int b){
        int menor;

        if (a < b){
            menor = a;
        }
        else {
            menor = b;
        }
        return menor;
    }
}