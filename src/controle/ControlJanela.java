package controle;

import visao.*;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class ControlJanela implements IControlJanela1, IControlJanela2, IControlJanela3 {

    private FrmJanela1 janela1;
    private FrmJanela2 janela2;
    private FrmJanela3 janela3;

    public ControlJanela() {
        janela1 = new FrmJanela1(this);
        janela2 = new FrmJanela2(this);
        janela3 = new FrmJanela3(this);
    }

    public void fechar() {
        System.exit(0);
    }

    public void executar() {
        janela1.setVisible(true);
        janela2.setVisible(false);
        janela3.setVisible(false);
    }

    public void janela1() {
        janela1.setVisible(true);
        janela2.setVisible(false);
        janela3.setVisible(false);
    }

    public void janela2() {
        janela1.setVisible(false);
        janela2.setVisible(true);
        janela3.setVisible(false);
    }

    public void janela3() {
        janela1.setVisible(false);
        janela2.setVisible(false);
        janela3.setVisible(true);
    }
}
