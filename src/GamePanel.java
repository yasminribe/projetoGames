import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel {
     private static final long serialVersionUID = 1L;
     private Cobrinha cobrinha;
     private Timer timer;
     private int velocidade;

     private Alvo alvo;

     public GamePanel(){
         this.cobrinha = new Cobrinha (20*5, 20*5, 20, 20 );
         this.alvo = new Alvo (20*15, 20*15, 20, 20, 90);
         this.timer = new Timer (velocidade, this);
         this.velocidade = 1000/30;

     }
     @Override
     public void actionPerformed(ActionEvent e){
         repaint();
     }
     public synchronized Cobrinha getCobrinha() {
         return cobrinha;
     }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        g.clearRect(0,0,480,480);
        g.setColor(Color.BLACK);
        g.fillRect (0,0,480,480);

        getCobrinha().desenhar(g);
        alvo.desenhar(g);

    }

    public Cobrinha getCobrinha() {
        return cobrinha;
    }

    public Timer getTimer() {
        return timer;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Alvo getAlvo() {
        return alvo;
    }
}
