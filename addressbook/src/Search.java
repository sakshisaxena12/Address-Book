import java.sql.*;
public class Search extends javax.swing.JFrame {

    public Search() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 307));
        getContentPane().setLayout(null);

        l.setFont(new java.awt.Font("Broadway", 0, 14));
        l.setText("Search By Name");
        getContentPane().add(l);
        l.setBounds(40, 50, 170, 30);
        getContentPane().add(tf);
        tf.setBounds(260, 50, 160, 20);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(404, 115, 0, 0);

        b1.setFont(new java.awt.Font("Broadway", 0, 12));
        b1.setForeground(new java.awt.Color(51, 51, 0));
        b1.setText("Search");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(70, 120, 130, 30);

        b3.setForeground(new java.awt.Color(51, 51, 0));
        b3.setText("Exit");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(391, 260, 90, 23);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 110, 170, 120);

        jButton4.setForeground(new java.awt.Color(51, 51, 0));
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 10, 120, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diary_large.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 380);

        l3.setBackground(new java.awt.Color(153, 153, 0));
        l3.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        l3.setForeground(new java.awt.Color(51, 51, 0));
        l3.setText("ADDRESS    BOOK");
        getContentPane().add(l3);
        l3.setBounds(70, 20, 310, 50);

        l4.setBackground(new java.awt.Color(153, 153, 0));
        l4.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        l4.setForeground(new java.awt.Color(51, 51, 0));
        l4.setText("ADDRESS    BOOK");
        getContentPane().add(l4);
        l4.setBounds(70, 20, 310, 50);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 30, 59, 20);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 170, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    try
    {
            String s6,s,s1,s3,s4,s0="1233";
            Date d;
            //Long s2;
            int s5,s2;
             s = tf.getText().trim();
           

            Class.forName("java.sql.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * From address");
            while(rs.next())
            {
                    int pin=rs.getInt(1);
                    s1 = rs.getString(2);
                    s2 = rs.getInt(3);
                    s3 = rs.getString(4);
                    s4 = rs.getString(5);
                    d =  rs.getDate(6);
                    System.out.println("got string");
                    if((s1.trim().equals(s)))
                    {
                            System.out.println("string equal");
                            ta.setText(null);
                            ta.append(s1+"\n"+ s2+ "\n" + s3+ "\n" + s4 + "\n"+d);
                            ta.append("");
                    }//eoif
            }//eowhlie
            rs.close();
            st.close();
            con.close();
    }
    catch(Exception e1){System.out.println("ERROR="+e1);}
    
    }//GEN-LAST:event_b1ActionPerformed
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables

}
