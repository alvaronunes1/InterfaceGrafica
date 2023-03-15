import javax.swing.*;

public class framesPanels {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Interface Grafica");
        JButton botao = new JButton("Botão Swing");
        JLabel texto = new JLabel("Numero de clicks: 0");
        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);
        janela.setSize(300,200);
    }
}
