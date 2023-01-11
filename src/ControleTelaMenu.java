import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class ControleTelaMenu implements ActionListener {
        private static TelaMenu tela;
        public ControleTelaMenu(TelaMenu tela){
            this.tela = tela;
        }

        public static void mostrarTelaMenu(){
            tela.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==tela.getNovoJogo()) {

            }else if (e.getSource()==tela.getInstrucoes()){

            }else if (e.getSource()==tela.getSair()){
                System.exit(0);
            }
        }
    }
}
