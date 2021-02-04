
//import java.awt.*;
//import java.awt.event.*;
import java.sql.*;
//import javax.swing.*;
//import java.io.*;
public class Add extends javax.swing.JFrame {

   Connection con;
    public Add() throws Exception
    {
        Class.forName("java.sql.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 307));
        getContentPane().setLayout(null);
        getContentPane().add(tf1);
        tf1.setBounds(280, 50, 143, 20);
        getContentPane().add(tf2);
        tf2.setBounds(280, 80, 143, 20);
        getContentPane().add(tf3);
        tf3.setBounds(280, 110, 143, 20);
        getContentPane().add(tf4);
        tf4.setBounds(280, 140, 143, 20);
        getContentPane().add(tf5);
        tf5.setBounds(280, 170, 143, 20);

        l1.setText("Name");
        getContentPane().add(l1);
        l1.setBounds(60, 50, 125, 14);

        l2.setText("Phone Number");
        getContentPane().add(l2);
        l2.setBounds(60, 80, 125, 14);

        l3.setText("Address");
        getContentPane().add(l3);
        l3.setBounds(60, 110, 125, 14);

        l4.setText("Email Id");
        getContentPane().add(l4);
        l4.setBounds(60, 140, 125, 14);

        l5.setText("Birth Date");
        getContentPane().add(l5);
        l5.setBounds(60, 170, 125, 14);

        b4.setText("Enter");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(139, 210, 90, 23);

        b2.setText("Search");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(275, 210, 100, 23);

        b3.setText("Exit");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(400, 210, 70, 23);

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 0, 110, 23);

        l9.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        l9.setText("ADDRESS   BOOK");
        getContentPane().add(l9);
        l9.setBounds(80, 10, 310, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diary_large.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try
		{
			String s1,s2,s3,s4,s5;
			s1 = tf1.getText();
			s2 = tf2.getText();
			s3 = tf3.getText();
			s4 = tf4.getText();
			s5 = tf5.getText();
			PreparedStatement ps = con.prepareStatement("insert into address values(?,?,?,?,?,?)");
			//ps.setString(0,"");
                        ps.setString(1,"0");
			ps.setString(2,s1);
			ps.setString(3,s2);
			ps.setString(4,s3);
			ps.setString(5,s4);
                        ps.setString(6,s5);
			int i = ps.executeUpdate();
			System.out.println("Row Updated:"+i);
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
		}
		catch(Exception e1){System.out.println("ERROR:"+e1);}
    }//GEN-LAST:event_b4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try
	{
		Search b = new Search();
	}
	catch(Exception e3){}
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        try
	{
		System.exit(0);
	}
	catch(Exception e3){}
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
        start st=new start();
        st.show();
}//GEN-LAST:event_jButton4ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new Add().setVisible(true);
                }
                catch(Exception e4){}
            }
    });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables

}
