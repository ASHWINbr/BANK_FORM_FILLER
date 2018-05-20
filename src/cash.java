/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
/**
 *
 * @author brash
 */
public class cash extends javax.swing.JFrame {

    /**
     * Creates new form cash
     */
    public cash() {
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
         
         String  d=date.getText();
         String  ano=name.getText();
         String  n=accountno.getText();
         String  m=amount.getText();
         String  amin=amountinw.getText();
         
         String  twothousand=twot.getText();
         String  fivehundred=fiveh.getText();
         String  twohundred=twoh.getText();
         String  hundred=hun.getText();
         String  fifty=f.getText();
         String  twenty=t.getText();
         String  ten=te.getText();
         
         String  th=ttwot.getText();
         String  fh=tfiveh.getText();
         String  thu=ttwoh.getText();
         String  h=thun.getText();
         String  fy=tf.getText();
         String  ty=tt.getText();
         String  tn=tte.getText();
         
    g2d.setFont(new Font("Monospaced",Font.PLAIN,14));
    g2d.drawString("                  EXAMPLE BANK OF INDIA",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=yShift;
    g2d.drawString("                       DEPOSIT FORM         ",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=headerRectHeight;
    g2d.drawString("                                      BRANCH: AMBATTUR",14,y);
    y+=yShift;
    g2d.drawString("-----------------------------------------------------------------------",14,y);
    y+=yShift;
    g2d.drawString("                                      DATE:"+d+" ",14,y);
    y+=yShift;
    g2d.drawString("NAME:"+n+" ",14,y);            
    y+=yShift;
    g2d.drawString("ACCOUNT NUMBER:"+ano+" ",14,y);
    y+=yShift;
    g2d.drawString("AMOUNT IN WORDS:"+amin+" ",14,y);
    y+=yShift;
    g2d.drawString("               ",14,y);
    y+=yShift;
    g2d.drawString("AMOUNT RS:"+m+" ",14,y);
    y+=yShift;
    g2d.drawString("2000   "+twothousand+" "+th+"",14,y);
    y+=yShift;
    g2d.drawString("500    "+fivehundred+" "+fh+"",14,y);
    y+=yShift;
    g2d.drawString("200    "+twohundred+" "+thu+"",14,y);
    y+=yShift;
    g2d.drawString("100    "+hundred+" "+h+"",14,y);
    y+=yShift;
    g2d.drawString("50     "+fifty+" "+fy+"",14,y);
    y+=yShift;
    g2d.drawString("20     "+twenty+" "+ty+"",14,y);
    y+=yShift;
    g2d.drawString("10     "+ten+" "+tn+"",14,y);
    y+=yShift;
    g2d.drawString("                             TOTAL  RS:"+m+"",14,y);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        twot = new javax.swing.JTextField();
        fiveh = new javax.swing.JTextField();
        twoh = new javax.swing.JTextField();
        hun = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        t = new javax.swing.JTextField();
        te = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        accountno = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        amountinw = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ttwot = new javax.swing.JTextField();
        tfiveh = new javax.swing.JTextField();
        ttwoh = new javax.swing.JTextField();
        thun = new javax.swing.JTextField();
        tf = new javax.swing.JTextField();
        tt = new javax.swing.JTextField();
        tte = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DEPOSIT");

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel3.setText("ACCOUNT NUMBER");

        jLabel4.setText("AMOUNT");

        jLabel5.setText("DATE");

        jLabel6.setText("AMOUNT IN WORDS");

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("2000");

        jLabel8.setText("500");

        jLabel9.setText("200");

        jLabel10.setText("100");

        jLabel11.setText("50");

        jLabel12.setText("20");

        jLabel13.setText("10");

        twot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twotActionPerformed(evt);
            }
        });
        twot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twotKeyTyped(evt);
            }
        });

        fiveh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fivehKeyTyped(evt);
            }
        });

        twoh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twohKeyTyped(evt);
            }
        });

        hun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hunKeyTyped(evt);
            }
        });

        f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fKeyTyped(evt);
            }
        });

        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tKeyTyped(evt);
            }
        });

        te.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teKeyTyped(evt);
            }
        });

        date.setToolTipText("ENTER THE DATE");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        name.setToolTipText("ENTER THE NAME");

        accountno.setToolTipText("ENTER THE ACCOUNT NUMBER");
        accountno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnoActionPerformed(evt);
            }
        });
        accountno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountnoKeyTyped(evt);
            }
        });

        amount.setToolTipText("ENTER THE AMOUNT");
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });

        amountinw.setToolTipText("ENTER THE AMOUNT IN WORDS");

        jLabel14.setText("VALUE");

        ttwot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttwotActionPerformed(evt);
            }
        });

        tfiveh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfivehActionPerformed(evt);
            }
        });

        ttwoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttwohActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date)
                            .addComponent(name)
                            .addComponent(accountno)
                            .addComponent(amount)
                            .addComponent(amountinw, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(twot, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(te, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(t, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(f, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hun, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(twoh, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fiveh, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(thun)
                                        .addComponent(tf)
                                        .addComponent(tt)
                                        .addComponent(tte)
                                        .addComponent(ttwoh, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                    .addComponent(tfiveh)
                                    .addComponent(ttwot))))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(amountinw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(twot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(ttwot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfiveh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(twoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttwoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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

    private void twotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twotActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_twotActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void tfivehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfivehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfivehActionPerformed

    private void ttwotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttwotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttwotActionPerformed

    private void ttwohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttwohActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttwohActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void accountnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_accountnoActionPerformed

    private void accountnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountnoKeyTyped
        // TODO add your handling code here:
        
        char c =evt.getKeyChar(); 
        if(accountno.getText().length()>10)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_accountnoKeyTyped

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        // TODO add your handling code here:
        if(amount.getText().length()>10)
           {
               evt.consume();}
         char c =evt.getKeyChar(); 
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_amountKeyTyped

    private void twotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twotKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(twot.getText().length()>6)
           {
               evt.consume();}
         
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_twotKeyTyped

    private void fivehKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fivehKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(fiveh.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_fivehKeyTyped

    private void twohKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twohKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(twoh.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_twohKeyTyped

    private void hunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hunKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(hun.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_hunKeyTyped

    private void fKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(f.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_fKeyTyped

    private void tKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(t.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_tKeyTyped

    private void teKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar(); 
         if(te.getText().length()>6)
           {
               evt.consume();}
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
           
            evt.consume();
        }   
    }//GEN-LAST:event_teKeyTyped

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
            java.util.logging.Logger.getLogger(cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountno;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amountinw;
    private javax.swing.JTextField date;
    private javax.swing.JTextField f;
    private javax.swing.JTextField fiveh;
    private javax.swing.JTextField hun;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField t;
    private javax.swing.JTextField te;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tfiveh;
    private javax.swing.JTextField thun;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField tte;
    private javax.swing.JTextField ttwoh;
    private javax.swing.JTextField ttwot;
    private javax.swing.JTextField twoh;
    private javax.swing.JTextField twot;
    // End of variables declaration//GEN-END:variables
}
