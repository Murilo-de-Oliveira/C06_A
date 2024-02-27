import java.util.Random;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num_game = random.nextInt(1,11);
        int num;
        boolean win = false;

        System.out.println("Bem vindo ao adivinhe o número!");
        do{
            System.out.print("Escolha um número entre 1 e 10: ");
            num = input.nextInt();
            if(num == num_game){
                win = true;
            }
            else{
                System.out.println("Que pena, você errou!");
            }
        }while(!win);
        System.out.println("Parabéns, você venceu!");
        input.close();
    }
}
