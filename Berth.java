
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER LAPTOP
 */
public class Berth extends javax.swing.JFrame {

    /**
     * Creates new form Berth
     */
    public Berth() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELETE TRAIN DETAILS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER TRAIN NO TO DELETE");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Cancel");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
                new AdChoice().setVisible(true);
                dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String h=jTextField1.getText();
        int a=h.length();
            
            if(jTextField1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter the Train Number to delete :");}
            else if(a<5||a>5)
                    {
                        JOptionPane.showMessageDialog(null,"Enter a valid Train Number :");
                    }
else
            {
                JOptionPane.showMessageDialog(null,"Are You Sure,This Option can't Be Recovered:");
                
                try 
        {
            Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con=null;
       try
       {
            
           con=(Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/Train","root","karthick1103$");
       }
       catch (SQLException e)
       {
           System.out.println("OOPS,Error");
           e.printStackTrace();
       }
                   
        
        try
        {
            String q1="select * from trdet;";
        PreparedStatement s1=con.prepareStatement(q1);
                    
        String query = " DELETE FROM trdet where tno="+h;
        int i=1;
        PreparedStatement s=null;
            s = con.prepareStatement(query);
            ResultSet r=s1.executeQuery();
            while(r.next())
            {
                String w=r.getString(1);
                if(w.equals(h))
                {
                   i=0;
                   s.execute();
                   JOptionPane.showMessageDialog(null,"Train Details Deleted Successfully");
                new AdChoice().setVisible(true);
                dispose();
                   
                }
            }
            if(i==1)
            {
                JOptionPane.showMessageDialog(null,"Train not Exist");
            }
        }
        catch (SQLException ex) {
            
            Logger.getLogger(Berth.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try
        {
            s.setString(1,textField5.getText());
        }catch (SQLException ex) 
        {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            s.setString(2,textField3.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
           s.setString(3,jTextField1.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
           s.setString(4,textField1.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            s.setString(5,textField2.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
             if(jRadioButton3.isSelected())
             {
            try {
                s.setString(6,jRadioButton3.getText());
            }
            catch (SQLException ex){
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
             }
             else 
             {
            try {
                s.setString(6,jRadioButton4.getText());
            } 
            catch (SQLException ex){
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
             }
        try
        {
            s.setString(7,((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText());
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            s.setString(8,textArea1.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try  
        {
            s.setString(9,jPasswordField1.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        { 
            s.setString(10,jPasswordField2.getText());
            
              }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
      
        try  
        {
            con.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Berth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Berth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Berth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Berth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Berth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
