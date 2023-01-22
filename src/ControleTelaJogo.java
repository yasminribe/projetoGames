import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControleTelaJogo implements KeyListener, ActionListener, Runnable {
    private TelaJogo tela;

    private boolean cima;
    private boolean baixo;
    private boolean esquerda;
    private boolean direita;

    private volatile boolean pausado;

    private Thread loop;

    public ControleTelaJogo(TelaJogo tela) {
        this.tela = tela;

        cima = false;
        baixo = false;
        esquerda = false;
        direita = true;
        pausado = true;
        loop = new Thread(this);

        this.tela.getStatusPanel().getVoltar().addActionListener(this);

    }
    public void iniciar() {
        pausado = false;
        tela.getGamePanel().getTimer().start();
        loop.start();
    }

    private void atualizar() {
        if (cima) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.CIMA);
        } else if (baixo) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.BAIXO);
        } else if (esquerda) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.ESQUERDA);
        } else if (direita) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.DIREITO);
        }
    }
    private void voltarMenu() {
        stop();
        ControleTelaMenu.mostraTelaMenu();
        this.tela.setVisible(false);
        this.tela.dispose();
    }
    // pressiona tecla
    @Override

    public void run() {
        while (!pausado) {
            try {
                Thread.sleep(1000 / 5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            atualizar();
        }
    }

    public void stop() {
        pausado = true;
        tela.getGamePanel().getTimer().stop();
    }


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && !baixo) {
            cima = true;
            esquerda = false;
            direita = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && !cima) {
            baixo = true;
            esquerda = false;
            direita = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && !direita) {
            baixo = false;
            esquerda = true;
            cima = false;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && !esquerda) {
            baixo = false;
            cima = false;
            direita = true;
        }
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
        voltarMenu();
    }
}
