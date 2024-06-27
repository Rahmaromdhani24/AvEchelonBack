package com.rahma.AvEchelon.Repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import com.rahma.AvEchelon.Entity.Sanction;

public interface SanctionRepository extends JpaRepository<Sanction , Integer> {
	
	/*@Query("SELECT s FROM Sanction s WHERE s.d_Debut > :dateEffetPlusUnJour AND s.d_Debut < :dateProchainAvancementMoinsUnJour AND s.sanctionPersonnel.mle = :mle")
    List<Sanction> findSanctionsWithinDateRange(
            @Param("dateEffetPlusUnJour") Date dateEffetPlusUnJour,
            @Param("dateProchainAvancementMoinsUnJour") Date dateProchainAvancementMoinsUnJour,
            @Param("mle") String mle
    );*/
	@Query("SELECT s FROM Sanction s WHERE s.d_Debut >= :dateProchainAvancementMoins18Mois AND s.sanctionPersonnel.mle = :mle")
    List<Sanction> findSanctionsSinceDateProchainAvancement(
            @Param("dateProchainAvancementMoins18Mois") Date dateProchainAvancementMoins18Mois,
            @Param("mle") String mle
    );
	
}