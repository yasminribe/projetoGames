
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControleTelaJogo implements KeyListener, Runnable {
    private TelaJogo tela;

    private boolean cima;
    private boolean baixo;
    private boolean esquerda;
    private boolean direito;

    private volatile boolean pausado;

    private Thread loop;

    public ControleTelaJogo(TelaJogo tela) {
        this.tela = tela;

        cima = false;
        baixo = false;
        esquerda = false;
        direito = true;
        pausado = true;
        loop = new Thread(this);


    }
    public void iniciar() {
        pausado = false;
        tela.getGamePanel().getTimer().start();
        loop.start();
    }

    public  void atualizar() {
        if (cima) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.CIMA);
        } else if (baixo) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.BAIXO);
        } else if (esquerda) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.ESQUERDA);
        } else if (direito) {
            tela.getGamePanel().getCobrinha().atualizar(Cobrinha.DIREITO);
        }
    }
    private void voltarMenu() {
        stop();
        ControleTelaMenu.mostraTelaMenu();
        this.tela.setVisible(false);
        this.tela.dispose();
    }
    public void stop() {
        pausado = true;
        tela.getGamePanel().getTimer().stop();
    }

    // colizão
private boolean colidiu(Elemento a , Elemento b){
if (a.getX() == b.getX() && a.getY() == b.getY()){
    return true;
}else {
    return false;
}
}
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



    // pressiona tecla
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && !baixo) {
            cima = true;
            esquerda = false;
            direito = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && !cima) {
            baixo = true;
            esquerda = false;
            direito = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && !direito) {
            esquerda = true;
            baixo = false;
            cima = false;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && !esquerda) {
            direito = true;
            baixo = false;
            cima = false;
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


}
