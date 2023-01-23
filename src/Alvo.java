import javax.swing.*;
import java.awt.*;

public class Alvo extends Elemento{
    private int conteudo;
    private ImageIcon imagem;
    public Alvo(int x, int y, int largura, int altura , int conteudo) {
        super(x, y, largura, altura);
        this.conteudo = conteudo;
        this.imagem = new ImageIcon("res/img/bolinha.png");
    }

    @Override
    public void desenhar(Graphics g) {
    g.drawImage(imagem.getImage(), getX() - 2,getY()-2,getLargura()+2,getAltura()+2,null);
    g.setColor(Color.BLACK);
    g.drawString(String.valueOf(conteudo),getX(),getY()+14);
    }
}
