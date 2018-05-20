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
public class withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public withdraw() {
        initComponents();
    }
    
    
    
    public PageFormat getPageFormat(PrinterJob pj)
    {
       PageFormat pf = pj.defaultPage();
       Paper paper = pf.getPaper();
       
       double middleHeight =20.0;
       double headerHeight = 20.0;
       double footerHeight = 20.0;
       double width = convert_CM_To_PPI(20);
       double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
       paper.setSize(width, height);
       paper.setImageableArea(
                0,
        20,
        width,
        height - convert_CM_To_PPI(1)
    );
        pf.setOrientation(PageFormat.PORTRAIT); 
    pf.setPaper(paper);    

    return pf;   
    }
    protected static double convert_CM_To_PPI(double cm)
    {
        return toPPI(cm * 0.393600787);  
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }
    






 public class formPrintable implements Printable 
 {
    @Override
    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
            throws PrinterException 
  {
      int result = NO_SUCH_PAGE;
      if (pageIndex == 0) 
      {
           Graphics2D g2d = (Graphics2D) graphics; 
           double width = pageFormat.getImageableWidth();
           g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY());
           FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
           /*int idLength=metrics.stringWidth("000");
           int amtLength=metrics.stringWidth("000000");
           int qtyLength=metrics.stringWidth("00000");
           int priceLength=metrics.stringWidth("000000");
           int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;
           
 
           int productPosition = 0;
           int discountPosition= prodLength+5;
           int pricePosition = discountPosition +idLength+10;
           int qtyPosition=pricePosition + priceLength + 4;
           int amtPosition=qtyPosition + qtyLength;
           */
      try 
     {
     /*Draw Header*/
         int y=14;
         int yShift =14;
         int headerRectHeight=20;
         int headerRectHeighta=40;
 ///////////////// VALUES Get ///////////
         String  da=datef.getText();
         String  ac=accountnof.getText();
         String  na=namef.getText();
         String  am=amountf.getText();
         String  ai=aminwf.getText();
         
 /////////////////end of  VALUES Get ///////////
         
 ///////////////// display bigns ///////////
 
 g2d.setFont(new Font("Monospaced",Font.PLAIN,14));
 g2d.drawString("                  EXAMPLE BANK OF INDIA",14,y);
 y+=yShift;
 g2d.drawString("---------------------------------------------------------",14,y);
 y+=yShift;
 g2d.drawString("                     WITHDRAWAL FORM         ",14,y);
 y+=yShift;
 g2d.drawString("---------------------------------------------------------",14,y);
 y+=headerRectHeight;
  g2d.drawString("                                     BRANCH: AMBATTUR       ",14,y);
 y+=yShift;
 g2d.drawString("                                     DATE: "+da+" ",14,y);
 y+=yShift;
 g2d.drawString("NAME:            "+na+" ",14,y);
 y+=yShift;
 g2d.drawString("AMOUNT IN WORDS: "+ai+" ",14,y);
 y+=yShift;
 g2d.drawString("               ",14,y);
 y+=yShift;
 g2d.drawString("                                  AMOUNT RS:"+am+" ",14,y);
 y+=yShift;
 g2d.drawString("ACCOUNT NUMBER:  "+ac+" ",14,y);
 y+=yShift;
 g2d.drawString("               ",14,y);
 y+=yShift;
 g2d.drawString("               ",14,y);
 y+=yShift;
 g2d.drawString("               ",14,y);
 y+=yShift;
 g2d.drawString("SIGNATURE                                SIGNATURE",14,y);
 y+=yShift;
 g2d.drawString("AUTHERISED                           OF ACCOUNT HOLDER",14,y);
 y+=yShift;
 g2d.drawString("---------------------------------------------------------",14,y);
 y+=headerRectHeight;
 g2d.drawString("THANKYOU FOR VISITING OUR BANK COME AGAIN",14,y);
 y+=yShift;
 g2d.drawString("---------------------------------------------------------",14,y);
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
        jLabel1 = new javax.swing.JLabel();
        accountno = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        aminw = new javax.swing.JLabel();
        datef = new javax.swing.JTextField();
        accountnof = new javax.swing.JTextField(10);
        namef = new javax.swing.JTextField();
        amountf = new javax.swing.JTextField();
        aminwf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("WITHDRAWAL");

        accountno.setText("ACCOUNT NUMBER");

        name.setText("NAME");

        date.setText("DATE");

        amount.setText("AMOUNT");

        aminw.setText("AMOUNT IN WORDS");

        datef.setToolTipText("ENTER THE DATE");
        datef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datefActionPerformed(evt);
            }
        });

        accountnof.setToolTipText("ENTER THE ACCOUNT NUMBER");
        accountnof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnofActionPerformed(evt);
            }
        });
        accountnof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accountnofKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountnofKeyTyped(evt);
            }
        });

        namef.setToolTipText("ENTER YOUR NAME");

        amountf.setToolTipText("ENTER THE AMOUNT");
        amountf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountfActionPerformed(evt);
            }
        });
        amountf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountfKeyTyped(evt);
            }
        });

        aminwf.setToolTipText("ENTER THE AMOUNT IN WORDS");

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aminw)
                                .addGap(18, 18, 18)
                                .addComponent(aminwf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(accountnof, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(datef))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(namef))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(amountf)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(date))
                    .addComponent(datef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(accountnof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aminw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(aminwf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void datefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datefActionPerformed

    private void accountnofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnofActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_accountnofActionPerformed

    private void accountnofKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountnofKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar(); 
        
           if(accountnof.getText().length()>10)
           {
               evt.consume();}
            if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
                evt.consume();
            }
            
           
    }//GEN-LAST:event_accountnofKeyTyped

    private void amountfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountfKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(amountf.getText().length()>10)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_amountfKeyTyped

    private void accountnofKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountnofKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_accountnofKeyPressed

    private void amountfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountfActionPerformed

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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountno;
    public javax.swing.JTextField accountnof;
    private javax.swing.JLabel aminw;
    private javax.swing.JTextField aminwf;
    private javax.swing.JLabel amount;
    private javax.swing.JTextField amountf;
    private javax.swing.JLabel date;
    private javax.swing.JTextField datef;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namef;
    // End of variables declaration//GEN-END:variables

   
         //To change body of generated methods, choose Tools | Templates.
    }

