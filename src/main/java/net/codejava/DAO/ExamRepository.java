package net.codejava.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.codejava.model.Exam;
import net.codejava.model.User;

public interface ExamRepository extends JpaRepository<Exam, Long> {
	@Query("SELECT e FROM Exam e WHERE e.email = ?1")
	public Exam findByEmail(String email);
	
}
