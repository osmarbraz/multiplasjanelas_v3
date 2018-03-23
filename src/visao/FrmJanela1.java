package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.*;
import java.awt.Rectangle;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class FrmJanela1 extends javax.swing.JFrame {

    public javax.swing.JButton btFechar;
    public javax.swing.JButton btJanela2;
    public javax.swing.JButton btJanela3;
    private javax.swing.JLabel jLabel1;

    private IControlJanela1 controller;

    public FrmJanela1(IControlJanela1 controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela 1 - Versão 3");
        setResizable(false);
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Janela 1");
        jLabel1.setBounds(new Rectangle(5, 150, 350, 17));        
        
        btJanela2 = new javax.swing.JButton();               
        btJanela2.setText("Janela 2");
        btJanela2.setBounds(new Rectangle(5, 250, 90, 27));        
        
        btJanela3 = new javax.swing.JButton();        
        btJanela3.setText("Janela 3");
        btJanela3.setBounds(new Rectangle(160, 250, 90, 27));
        
        btFechar = new javax.swing.JButton();               
        btFechar.setText("Fechar");        
        btFechar.setBounds(new Rectangle(315, 250, 90, 27));
        
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(btJanela2);
        getContentPane().add(btJanela3);
        getContentPane().add(btFechar);
       
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 416) / 2, (screenSize.height - 338) / 2, 416, 338);   

        btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.fechar();
            }
        });

        btJanela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.janela2();
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
