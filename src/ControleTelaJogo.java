import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControleTelaJogo implements KeyListener , ActionListener {
    private TelaJogo tela;
    this.tela.getStatusPanel().getVoltar().addActionListener(this);

    private void voltarMenu(){
        stop();
        ControleTelaMenu.mostraTelaMenu();
        this.tela.setVisible(false);
        this.tela.dispose();
    }

    public ControleTelaJogo(TelaJogo tela) {
        super();
        this.tela = tela;
    }

// pressiona tecla
    @Override
    public void keyPressed(KeyEvent e) {

    }
// solta a tecla
    @Override
    public void keyReleased(KeyEvent e) {

    }
    // quando esta digitando
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        voltarMenu()
    }
}
