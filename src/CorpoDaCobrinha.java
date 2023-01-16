import java.awt.*;

public class CorpoDaCobrinha extends Elemento{

    public CorpoDaCobrinha(int x, int y, int largura, int altura) {
        super(x, y, largura, altura);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(this.getX(),this.getY(),this.getLargura(),this.getAltura());
    }
}
