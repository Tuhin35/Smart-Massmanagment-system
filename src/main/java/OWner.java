
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Raihan Tuhin
 */
public class OWner extends javax.swing.JFrame {

     DefaultTableModel model1;
    /**
     * Creates new form OWner
     */
    public OWner() {
        Color();
        initComponents();
           model1 = (DefaultTableModel) tbldata1.getModel();
    }

     public void Color()
    {
//        Container c = this.getContentPane();
//        c.setLayout(null);
//        
//        c.setBackground(Color.YELLOW);
//        setLayout(null);
       getContentPane().setBackground(Color.green);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txttk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata1 = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 34, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 72, -1, -1));

        jLabel3.setText("Tk");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 112, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 31, 54, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 69, 79, -1));
        getContentPane().add(txttk, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 109, 88, -1));

        tbldata1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "TK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbldata1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 197, 375, 170));

        btndelete.setText("delete");
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 147, -1, -1));

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 147, -1, -1));

        jButton1.setText("Back to Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
            if(validateFields()){
         model1.insertRow(tbldata1.getRowCount(), new Object[]{
          txtname.getText(),
          txtid.getText(),
          txttk.getText()
         });
          
         reset();
            
            
        }
        
       
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashboard frame = new Dashboard();
         dispose();
            frame.setVisible(true); 
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
            java.util.logging.Logger.getLogger(OWner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OWner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OWner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OWner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWner().setVisible(true);
            }
        });
    }

     private boolean validateFields(){
       
        if(txtname.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(OWner.this, "Enter Your Name. ");
        txtname.grabFocus();    
           return false;
        }
      
        
         if(txtid.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(OWner.this, "Enter Id. ");
        txtid.grabFocus();    
           return false;
        }
        
        
         if(txttk.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(OWner.this, "Enter amount ");
        txttk.grabFocus();    
           return false;
        }
 
      return true;  
        
    }
     
    private void reset()
    {
     txtname.setText("");
     txtid.setText("");
     txttk.setText("");

  
        
    }
    
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldata1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables
}
