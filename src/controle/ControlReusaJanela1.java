package controle;

import visao.*;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class ControlReusaJanela1 implements IControlJanela1 {

    private FrmJanela1 janela1;
    private boolean j2 = false;
    
	private boolean j3 = false;

    public ControlReusaJanela1() {
        janela1 = new FrmJanela1(this);
    }

    public void fechar() {
        System.exit(0);
    }

    public void executar() {
        janela1.setVisible(true);
    }

    public void janela2() {
        if (!j2) {
            janela1.btJanela2.setText("Mudou Janela2");
        } else {
            janela1.btJanela2.setText("Janela2");
        }
        j2 = !j2;
    }

    public void janela3() {
        if (!j3) {
            janela1.btJanela3.setText("Mudou Janela3");
        } else {
            janela1.btJanela3.setText("Janela3");
        }
        j3 = !j3;
    }
}
