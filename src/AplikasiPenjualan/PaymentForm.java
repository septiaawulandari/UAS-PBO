/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenjualan;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PaymentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form paymentForm
     */
    
    
    public void areaChange(){
        radioButton.clearSelection();
        largeLandTxt.setText("");
        availableLandTxt.setText("");
        totalPriceTxt.setText("");
        DPTxt.setText("");
        instalmentAmountTxt.setText("");
        instalmentMonthTxt.setText("");
        ppnTxt.setText("");
        agreementCbx.setSelected(false);
    }
    
    public void countTotalPrice(){
        long    landPrice = Long.parseLong(priceLandTxt.getText()),
                buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                availableLand = Long.parseLong(availableLandTxt.getText()),
                totalPrice;
            
        totalPrice = (availableLand * landPrice) + buildingPrice;
        totalPriceTxt.setText("" + totalPrice);

        DPTxt.setText("");
        ppnTxt.setText("");
        instalmentMonthTxt.setText("");
        instalmentAmountTxt.setText("");
    }
    
    public PaymentForm() {
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

        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        priceLandTxt = new javax.swing.JTextField();
        areaCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buildingPriceTxt = new javax.swing.JTextField();
        t36RadioButton = new javax.swing.JRadioButton();
        t45RadioButton = new javax.swing.JRadioButton();
        t54RadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        largeLandTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availableLandTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalPriceTxt = new javax.swing.JTextField();
        DPTxt = new javax.swing.JTextField();
        instalmentAmountTxt = new javax.swing.JTextField();
        ppnTxt = new javax.swing.JTextField();
        instalmentMonthTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agreementCbx = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deteleButton = new javax.swing.JButton();
        toOptionMenuButton = new javax.swing.JButton();

        setTitle("FORM PENJUALAN");

        jLabel1.setText("Nama Pemesan");
        jLabel1.setToolTipText("");

        jLabel2.setText("Harga Tanah/m2");

        jLabel3.setText("Area");

        priceLandTxt.setEditable(false);
        priceLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        areaCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- PILIH ---", "Bougenvile", "Melati", "Flamboyan" }));
        areaCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboboxActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rumah.png"))); // NOI18N

        jLabel5.setText("Harga Bangunan");

        jLabel6.setText("Tipe Rumah");

        buildingPriceTxt.setEditable(false);
        buildingPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        radioButton.add(t36RadioButton);
        t36RadioButton.setText("Tipe-36");
        t36RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t45RadioButton);
        t45RadioButton.setText("Tipe-45");
        t45RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t54RadioButton);
        t54RadioButton.setText("Tipe-54");
        t54RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54RadioButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Luas Tanah Asli");

        largeLandTxt.setEditable(false);
        largeLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Luas Tanah Tersedia");

        availableLandTxt.setEditable(false);
        availableLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("Harga");

        jLabel10.setText("DP");

        jLabel11.setText("Lama Cicilan");

        jLabel12.setText("PPN (10%)");

        jLabel13.setText("Cicilan/Bulan");

        totalPriceTxt.setEditable(false);
        totalPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DPTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentAmountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ppnTxt.setEditable(false);
        ppnTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentMonthTxt.setEditable(false);
        instalmentMonthTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel14.setText("Bulan");

        agreementCbx.setText("Setuju");
        agreementCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbxActionPerformed(evt);
            }
        });

        processButton.setText("PROSES");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SIMPAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deteleButton.setText("HAPUS");
        deteleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteleButtonActionPerformed(evt);
            }
        });

        toOptionMenuButton.setText("Kembali Ke Menu Utama");
        toOptionMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toOptionMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(orderNameTxt)
                                    .addComponent(priceLandTxt)
                                    .addComponent(areaCombobox, 0, 161, Short.MAX_VALUE))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(38, 38, 38)
                                .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agreementCbx))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(t36RadioButton)
                                    .addComponent(t54RadioButton)
                                    .addComponent(t45RadioButton)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(buildingPriceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(largeLandTxt)
                                        .addComponent(availableLandTxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(instalmentAmountTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(DPTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalPriceTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ppnTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)))))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(toOptionMenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deteleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buildingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(areaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(largeLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t36RadioButton))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(t45RadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availableLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t54RadioButton))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(DPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(instalmentAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ppnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agreementCbx))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processButton)
                    .addComponent(deteleButton)
                    .addComponent(saveButton)
                    .addComponent(toOptionMenuButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboboxActionPerformed
        switch(areaCombobox.getSelectedIndex()){
            case 0 :
                priceLandTxt.setText("");
                buildingPriceTxt.setText("");
                areaChange();
            break;
            
            case 1 :
                priceLandTxt.setText("500000");
                buildingPriceTxt.setText("90000000");
                areaChange();
            break;
            
            case 2 :
                priceLandTxt.setText("600000");
                buildingPriceTxt.setText("120000000");
                areaChange();
            break;
            
            default :
                priceLandTxt.setText("700000");
                buildingPriceTxt.setText("150000000");
                areaChange();
            break;
        }
    }//GEN-LAST:event_areaComboboxActionPerformed

    private void t36RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() ==  0){
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu!!!");
            radioButton.clearSelection();
        
        }else{
            largeLandTxt.setText("90");  
            availableLandTxt.setText("54");
            countTotalPrice();
        }  
    }//GEN-LAST:event_t36RadioButtonActionPerformed

    private void t45RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() ==  0){
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu!!!");
            radioButton.clearSelection();
        
        }else{
            largeLandTxt.setText("120");  
            availableLandTxt.setText("75");
            countTotalPrice();
        }
    }//GEN-LAST:event_t45RadioButtonActionPerformed

    private void t54RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() ==  0){
            JOptionPane.showMessageDialog(null, "Pilih Area Terlebih Dahulu!!!");
            radioButton.clearSelection();
        
        }else{
            largeLandTxt.setText("140");  
            availableLandTxt.setText("86");
            countTotalPrice();
        }
    }//GEN-LAST:event_t54RadioButtonActionPerformed

    private void deteleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteleButtonActionPerformed
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingPriceTxt.setText("");
        largeLandTxt.setText("");
        availableLandTxt.setText("");
        totalPriceTxt.setText("");
        DPTxt.setText("");
        instalmentAmountTxt.setText("");
        instalmentMonthTxt.setText("");
        ppnTxt.setText("");
        areaCombobox.setSelectedIndex(0);
        radioButton.clearSelection();
        agreementCbx.setSelected(false);
        
    }//GEN-LAST:event_deteleButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        if(totalPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilihan belum lengkap!!!");
        }else if(DPTxt.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "DP harus diisi!!!"); 
        }else if(instalmentAmountTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan!!!");
        }else{
            long    landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableLand = Long.parseLong(availableLandTxt.getText()), 
                    dp = Long.parseLong(DPTxt.getText()),
                    instalmentAmount = Long.parseLong(instalmentAmountTxt.getText()),
                    totalPrice, ppn, instalmentPerMonth;
            
            totalPrice = (availableLand * landPrice) + buildingPrice;
            ppn = totalPrice * 10 / 100;
            instalmentPerMonth = (totalPrice + ppn - dp) / instalmentAmount;
            
            ppnTxt.setText("" + ppn);
            instalmentMonthTxt.setText("" + instalmentPerMonth);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(agreementCbx.isSelected() == false){
            JOptionPane.showMessageDialog(null, 
                "Klik centang checkbox setuju untuk simpan data",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }else{
            String typeHouse;
            
            if(t36RadioButton.isSelected()){
                typeHouse = "TIPE 36";
            }else if(t45RadioButton.isSelected()){
                typeHouse = "TIPE 45";
            }else{
                typeHouse = "TIPE 54";
            } 
            
            try{
                String sql = "INSERT INTO rumah(name, area, tipe, luas, harga, jumlah_cicilan, cicilan_bulan) VALUES("
                    + "'" + orderNameTxt.getText() + "',"
                    + "'" + areaCombobox.getSelectedItem() + "',"
                    + "'" + typeHouse + "',"
                    + "'" + largeLandTxt.getText() + "',"
                    + "'" + totalPriceTxt.getText() + "',"
                    + "'" + instalmentAmountTxt.getText() + "',"
                    + "'" + instalmentMonthTxt.getText() + "')";
                
                Connection conn = (Connection)ConnectionDb.connectDatabase();
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            OptionMenu optionMenu = new OptionMenu();
            this.getDesktopPane().add(optionMenu);
            Dimension gs = this.getDesktopPane().getSize();
            Dimension cs = optionMenu.getSize();

            optionMenu.setLocation((gs.width - cs.width) / 2, (gs.height - cs.height) / 2);
            
            optionMenu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void agreementCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbxActionPerformed
        if(orderNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama pemesan harus diisi!!!");
            agreementCbx.setSelected(false);
        }else if(ppnTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tekan tombol proses terlebih dahulu!!!");
            agreementCbx.setSelected(false);
        }else if(agreementCbx.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Pemesan Menyetujui");
            agreementCbx.setSelected(true);
        }else{
            JOptionPane.showMessageDialog(null, "Pemesan belum menyetujui!!!");
            agreementCbx.setSelected(false);
        }
    }//GEN-LAST:event_agreementCbxActionPerformed

    private void toOptionMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toOptionMenuButtonActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        Dimension gs = this.getDesktopPane().getSize();
        Dimension cs = optionMenu.getSize();

        optionMenu.setLocation((gs.width - cs.width) / 2, (gs.height - cs.height) / 2);
        this.dispose();
    }//GEN-LAST:event_toOptionMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DPTxt;
    private javax.swing.JCheckBox agreementCbx;
    private javax.swing.JComboBox<String> areaCombobox;
    private javax.swing.JTextField availableLandTxt;
    private javax.swing.JTextField buildingPriceTxt;
    private javax.swing.JButton deteleButton;
    private javax.swing.JTextField instalmentAmountTxt;
    private javax.swing.JTextField instalmentMonthTxt;
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
    private javax.swing.JTextField largeLandTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField ppnTxt;
    private javax.swing.JTextField priceLandTxt;
    private javax.swing.JButton processButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36RadioButton;
    private javax.swing.JRadioButton t45RadioButton;
    private javax.swing.JRadioButton t54RadioButton;
    private javax.swing.JButton toOptionMenuButton;
    private javax.swing.JTextField totalPriceTxt;
    // End of variables declaration//GEN-END:variables
}
