package com.mahasiswa.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mahasiswa.model.modelmahasiswa;
import com.mahasiswa.service.mahasiswaService;
import com.mahasiswa.view.modelMahasiswa;
import java.util.List;
import org.springframework.stereotype.Controller;
 
@Controller
public class mahasiswaController {
    @Autowired
    private mahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody modelmahasiswa mhs){
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa Added Successfully";
    }
    
    public modelmahasiswa getMahasiswa(@PathVariable int id){
        return mahasiswaService.getMhs(id);
    }
    
    public String updateMahasiswa(@RequestBody modelmahasiswa mhs){
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa Updated Successfully";
    }
    
    public String deleteMahasiswa(@PathVariable int id){
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Successfully";
    }
    
    public List<modelmahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }

    public void addMahasiswa(modelMahasiswa mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}