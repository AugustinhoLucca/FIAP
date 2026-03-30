import java.util.Scanner;
public class teste001 {
    static void main(String[] args) {
        System.out.println("Seja bem-vindo!");
        Scanner teclado1 = new Scanner(System.in);
        int valor;
        float preco;
        double media;

        System.out.println("Informe um valor inteiro:");
        valor = teclado1.nextInt();
        System.out.println("Informe o preço do produto:");
        preco = teclado1.nextFloat();
        System.out.println("Informe sua média final:");
        media = teclado1.nextDouble();

        teclado1.close();
    }
}
