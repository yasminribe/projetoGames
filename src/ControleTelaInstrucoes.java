import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleTelaInstrucoes implements ActionListener {
private TelaInstrucoes tela;

    public ControleTelaInstrucoes(TelaInstrucoes tela) {
        super();
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControleTelaMenu.mostraTelaMenu();
        tela.dispose();
    }
}
