/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Muntasir Mahid
 */
public class addressBook extends javax.swing.JFrame {

    /**
     * Creates new form addressBook
     */
    public addressBook() {
        initComponents();
        try {
            file = new File("data.txt");
            writer = new BufferedWriter(new FileWriter(file,false));
        }
        catch (IOException e) {
            throw new RuntimeException(e);}

    }
    public void populateArray(){

        try{
            FileInputStream file=new FileInputStream("Jobs.dat");
            ObjectInputStream inputFile=new ObjectInputStream(file);

            boolean endOfFile=false;

            while(!endOfFile){
                try{
                    address.add((profile)inputFile.readObject());
                }catch(EOFException e ){
                    endOfFile =true;
                }
                catch(Exception f){
                    JOptionPane.showConfirmDialog(null, f.getMessage());
                }
            }
            inputFile.close();
        }
        catch(IOException e ){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        searchtf = new javax.swing.JTextField();
        searchbt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayta = new javax.swing.JTextArea();
        editbt = new javax.swing.JButton();
        viewbt = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address Book");

        jLabel2.setText("Name :");

        jLabel3.setText("Phone No. :");

        jLabel4.setText("E-mail :");

        jLabel5.setText("Address :");

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        phonetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetfActionPerformed(evt);
            }
        });

        emailtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtfActionPerformed(evt);
            }
        });

        addresstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstfActionPerformed(evt);
            }
        });

        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });

        searchbt.setText("Search");
        searchbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter the name you want to search");

        addbt.setText("Add");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });

        displayta.setColumns(20);
        displayta.setRows(5);
        jScrollPane1.setViewportView(displayta);

        editbt.setText("Edit");
        editbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtActionPerformed(evt);
            }
        });

        viewbt.setText("View");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(279, 279, 279))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(phonetf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(39, 39, 39)
                                                                                .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel5))
                                                                                .addGap(29, 29, 29)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(emailtf)
                                                                                        .addComponent(addresstf))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(editbt, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(114, 114, 114))))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(addbt)
                                                .addGap(163, 163, 163)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(viewbt)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane1))))
                                .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchbt)
                                .addGap(186, 186, 186))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)))
                                .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phonetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(editbt)
                                                        .addComponent(viewbt))
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(searchbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(30, 30, 30)
                                                .addComponent(addbt)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>

    private void addresstfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void phonetfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void emailtfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        address.add(new profile(nametf.getText(),phonetf.getText().substring(1), emailtf.getText(), addresstf.getText()));
        try{
            writer.append(nametf.getText()+"\n");
            writer.append(phonetf.getText().substring(1)+"\n");
            writer.append(emailtf.getText()+"\n");
            writer.append(addresstf.getText()+"\n");
            writer.flush();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        nametf.setText("");
        phonetf.setText("");
        emailtf.setText("");
        addresstf.setText("");
    }

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchbtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (searchtf.getText()!=""){
            for(int i = 0; i < address.size(); i++){
                if (address.get(i).getName().equalsIgnoreCase(searchtf.getText())){
                    index=i;
                    break;
                }
            }
        }
        if(index==-1){
            displayta.setText("Name not found.");
        }
        else {
            displayta.setText("");
            nametf.setText(address.get(index).getName());
            phonetf.setText(address.get(index).getPhone());
            emailtf.setText(address.get(index).getEmail());
            addresstf.setText(address.get(index).getAddress());
            displayta.append(address.get(index).getName()+"\n");
            displayta.append(address.get(index).getPhone()+"\n");
            displayta.append(address.get(index).getEmail()+"\n");
            displayta.append(address.get(index).getAddress()+"\n");

        }
    }

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        displayta.setText("");
        address.sort(new Comparator<profile>(){
            @Override
            public int compare(profile o1, profile o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
        if(address.size()!=0){
            for(profile p : address) {
                displayta.append("Name: "+p.getName()+"\n");
                displayta.append("Phone No: "+p.getPhone()+"\n");
                displayta.append("E-mail: "+p.getEmail()+"\n");
                displayta.append("Address: "+p.getAddress()+"\n");
            }
        }
        else {
            displayta.setText("Address Book is Empty.");
        }
    }

    private void editbtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (index==-1){
            displayta.setText("Search");
        }
        else {
            address.set(index, new profile(nametf.getText(),phonetf.getText(),emailtf.getText(),addresstf.getText()));
            try{
                try{
                    file = new File("data.txt");
                    writer = new BufferedWriter(new FileWriter(file,false));
                }
                catch (IOException e){
                    throw new RuntimeException(e);
                }
                for(profile p :address){
                    writer.append(p.getName()+"\n");
                    writer.append(p.getPhone()+"\n");
                    writer.append(p.getEmail()+"\n");
                    writer.append(p.getAddress()+"\n");
                    writer.flush();
                    displayta.setText("Profile Edited");
                    nametf.setText("");
                    phonetf.setText("");
                    emailtf.setText("");
                    addresstf.setText("");
                }
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(addressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addressBook().setVisible(true);
            }
        });
    }
    ArrayList<profile> address =new ArrayList<>();
    private File file;
    private BufferedWriter writer;
    int index=-1 ;

    // Variables declaration - do not modify
    private javax.swing.JButton addbt;
    private javax.swing.JTextField addresstf;
    private javax.swing.JTextArea displayta;
    private javax.swing.JButton editbt;
    private javax.swing.JTextField emailtf;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JButton searchbt;
    private javax.swing.JTextField searchtf;
    private javax.swing.JButton viewbt;
    // End of variables declaration
}
