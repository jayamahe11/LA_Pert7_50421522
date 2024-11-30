package com.mahasiswa.view;
 
import com.mahasiswa.controller.mahasiswaController;
import com.mahasiswa.model.modelmahasiswa;
import com.mahasiswa.model.modelTableMahasiswa;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public final class mahasiswaView extends javax.swing.JFrame {
    private final mahasiswaController controller;
 
    public mahasiswaView(mahasiswaController controller) {
        this.controller = controller;
        initComponents();
        loadMahasiswaTable();
    }
    
    
    public void loadMahasiswaTable(){
        List<modelmahasiswa> listMahasiswa = controller.getAllMahasiswa();
        modelTableMahasiswa tableModel = new modelTableMahasiswa(listMahasiswa);
        dataTable.setModel(tableModel);
    }
//...
 
 
 
    private void jButton3ActionPerformed() {                                         
        JTextField idField = new JTextField(10);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Masukan ID yang Ingin Dihapus : "));
        panel.add(idField);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Hapus Mahasiswa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            try{
                int id = Integer.parseInt(idField.getText());
                controller.deleteMahasiswa(id);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadMahasiswaTable();
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ID Harus Berupa Angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } 

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}