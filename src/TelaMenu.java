import javax.swing.*;
import java.awt.*;

public class TelaMenu extends TelaBase{
    private JButton novoJogo;
    private JButton instrucoes;
    private JButton sair;

    public TelaMenu() throws HeadlessException {
        super();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        novoJogo = new JButton("Novo Jogo");
        instrucoes = new JButton("Instruções");
        sair = new JButton("Sair");

        add(novoJogo);
        add(instrucoes);
        add(sair);

        ControleTelaMenu controle = new ControleTelaMenu(this);
        novoJogo.addActionListener(controle);
        instrucoes.addActionListener(controle);
        sair.addActionListener(controle);

        setVisible(true);
    }

    public JButton getNovoJogo() {
        return novoJogo;
    }

    public JButton getInstrucoes() {
        return instrucoes;
    }

    public JButton getSair() {
        return sair;
    }
}
