import java.awt.*;

public class TelaJogo extends TelaBase{
    private GamePanel gamePanel;
    private  StatusPanel statusPanel;

    public TelaJogo() throws HeadlessException {
        super();
        gamePanel = new GamePanel();
        gamePanel.setBounds(0,0,480,480);
        statusPanel = new StatusPanel();
        statusPanel.setBounds(480,0,160,480);

        add(gamePanel);
        add(statusPanel);

        gamePanel.setBackground(Color.BLACK);
        statusPanel.setBackground(Color.YELLOW);

        ControleTelaJogo controle = new ControleTelaJogo(this);

        addKeyListener(controle);
        setVisible(true);

    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public StatusPanel getStatusPanel() {
        return statusPanel;
    }
}
