package BMI.Tool;

import java.text.DecimalFormat;


public class bmi extends javax.swing.JFrame {

       
    public bmi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        heightLabel = new javax.swing.JLabel();
        feetTextField = new javax.swing.JTextField();
        ftLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        bmiLabel = new javax.swing.JLabel();
        bmiTextField = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        kgLabel = new javax.swing.JLabel();
        commentsLabel = new javax.swing.JLabel();
        ftLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI Calculation Tool");
        setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 211, 245));

        heightLabel.setText("Your Height");

        feetTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ftLabel.setText("centimeters");

        weightLabel.setText("Your Weight");

        weightTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        calculateBtn.setBackground(new java.awt.Color(204, 102, 0));
        calculateBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        calculateBtn.setForeground(new java.awt.Color(255, 255, 255));
        calculateBtn.setText("Calculate Your BMI");
        calculateBtn.setActionCommand("");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        bmiLabel.setText("Your BMI ");

        bmiTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        clearBtn.setBackground(new java.awt.Color(42, 144, 4));
        clearBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(159, 0, 0));
        exitBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        kgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kgLabel.setText("Kg");

        commentsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        commentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ftLabel1.setText("JavaCore Project @Autor Nazar Ptashynskyi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(bmiLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(commentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(heightLabel)
                                .addGap(18, 18, 18)
                                .addComponent(feetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weightLabel)
                                .addGap(18, 18, 18)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(kgLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ftLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(ftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftLabel)
                    .addComponent(heightLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kgLabel)
                    .addComponent(weightLabel))
                .addGap(30, 30, 30)
                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bmiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       feetTextField.setText("");
       weightTextField.setText("");
       bmiTextField.setText("");
       feetTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        
        double centimeters,kilogram;
        double height,bmi;
        
        try {
             centimeters = Double.parseDouble(feetTextField.getText());
             kilogram = Double.parseDouble(weightTextField.getText());
        
             height = centimeters;
             height = height /100;
             bmi = kilogram /(height * height);
             
         
              bmiTextField.setText(new DecimalFormat("##.##").format(bmi));
             if (bmi <18.5){
	
		     commentsLabel.setText ("You Are UnderWeight");
		
	         }else if (bmi >=18.5&&bmi <=24.9) {
	             commentsLabel.setText ("Your weight is normal");
	
	     }else if (bmi >24.9 && bmi <=29.9) {
	            commentsLabel.setText ("You Are OverWeight");
	     } else {
	            commentsLabel.setText ("You Are Obese");
	     }
                
        }catch (Exception e) {
         commentsLabel.setText("Please check Required TextFields");
        }
        
        
    }//GEN-LAST:event_calculateBtnActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmiLabel;
    private javax.swing.JTextField bmiTextField;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField feetTextField;
    private javax.swing.JLabel ftLabel;
    private javax.swing.JLabel ftLabel1;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kgLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
