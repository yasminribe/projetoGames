import javax.swing.*;
import java.awt.*;

public class TelaInstrucoes extends TelaBase{

    private JButton voltar;

    public TelaInstrucoes() {
        super();

        JLabel lb1 = new JLabel("Instruções");
        lb1.setBounds(12,12,104,15);

        JLabel lb2 = new JLabel("Faça a cobrinha comer as maçãs certas");
        lb2.setBounds(12,29,522,15);

        JLabel lb3 = new JLabel("Movimentação");
        lb3.setBounds(12,112,93,15);

        JLabel lb4 = new JLabel("mova a cobrinha usando as setas do teclado");
        lb4.setBounds(12,213,351,15);

        JLabel lb5 = new JLabel(" ");
        lb5.setIcon(new ImageIcon("res/img/setas.png"));
        lb5.setBounds(362,131,260,180);

        voltar = new JButton("voltar");
        voltar.setBounds(483,366,117,25);

        ControleTelaInstrucoes controle = new ControleTelaInstrucoes(this);
        voltar.addActionListener(controle);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);

        add(voltar);

        setVisible(true);
    }

    public JButton getVoltar() {
        return voltar;
    }
}
