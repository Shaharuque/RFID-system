
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    int orgId;
    String orgName;
    public Home(int id, String name) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RFID Card R/W - Home");
        orgId = id;
        orgName = name;
        orgNameText.setText(name);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        pageName = new javax.swing.JLabel();
        addMemberButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        orgNameText = new javax.swing.JLabel();
        takePaymentButton = new javax.swing.JButton();
        rechargeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(0, 102, 204));

        top.setBackground(new java.awt.Color(255, 102, 102));

        appName.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("RFID Card R/W");

        pageName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pageName.setText("Home");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(appName))
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(pageName)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appName)
                .addGap(18, 18, 18)
                .addComponent(pageName))
        );

        addMemberButton.setBackground(new java.awt.Color(0, 204, 204));
        addMemberButton.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        addMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        addMemberButton.setText("Add New Member");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        orgNameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orgNameText.setForeground(new java.awt.Color(204, 255, 204));
        orgNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        takePaymentButton.setBackground(new java.awt.Color(0, 204, 204));
        takePaymentButton.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        takePaymentButton.setForeground(new java.awt.Color(255, 255, 255));
        takePaymentButton.setText("Payment");
        takePaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takePaymentButtonActionPerformed(evt);
            }
        });

        rechargeButton.setBackground(new java.awt.Color(0, 204, 204));
        rechargeButton.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        rechargeButton.setForeground(new java.awt.Color(255, 255, 255));
        rechargeButton.setText("Recharge");
        rechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechargeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(orgNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(logoutButton))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(takePaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rechargeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orgNameText)
                .addGap(24, 24, 24)
                .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(takePaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rechargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        // TODO add your handling code here:
        NewMember nm = new NewMember(orgId);
        nm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nm.setVisible(true);
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void takePaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takePaymentButtonActionPerformed
        Payment p = new Payment(orgId);
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p.setVisible(true);
    }//GEN-LAST:event_takePaymentButtonActionPerformed

    private void rechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechargeButtonActionPerformed
        Recharge r = new Recharge(orgId);
        r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        r.setVisible(true);
    }//GEN-LAST:event_rechargeButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberButton;
    private javax.swing.JLabel appName;
    private javax.swing.JPanel body;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel orgNameText;
    private javax.swing.JLabel pageName;
    private javax.swing.JButton rechargeButton;
    private javax.swing.JButton takePaymentButton;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
