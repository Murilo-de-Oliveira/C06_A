import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lanche1 = entrada.nextInt();
        int lanche2 = entrada.nextInt();
        int lanche3 = entrada.nextInt();
        int total = lanche1 + lanche2 + lanche3;
        float media = total/3f;
        System.out.println("Total de lanches: " + total);
        System.out.println("Média dos lanches: " + media);
        entrada.close();
    }
}
