import java.awt.*;
import java.util.ArrayList;

public class Cobrinha {
    public static final int CIMA = 1;
    public static final int BAIXO = 2;
    public static final int ESQUERDA = 3;
    public static final int DIREITO = 4;

    private ArrayList<Elemento> cobrinha;

    public Cobrinha(int x, int y, int largura, int altura) {
        this.cobrinha = new ArrayList<>();
        CorpoDaCobrinha cabeca = new CorpoDaCobrinha(x, y, largura, altura);
        CorpoDaCobrinha corpo = new CorpoDaCobrinha(x, y, largura, altura);
        CorpoDaCobrinha corpob = new CorpoDaCobrinha(x, y, largura, altura);
        this.cobrinha.add(cabeca);
        this.cobrinha.add(corpo);
        this.cobrinha.add(corpob);
    }

    public void adicionarCorpo() {
        CorpoDaCobrinha corpo = (CorpoDaCobrinha) this.cobrinha.get(this.cobrinha.size() - 1);
        int x = corpo.getX();
        int y = corpo.getY();
        int largura = corpo.getLargura();
        int altura = corpo.getAltura();

        this.cobrinha.add(new CorpoDaCobrinha(x, y, largura, altura));
    }
// desenha a cobrinha
    public void desenhar(Graphics g) {
        for (Elemento e : cobrinha) {
            e.desenhar(g);
        }
    }

    public void atualizar(int direcao) {
        //movendo apenas a cabeça
        switch (direcao) {
            case CIMA:
                this.cobrinha.get(0).setY(this.cobrinha.get(0).getY() - this.cobrinha.get(0).getAltura());
                break;
            case BAIXO:
                this.cobrinha.get(0).setY(this.cobrinha.get(0).getY() + this.cobrinha.get(0).getAltura());
                break;
            case ESQUERDA:
                this.cobrinha.get(0).setX(this.cobrinha.get(0).getX() - this.cobrinha.get(0).getLargura());
                break;
            case DIREITO:
                this.cobrinha.get(0).setX(this.cobrinha.get(0).getX() + this.cobrinha.get(0).getLargura());
                break;

        }
        //move o corpo adc um a mais no final
        for (int i = this.cobrinha.size() - 1; i > 0 ; i--){
            this.cobrinha.get(i).mover(this.cobrinha.get(i-1).getX(),this.cobrinha.get(i-1).getY());
        }
    }
}
