package net.codejava.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.UpdateExam;
import net.codejava.model.listofexam;
 
@Service
@Transactional
public class Updateservice {
 @Autowired
    private UpdateExam repo;
     
    public List<listofexam> listAll() {
        return repo.findAll();
    }
     
    public void save(listofexam lie) {
        repo.save(lie);
    }
     
    public listofexam get(long examcode) {
        return repo.findById(examcode).get();
    }
  
}