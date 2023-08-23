import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Random gerador = new Random();
        int valor = gerador.nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número que foi gerado entre 0 e 100: ");
            Scanner tentativa = new Scanner(System.in);
            int palpite = tentativa.nextInt();

            if (palpite < valor) {
                System.out.println("O número que você chutou é menor que o número gerado!");
            } else if (palpite == valor) {
                System.out.println("Parabéns, você acertou o número em " + i + " tentativas!");
                break;
            } else {
                System.out.println("O número que você chutou é maior que o número gerado!");
            }
        }

        System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + valor);
    }
}
