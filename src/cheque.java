import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brash
 */
public class cheque extends javax.swing.JFrame {

    /**
     * Creates new form cheque
     */
    public cheque() {
        initComponents();
    }
    public PageFormat getPageFormat(PrinterJob pj)
    {
    PageFormat pf = pj.defaultPage();
       Paper paper = pf.getPaper();
       double cmiddleHeight =20.0;
       double cheaderHeight = 20.0;
       double cfooterHeight = 20.0;
       double cwidth = convert_CM_To_PPI(20);
       double cheight = convert_CM_To_PPI(cheaderHeight+cmiddleHeight+cfooterHeight);
       paper.setSize(cwidth, cheight);
       paper.setImageableArea(
               0,
        20,
        cwidth,
        cheight - convert_CM_To_PPI(1)
    );
         pf.setOrientation(PageFormat.PORTRAIT); 
    pf.setPaper(paper);
    return pf; 
    }
 protected static double convert_CM_To_PPI(double cm)
   {
    return toPPI(cm * 0.393600787);   
   }
 protected static double toPPI(double inch)
   {
     return inch * 72d;
   }
 public class formPrintable implements Printable 
  {
   @Override
   public int print(Graphics graphics, PageFormat pageFormat,int pageIndex)
   {
       int result = NO_SUCH_PAGE;
       if (pageIndex == 0)
       {
         Graphics2D g2d = (Graphics2D) graphics; 
         double cwidth = pageFormat.getImageableWidth();
         g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY());
         FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
         
         
         try
         {
         int y=14;
         int yShift =14;
         int headerRectHeight=20;
         int headerRectHeighta=40;
         ///////////////// VALUES Get ///////////
         String  cd=cdate.getText();
         String  cano=caccno.getText();
         String  cn=cname.getText();
         String  cam=camount.getText();
         String  camin=caminw.getText();
         String  cc=cno.getText();
         
         /////////////////end of  VALUES Get ///////////
         
 ///////////////// display bigns ///////////
    g2d.setFont(new Font("Monospaced",Font.PLAIN,14));
    g2d.drawString("                  EXAMPLE BANK OF INDIA",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=yShift;
    g2d.drawString("                       DEPOSIT FORM         ",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=headerRectHeight;
    g2d.drawString("    BRANCH: AMBATTUR               BRANCH: AMBATTUR",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=yShift;
    g2d.drawString("DATE:"+cd+"                                 DATE:"+cd+" ",14,y);
    y+=yShift;
    g2d.drawString("NAME:"+cn+"                         NAME:"+cn+"",14,y);            
    y+=yShift;
    g2d.drawString("ACCOUNT NUMBER:"+cano+"                   ACCOUNT NUMBER:"+cano+"",14,y);
    y+=yShift;
    g2d.drawString("AMOUNT IN WORDS:"+camin+"          AMOUNT IN WORDS:"+camin+"",14,y);
    y+=yShift;
    g2d.drawString("               ",14,y);
    y+=yShift;
    g2d.drawString("CHEQUE NUMBER:"+cc+"                     CHEQUE NUMBER:"+cc+"",14,y);
    y+=yShift;
    g2d.drawString("AMOUNT RS:"+cam+"                             AMOUNT RS:"+cam+"",14,y);
    y+=yShift;
    g2d.drawString("TOTAL  RS:"+cam+"                             TOTAL  RS:"+cam+"",14,y);
    y+=yShift;
    g2d.drawString("               ",14,y);
    y+=yShift;
    g2d.drawString("               ",14,y);
    y+=yShift;
    g2d.drawString("               ",14,y);
    y+=yShift;
    g2d.drawString("SIGNATURE                     SIGNATURE          SIGNATURE",14,y);
    y+=yShift;
    g2d.drawString("AUTHERISED                     CASHIER       OF ACCOUNT HOLDER",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=headerRectHeight;
    g2d.drawString("THANKYOU FOR VISITING OUR BANK COME AGAIN",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=yShift;
         }
         catch(Exception r)
         {
              r.printStackTrace();
         }
          result = PAGE_EXISTS;
       }
          return result;
   }
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cdate = new javax.swing.JTextField();
        caccno = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        camount = new javax.swing.JTextField();
        caminw = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("NAME");

        jLabel2.setText("ACCOUNT NUMBER");

        jLabel3.setText("AMOUNT IN WORDS");

        jLabel4.setText("AMOUNT");

        jLabel5.setText("DATE");

        cdate.setToolTipText("ENTER THE DATE");

        caccno.setToolTipText("ENTER THE ACCOUNT NUMBER");
        caccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caccnoActionPerformed(evt);
            }
        });
        caccno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caccnoKeyTyped(evt);
            }
        });

        cname.setToolTipText("ENTER YOUR NAME");

        camount.setToolTipText("ENTER THE AMOUNT");
        camount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camountActionPerformed(evt);
            }
        });
        camount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                camountKeyTyped(evt);
            }
        });

        caminw.setToolTipText("ENTER THE AMOUNT IN WORDS");

        jLabel6.setText("CHEQUE NUMBER");

        cno.setToolTipText("ENTER THE CHEQUE NUMBER");
        cno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnoKeyTyped(evt);
            }
        });

        jLabel7.setText("DEPOSIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(143, 143, 143)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caccno)
                            .addComponent(cname)
                            .addComponent(cdate)
                            .addComponent(camount)
                            .addComponent(caminw, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(cno))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caccno)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caminw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caccnoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_caccnoActionPerformed

    private void camountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new formPrintable(),getPageFormat(pj));
        try
        {
           pj.print(); 
        }
        catch (PrinterException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void caccnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caccnoKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(caccno.getText().length()>10)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_caccnoKeyTyped

    private void camountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camountKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(camount.getText().length()>10)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_camountKeyTyped

    private void cnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnoKeyTyped
        // TODO add your handling code here:
        if(cno.getText().length()>10)
           {
               evt.consume();}
        
    }//GEN-LAST:event_cnoKeyTyped

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
            java.util.logging.Logger.getLogger(cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caccno;
    private javax.swing.JTextField caminw;
    private javax.swing.JTextField camount;
    private javax.swing.JTextField cdate;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
