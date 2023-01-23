import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private Cobrinha cobrinha;
    private Timer timer;
    private int velocidade;
    private Missao missao;

//    public Missao getMissao() {
//        return missao;
   // }

    public GamePanel() {
        this.cobrinha = new Cobrinha(20 * 5, 20 * 5, 20, 20);
        this.missao = new Missao(1);
        this.timer = new Timer(velocidade, this);
        this.velocidade = 1000 / 30;
    }

    public synchronized Cobrinha getCobrinha() {
        return cobrinha;
    }

    public Timer getTimer() {
        return timer;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.clearRect(0, 0, 480, 480);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 480, 480);

        missao.desenhar(g);
        getCobrinha().desenhar(g);

    }

    public Missao getMissao() {
        return missao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
