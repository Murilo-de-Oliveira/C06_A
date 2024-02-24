import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int numero_alunos = entrada.nextInt();
        switch (numero_alunos){
            case 10, 20:
                System.out.println("A sala é I-16");
                break;
            case 30:
                System.out.println("A sala é I-22");
                break;
            default:
                System.out.println("O número inserido é inválido");
        }
    }
}
