package com.rahma.AvEchelon.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rahma.AvEchelon.Entity.*;

@Repository
	
	public interface TriggerRepository extends JpaRepository<Trigger_Avancement , Long> {

	
}