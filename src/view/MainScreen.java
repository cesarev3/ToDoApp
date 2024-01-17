/*
 * Created by JFormDesigner on Tue Jan 16 11:12:34 BRT 2024
 */

package view;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author magne
 */
public class MainScreen extends JFrame {
    public MainScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Carlos Cesar
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        panel3 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        panel4 = new JPanel();
        label5 = new JLabel();
        label8 = new JLabel();
        panel5 = new JPanel();
        label9 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setBackground(new Color(0x009966));
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[200,fill]" +
            "[881,fill]",
            // rows
            "[160]" +
            "[70]" +
            "[617]"));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x009966));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
            ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[199,fill]" +
                "[810,fill]",
                // rows
                "[111]" +
                "[60]"));

            //---- label1 ----
            label1.setText("App tarefas");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 24));
            label1.setForeground(Color.white);
            label1.setIcon(new ImageIcon(getClass().getResource("/resources/tick.png")));
            panel1.add(label1, "cell 0 0");

            //---- label2 ----
            label2.setText("Anote tudo, n\u00e3o esque\u00e7a nada");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panel1.add(label2, "cell 0 1");
        }
        contentPane.add(panel1, "cell 0 0 2 1,growy");

        //======== panel2 ========
        {
            panel2.setBackground(Color.white);
            panel2.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[289,fill]",
                // rows
                "[621]"));

            //======== scrollPane1 ========
            {
                scrollPane1.setBackground(Color.white);
                scrollPane1.setViewportView(list1);
            }
            panel2.add(scrollPane1, "cell 0 0,grow");
        }
        contentPane.add(panel2, "cell 0 2,growy");

        //======== panel3 ========
        {
            panel3.setBackground(Color.white);
            panel3.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[765,fill]" +
                "[104,fill]",
                // rows
                "[68]"));

            //---- label3 ----
            label3.setText("Tarefas");
            label3.setFont(new Font("Segoe UI", Font.BOLD, 18));
            label3.setForeground(new Color(0x009866));
            panel3.add(label3, "cell 0 0");

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/resources/add.png")));
            panel3.add(label4, "cell 1 0,alignx right,growx 0");
        }
        contentPane.add(panel3, "cell 1 1,growy");

        //======== panel4 ========
        {
            panel4.setBackground(Color.white);
            panel4.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[150,fill]" +
                "[37,fill]",
                // rows
                "[59]"));

            //---- label5 ----
            label5.setText("Projetos");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 18));
            label5.setForeground(new Color(0x009966));
            panel4.add(label5, "cell 0 0");

            //---- label8 ----
            label8.setIcon(new ImageIcon(getClass().getResource("/resources/add.png")));
            panel4.add(label8, "cell 1 0");
        }
        contentPane.add(panel4, "cell 0 1,growy");

        //======== panel5 ========
        {
            panel5.setBackground(Color.white);
            panel5.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[833,fill]",
                // rows
                "[185]" +
                "[]" +
                "[]" +
                "[359]"));

            //---- label9 ----
            label9.setIcon(new ImageIcon(getClass().getResource("/resources/lists.png")));
            label9.setHorizontalAlignment(SwingConstants.CENTER);
            label9.setVerticalAlignment(SwingConstants.BOTTOM);
            label9.setVerticalTextPosition(SwingConstants.BOTTOM);
            label9.setHorizontalTextPosition(SwingConstants.CENTER);
            panel5.add(label9, "cell 0 0");

            //---- label6 ----
            label6.setText("Nenhuma Tarefa por aqui :D");
            label6.setFont(new Font("Segoe UI", Font.BOLD, 18));
            label6.setForeground(new Color(0x009966));
            label6.setHorizontalAlignment(SwingConstants.CENTER);
            panel5.add(label6, "cell 0 1");

            //---- label7 ----
            label7.setText("Clique no bot\u00e3o \"+\" para adicionar uma nova tarefa");
            label7.setHorizontalAlignment(SwingConstants.CENTER);
            label7.setForeground(new Color(0x999999));
            label7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panel5.add(label7, "cell 0 2");
        }
        contentPane.add(panel5, "cell 1 2,growy");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Carlos Cesar
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel panel3;
    private JLabel label3;
    private JLabel label4;
    private JPanel panel4;
    private JLabel label5;
    private JLabel label8;
    private JPanel panel5;
    private JLabel label9;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
