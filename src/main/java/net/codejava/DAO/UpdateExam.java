package net.codejava.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.model.listofexam;

public interface UpdateExam extends JpaRepository<listofexam, Long> {
 
}