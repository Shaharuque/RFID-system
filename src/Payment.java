import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {

    int newBal, prevBal, amount, orgId, userId;
    String des;
    
    public Payment(int i) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RFID Card R/W - Payment");
        orgId = i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        pageName = new javax.swing.JLabel();
        msgTextLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        billDesLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        desField = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(0, 102, 204));

        top.setBackground(new java.awt.Color(255, 102, 102));

        appName.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("RFID Card R/W");

        pageName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pageName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageName.setText("Make Payment");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pageName))
        );

        msgTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        msgTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgTextLabel.setText("Kindly press PAY button and then Put your card on the scanner...");

        payButton.setBackground(new java.awt.Color(153, 255, 204));
        payButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        billDesLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billDesLabel.setForeground(new java.awt.Color(255, 255, 255));
        billDesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        billDesLabel.setText("Bill Description:");

        amountLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amountLabel.setText("Amount:");

        desField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        amountField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(msgTextLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(billDesLabel)
                                    .addComponent(amountLabel))
                                .addGap(18, 18, 18)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billDesLabel)
                    .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(msgTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        des = desField.getText();
        amount = Integer.parseInt(amountField.getText());
        
        if(varifyFields()){
            readCard();
        }
    }//GEN-LAST:event_payButtonActionPerformed
    
    public boolean varifyFields()
    {   
        if(des.trim().equals("") || amount <= 0){
            JOptionPane.showMessageDialog(null, "Description can't be empty or amount can't be 0", "ERROR: Error Fields", 2);
            return false;
        }
        else{
            return true;
        }
    }
    
    public void readCard(){
        String s = "";
        
        while(s.length() != 10){
            Arduino arduino = new Arduino("COM5", 115200);
            arduino.openConnection();
            s = arduino.serialRead(50);
            arduino.closeConnection();
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
            }
        }
        
        if(!cardUsed(s)){
            s = "";
            JOptionPane.showMessageDialog(null, "No user found for this Card!", "ERROR!", 2);
        }
    }
    
    public boolean cardUsed(String card)
    {
        PreparedStatement st;
        ResultSet rs;
        
        boolean isCardUsed = false;
        String query = "SELECT * FROM `members` WHERE `orgid` = ? AND `cardnum` = ?";
        
        try {
            st = MyConnection.getConnection().prepareStatement(query);
            st.setInt(1, orgId);
            st.setString(2, card);
            rs = st.executeQuery();
            
            if(rs.next()){
                isCardUsed = true;
                userId = rs.getInt("id");
                prevBal = rs.getInt("balance");
                
                if(prevBal < amount){
                    JOptionPane.showMessageDialog(null, "Not enough Balance!", "Error!", 2);
                }
                else{
                    newBal = prevBal - amount;
                    updateBalance();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isCardUsed;
    }
    
    public void updateBalance(){
        PreparedStatement st;
        ResultSet rs;
        
        String query = "update `members` set `balance` = ? WHERE `id` = ?";
        
        try {
            st = MyConnection.getConnection().prepareStatement(query);
            st.setInt(1, newBal);
            st.setInt(2, userId);
            if(st.executeUpdate() != 0){
                newTransaction();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void newTransaction(){
        PreparedStatement st;
        ResultSet rs;

        String regQuery = "INSERT INTO `transactions`(`description`, `prevbal`, `newbal`, `userid`, `orgid`) VALUES (?,?,?,?,?)";

        try {
            st = MyConnection.getConnection().prepareStatement(regQuery);

            st.setString(1, des);
            st.setInt(2, prevBal);
            st.setInt(3, newBal);
            st.setInt(4, userId);
            st.setInt(5, orgId);



            if(st.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Payments successfull!", "Congrats!", 2);
                desField.setText("");
                amountField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "OOPS! Something went wrong!", "Error", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel appName;
    private javax.swing.JLabel billDesLabel;
    private javax.swing.JPanel body;
    private javax.swing.JTextField desField;
    private javax.swing.JLabel msgTextLabel;
    private javax.swing.JLabel pageName;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}