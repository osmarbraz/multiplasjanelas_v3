package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.*;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class FrmJanela2 extends javax.swing.JFrame {

    public javax.swing.JButton btJanela1;
    public javax.swing.JButton btJanela3;
    private javax.swing.JLabel jLabel1;
    private IControlJanela2 controller;

    public FrmJanela2(IControlJanela2 controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btJanela1 = new javax.swing.JButton();
        btJanela3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela 2 - Versão 2");

        btJanela1.setText("Janela 1");

        btJanela3.setText("Janela 3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Janela 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btJanela1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btJanela3)))
                                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btJanela1)
                                        .addComponent(btJanela3))
                                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 416) / 2, (screenSize.height - 338) / 2, 416, 338);

        btJanela1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.janela1();
            }
        });
        btJanela3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.janela3();
            }
        });

    }
}
