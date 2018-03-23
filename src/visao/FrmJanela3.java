package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.*;
import java.awt.Rectangle;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class FrmJanela3 extends javax.swing.JFrame {

    public javax.swing.JButton btJanela1;
    public javax.swing.JButton btJanela2;
    private javax.swing.JLabel jLabel1;
    private IControlJanela3 controller;

    public FrmJanela3(IControlJanela3 controller) {
        initComponents();
        this.controller = controller;
    }

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela 3 - Versão 3");

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Janela 3");
        jLabel1.setBounds(new Rectangle(5, 150, 350, 17));

        btJanela1 = new javax.swing.JButton();
        btJanela1.setText("Janela 1");
        btJanela1.setBounds(new Rectangle(5, 250, 90, 27));

        btJanela2 = new javax.swing.JButton();
        btJanela2.setText("Janela 2");
        btJanela2.setBounds(new Rectangle(160, 250, 90, 27));

        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(btJanela1);
        getContentPane().add(btJanela2);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 416) / 2, (screenSize.height - 338) / 2, 416, 338);

        btJanela1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.janela1();
            }
        });
        btJanela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.janela2();
            }
        });
    }
}