import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControleTelaJogo implements KeyListener {
    private TelaJogo tela;

    private  boolean cima;
    private boolean baixo;
    private boolean esquerda;
    private boolean direita;

    private valatile boolean pausado;


    public ControleTelaJogo(TelaJogo tela) {
        super();
        this.tela = tela;

        cima = false;
        baixo = false;
        esquerda = false;
        direita = true;
        pausado = true;


    }

// pressiona tecla
    @Override

    public void run(){
        while  (!pausado){
            thread.sleep(10000/5);
        }
    }




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
}
