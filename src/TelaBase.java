import javax.swing.*;
import java.awt.*;

public class TelaBase extends JFrame {
    public TelaBase() {
        setTitle("Snake Game");
        setSize(640,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setIconImage(new ImageIcon("res/img/icon.png") {
        }.getImage());
    }
}
