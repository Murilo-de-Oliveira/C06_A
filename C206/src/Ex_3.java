import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a nota da NPA: ");
        int npa = entrada.nextInt();
        if(npa >= 60){
            System.out.println("Aluno aprovado! Nota: " + npa);
        }
        else{
            if(npa >= 30){
                System.out.print("Insira a nota da NP3: ");
                int np3 = entrada.nextInt();
                if((npa + np3) / 2 >= 50){
                    System.out.println("Aluno aprovado! Nota: " + ((npa + np3) / 2));
                }
                else{
                    System.out.println("Aluno reprovado! Nota: " + ((npa + np3) / 2));
                }
            }
            else{
                System.out.println("Aluno reprovado! Nota: " + npa);
            }
        }
        entrada.close();
    }
}
