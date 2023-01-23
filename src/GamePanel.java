import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private Cobrinha cobrinha;
    private Timer timer;
    private int velocidade;
    private Alvo alvo;

    public GamePanel() {
        this.cobrinha = new Cobrinha(20 * 5, 20 * 5, 20, 20);
        this.alvo = new Alvo(20 * 15, 20 * 15, 20, 20, 90);
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

        getCobrinha().desenhar(g);
        alvo.desenhar(g);

    }

    public Alvo getAlvo() {
        return alvo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
