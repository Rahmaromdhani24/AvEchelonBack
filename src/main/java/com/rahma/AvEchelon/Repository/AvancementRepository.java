package com.rahma.AvEchelon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rahma.AvEchelon.Entity.*;
import java.util.Date;
import java.util.List;
@Repository
	
	public interface AvancementRepository extends JpaRepository<Avancement , Integer> {

    List<Avancement> findBydPAv(Date dateProchainAvancement);
                                  /**************************************/
    @Query("SELECT a FROM Avancement a WHERE a.TPersonnel.mle = :mle")
    List<Avancement> findAvancementsByPersonnelMle(@Param("mle") String mle);
    
                                 /**************************************/
    
    @Query("SELECT a FROM Avancement a WHERE a.dEffet = (SELECT MAX(a2.dEffet) FROM Avancement a2 WHERE a2.TPersonnel = a.TPersonnel)")
    List<Avancement> findRecentAvancements2();
                                  /**************************************/
  
    // Requête pour récupérer le dernier avancement de chaque personnel
   /* @Query("SELECT a FROM Avancement a WHERE (a.TPersonnel.mle, a.dEffet) IN " +
           "(SELECT a2.TPersonnel.mle, MAX(a2.dEffet) FROM Avancement a2 GROUP BY a2.TPersonnel.mle)")
    List<Avancement> findLatestAvancementsForEachPersonnel();*/
 // Requête pour récupérer le dernier avancement de chaque personnel spécifique
   
    /*@Query("SELECT a FROM Avancement a " +
    	       "WHERE a.TPersonnel.mle IN :personnelMles " +
    	       "AND a.dEffet = (SELECT MAX(a2.dEffet) FROM Avancement a2 WHERE a2.TPersonnel.mle = a.TPersonnel.mle)")
    	List<Avancement> findLatestAvancementsForEachPersonnel(@Param("personnelMles") List<String> personnelMles);*/
    
    @Query("SELECT a FROM Avancement a " +
    	       "WHERE a.TPersonnel.mle IN :personnelMles " +
    	       "AND a.dEffet = (SELECT MAX(a2.dEffet) FROM Avancement a2 WHERE a2.TPersonnel.mle = a.TPersonnel.mle)")
    	List<Avancement> findLatestAvancementsForEachPersonnel(@Param("personnelMles") List<String> personnelMles);


}
