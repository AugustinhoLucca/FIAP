import javax.swing.JButton;
import javax.swing.JFrame;

public class testeSwing {
}

public static void main(String[] args) {

    JFrame janela = new JFrame("Exemplo");

    JButton botao = new JButton("Clique aqui");
    janela.add(botao);

    janela.setSize(300, 150);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
}