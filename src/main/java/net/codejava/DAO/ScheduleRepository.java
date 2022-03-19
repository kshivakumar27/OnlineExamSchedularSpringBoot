package net.codejava.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.codejava.model.Shedule;

public interface ScheduleRepository extends JpaRepository<Shedule, String> {
	@Query("SELECT k FROM Shedule k WHERE k.fullname = ?1")
	public Shedule findByfullname(String fullname);

}
