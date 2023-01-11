import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Tela extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    public Tela() {
        setTitle("Snack Game");
        setSize(600,400); // tamanho da tela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false); //altera tamanho da tela
        setIconImage(new ImageIcon("res/img/icon.png").getImage());
    }
}
