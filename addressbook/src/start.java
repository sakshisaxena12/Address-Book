
import javax.swing.JFrame;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.io.*;
public class start extends javax.swing.JFrame
{

    public start()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l3 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(500, 307));
        getContentPane().setLayout(null);

        l3.setBackground(new java.awt.Color(153, 153, 0));
        l3.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        l3.setForeground(new java.awt.Color(51, 51, 0));
        l3.setText("ADDRESS    BOOK");
        getContentPane().add(l3);
        l3.setBounds(70, 0, 310, 50);

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Broadway", 0, 18));
        b1.setForeground(new java.awt.Color(51, 51, 0));
        b1.setText("Add");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(40, 70, 140, 30);

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Broadway", 0, 18));
        b2.setForeground(new java.awt.Color(51, 51, 0));
        b2.setText("Search");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(40, 120, 200, 40);

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Broadway", 0, 18));
        b3.setForeground(new java.awt.Color(51, 51, 0));
        b3.setText("Delete/Modify");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(40, 180, 250, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diary_large.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 300);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 170, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try
	{
		this.hide();
                Add a = new Add();
                a.show();
	}
	catch(Exception e2){}
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try
	{
                this.hide();
                Search b = new Search();
                b.show();
	}
	catch(Exception e3){}
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        this.hide();
        deletemodify dm=new deletemodify();
        dm.show();
    }//GEN-LAST:event_b3ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables

}
