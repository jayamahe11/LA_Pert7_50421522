package com.mahasiswa.service;
 
import com.mahasiswa.model.modelmahasiswa;
import com.mahasiswa.repository.mahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class mahasiswaService {
    @Autowired
    private mahasiswaRepository repository;
    
    public void addMhs(modelmahasiswa mhs){
        repository.save(mhs);
    }
    
    public modelmahasiswa getMhs(int id){
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(modelmahasiswa mhs){
        repository.save(mhs);
    }
    
    public void deleteMhs(int id){
        repository.deleteById(id);
    }
    
    public List<modelmahasiswa> getAllMahasiswa(){
        return repository.findAll();
    }
}