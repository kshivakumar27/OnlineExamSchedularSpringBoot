package net.codejava.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.codejava.model.listofexam;


	
	
	

public interface listexamRepository extends JpaRepository<listofexam, Long> {
	@Query("SELECT x FROM listofexam x WHERE x.examcode = ?1")
	
	public listofexam findById(long examcode);
	
}
