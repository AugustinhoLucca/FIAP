import java.util.Scanner;
public class teste002 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual o primeiro valor?");
        float valor1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Qual o segundo valor?");
        float valor2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Qual o terceiro valor?");
        float valor3 = Float.parseFloat(entrada.nextLine());

        float media = (valor1 + valor2 + valor3) / 3.0f;

        System.out.printf(nome +",a média dos valores é %.1f.", media);
    }
}
