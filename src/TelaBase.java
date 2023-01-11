import javax.swing.*;
import java.io.Serial;

public class TelaBase extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    public TelaBase() {
        setTitle("Snack Game");
        setSize(600,400); // tamanho da tela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false); //altera tamanho da tela
        setIconImage(new ImageIcon("res/imgs/icon.png").getImage());
    }
}
