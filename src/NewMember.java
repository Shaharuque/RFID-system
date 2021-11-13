import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewMember extends javax.swing.JFrame {
    int orgId;
    int bal;
    String cardNum;
    String name;
    String email;
    String des;
    
    
    public NewMember(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RFID Card R/W - Scan");
        orgId = id;
        nameField.setEnabled(false);
        emailField.setEnabled(false);
        desField.setEnabled(false);
        addMemButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        pageName = new javax.swing.JLabel();
        msgTextLabel = new javax.swing.JLabel();
        scanButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        desLabel = new javax.swing.JLabel();
        desField = new javax.swing.JTextField();
        addMemButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cardNumField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(0, 102, 204));

        top.setBackground(new java.awt.Color(255, 102, 102));

        appName.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("RFID Card R/W");

        pageName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pageName.setText("Add New Member");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(pageName))
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(appName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appName)
                .addGap(18, 18, 18)
                .addComponent(pageName))
        );

        msgTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        msgTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgTextLabel.setText("Kindly press scan button and then Put your card on the scanner...");

        scanButton.setBackground(new java.awt.Color(153, 255, 204));
        scanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scanButton.setText("Scan");
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name:");

        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("Email:");

        emailField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        desLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desLabel.setForeground(new java.awt.Color(255, 255, 255));
        desLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        desLabel.setText("Designation:");

        desField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        addMemButton.setBackground(new java.awt.Color(153, 255, 204));
        addMemButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMemButton.setText("Add Member");
        addMemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 153, 153));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cardNumField.setBackground(new java.awt.Color(0, 0, 0));
        cardNumField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNumField.setForeground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailField))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)))
                .addGap(82, 82, 82))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(msgTextLabel))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(scanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cardNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(addMemButton)
                        .addGap(46, 46, 46)
                        .addComponent(cancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scanButton)
                    .addComponent(cardNumField))
                .addGap(52, 52, 52)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desLabel)
                    .addComponent(desField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMemButton)
                    .addComponent(cancelButton))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        cardNumField.setText("Scanning...");
        readCard();
    }//GEN-LAST:event_scanButtonActionPerformed

    private void addMemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemButtonActionPerformed
        name = nameField.getText();
        email = emailField.getText();
        des = desField.getText();
        cardNum = cardNumField.getText();
        
        addMember();
    }//GEN-LAST:event_addMemButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public void readCard(){
        String s = "";
        
        while(s.length() != 10){
            Arduino arduino = new Arduino("COM5", 115200);
            arduino.openConnection();
            s = arduino.serialRead(50);
            arduino.closeConnection();
            //System.out.println(s.length());
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                //System.out.println(e.getMessage());
            }
        }
        
        if(!cardUsed(s)){
            nameField.setEnabled(true);
            emailField.setEnabled(true);
            desField.setEnabled(true);
            addMemButton.setEnabled(true);
            
            cardNum = s;
            cardNumField.setText(cardNum);
        }
        else{
            s = "";
            cardNumField.setText("Scan Again");
            nameField.setEnabled(false);
            emailField.setEnabled(false);
            desField.setEnabled(false);
            addMemButton.setEnabled(false);
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
            st.setString(1, orgId+"");
            st.setString(2, card);
            rs = st.executeQuery();
            
            if(rs.next()){
                isCardUsed = true;
                JOptionPane.showMessageDialog(null,"Card is used. Try a blank Card!","Card Used",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isCardUsed;
    }
    
    public boolean emailUsed(String e)
    {
        PreparedStatement st;
        ResultSet rs;
        
        boolean isEmailUsed = false;
        String query = "SELECT * FROM `members` WHERE `orgid` = ? AND `email` = ?";
        
        try {
            st = MyConnection.getConnection().prepareStatement(query);
            st.setString(1, orgId+"");
            st.setString(2, e);
            rs = st.executeQuery();
            
            if(rs.next()){
                isEmailUsed = true;
                JOptionPane.showMessageDialog(null,"Email is used! Try different email.","Card Used",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isEmailUsed;
    }
    
    public void addMember(){
        if(varifyFields()){
            if(!emailUsed(email)){
                PreparedStatement st;
                ResultSet rs;
        
                String regQuery = "INSERT INTO `members`(`orgid`, `name`, `email`, `designation`, `balance`, `cardnum`) VALUES (?,?,?,?,?,?)";
                
                try {
                    st = MyConnection.getConnection().prepareStatement(regQuery);
                    
                    st.setInt(1, orgId);
                    st.setString(2, name);
                    st.setString(3, email);
                    st.setString(4, des);
                    st.setInt(5, bal);
                    st.setString(6,cardNum);
                    
                    
                    
                    if(st.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "New member is added!", "Congratulations", 2);
                        cardNumField.setText("");
                        nameField.setText("");
                        emailField.setText("");
                        desField.setText("");
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "OOPS! Something went wrong!", "Error", 2);
                    }
                        
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public boolean varifyFields()
    {   
        if(cardNum.trim().equals("") || name.trim().equals("") || email.trim().equals("") || des.trim().equals("")){
            JOptionPane.showMessageDialog(null, "One or More fields are empty!", "ERROR: Empty Fields", 2);
            return false;
        }
        else{
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemButton;
    private javax.swing.JLabel appName;
    private javax.swing.JPanel body;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cardNumField;
    private javax.swing.JTextField desField;
    private javax.swing.JLabel desLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel msgTextLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pageName;
    private javax.swing.JButton scanButton;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
