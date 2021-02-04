import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.io.*;
public class loginb extends javax.swing.JFrame {

    
    public loginb() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 250));
        getContentPane().setLayout(null);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(140, 80, 80, 20);

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setText("Login");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(120, 150, 110, 23);

        l1.setText("User name");
        getContentPane().add(l1);
        l1.setBounds(70, 80, 80, 14);

        l2.setText("Password");
        getContentPane().add(l2);
        l2.setBounds(70, 110, 70, 14);

        l3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24));
        l3.setForeground(new java.awt.Color(102, 102, 0));
        l3.setText("ADDRESS BOOK");
        getContentPane().add(l3);
        l3.setBounds(70, 10, 190, 20);
        getContentPane().add(tf2);
        tf2.setBounds(140, 110, 80, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diary_large.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try
        {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(loginb.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con;
        Statement st;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            st=con.createStatement();
            try
            {
		String s1 = tf1.getText().trim() ;
                String s2 = tf2.getText().trim();
		//System.out.println("got data ");
		ResultSet rs = st.executeQuery("Select * From login");
		//System.out.println("table select");
		while(rs.next())
		{
			String s3= rs.getString(2).trim();
			String s4= rs.getString(3).trim();
			System.out.println("data entered "+s1+"	"+s2);
			System.out.println("inside while "+s3+"	"+s4);
			if(s3.equals(s1) && s4.equals(s2))
			{
				 try
				{
			 		this.hide();
				        start s = new start();
                                        s.show();
				}
				catch(Exception e3)
                                {
                                    System.out.println(e3);
                                }
			}
                 }
		tf1.setText("");
		tf2.setText("");
            }
            catch(Exception e1)
            {
		System.out.println(e1);
            }
        }
        catch(Exception e4)
        {
            System.out.println(e4);
        }
    }//GEN-LAST:event_b1ActionPerformed

    public static void main(String args[])throws IOException
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new loginb().setVisible(true);
            }
        });

        Font f1 = new Font("sansserif",Font.BOLD,24);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration//GEN-END:variables

}
