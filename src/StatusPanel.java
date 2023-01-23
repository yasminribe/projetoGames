import javax.swing.*;

public class StatusPanel extends JPanel {
    //Status do jogo

    private  JLabel vida1;
    private  JLabel vida2;
    private  JLabel vida3;

    private  JLabel missao;


    public StatusPanel() {
        setLayout(null);

        vida1 = new JLabel();
        vida1.setIcon(new ImageIcon("res/img/vida.png"));
        vida1.setBounds(10,30,40,40);

        vida2 = new JLabel();
        vida2.setIcon(new ImageIcon("res/img/vida.png"));
        vida2.setBounds(55,30,40,40);
        vida3 = new JLabel();
        vida3.setIcon(new ImageIcon("res/img/vida.png"));
        vida3.setBounds(100,30,40,40);

        missao = new JLabel();
        missao.setBounds(20,250,150,20);


        JLabel vidas = new JLabel("vidas");
        vidas.setBounds(50,10,60,20);

        JLabel m = new JLabel("Missão");
        m.setBounds(50,220,60,20);

        add(vidas);
        add(vida1);
        add(vida2);
        add(vida3);
        add(m);
        add(missao);
    }
    public void setVidas (int vidas){
        switch (vidas){
            case 0:
                vida1.setVisible(false);
                vida2.setVisible(false);
                vida3.setVisible(false);
                break;
            case 1:
                vida2.setVisible(false);
                vida3.setVisible(false);
                break;
            case 2:
                vida3.setVisible(false);
                break;
            case 3:
                vida1.setVisible(true);
                vida2.setVisible(true);
                vida3.setVisible(true);
                break;
        }

    }

    public JLabel getMissao() {
        return missao;
    }



}
