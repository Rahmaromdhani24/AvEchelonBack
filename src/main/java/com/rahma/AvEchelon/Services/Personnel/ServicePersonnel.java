package com.rahma.AvEchelon.Services.Personnel;

import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rahma.AvEchelon.Entity.Avancement;
import com.rahma.AvEchelon.Entity.Sanction;
import com.rahma.AvEchelon.Repository.PersonnelRepository;
import com.rahma.AvEchelon.Repository.PostRepository;
import com.rahma.AvEchelon.Repository.SanctionRepository;
import com.rahma.AvEchelon.Services.Avancement.ServiceAvancement;
import java.text.SimpleDateFormat;
@Service

public class ServicePersonnel implements IServicePersonnel {

	@Autowired PostRepository repoPoste ; 
	@Autowired ServiceAvancement serviceAvancement ; 
	@Autowired PersonnelRepository repository ; 
	@Autowired SanctionRepository sanctionRepository  ; 
	

	@Override
	public List<MesPersonnels> getMesPersonnels() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = sdf.parse("2024-06-07");
        return repository.mesPersonnels(currentDate);
    }
	
	
	@Override
	public MesPersonnels recuperePersonnelParMle(String mle) throws ParseException {

		List<MesPersonnels> liste=  getMesPersonnels();
		MesPersonnels personnel = null ; 
         for(MesPersonnels p : liste) {
			 if(p.getMle().equals(mle))
	
		 personnel= p ; 
	}
         return personnel ; 
}
	
	/*public List<Sanction> recupererSanctionsPersonnel(String mle) {
           List<Sanction> allSanctions = sanctionRepository.findAll() ; 
           List<Sanction> listeFinale = new ArrayList<Sanction>() ; 
           Avancement avancementRecentDePersonnel = serviceAvancement.derniereAvancementPersonnel(mle) ; 
           for (Sanction sanction : allSanctions) {
        	   
        	   if(sanction.getSanctionPersonnel().getMle().equals(mle)) {
        		//  if(avancementRecentDePersonnel.getdEffet())
        		   listeFinale.add(sanction) ; 
        	   }
           }
		return listeFinale ;
	}*/
	/*@Override
	  public List<Sanction> recupererSanctionsPersonnel(String mle) {
        Avancement dernierAvancement = serviceAvancement.derniereAvancementPersonnel(mle);
        
        if (dernierAvancement == null) {
            return null; }
        

        Date dateEffet = dernierAvancement.getdEffet() ; 
        Date dateProchainAvancement = dernierAvancement.getdPAv() ; 

        Calendar cal = Calendar.getInstance();
        
        // Calcul de dateEffetPlusUnJour
        cal.setTime(dateEffet);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        Date dateEffetPlusUnJour = cal.getTime();
        
        // Calcul de dateProchainAvancementMoinsUnJour
        cal.setTime(dateProchainAvancement);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date dateProchainAvancementMoinsUnJour = cal.getTime();

        return sanctionRepository.findSanctionsWithinDateRange(dateEffetPlusUnJour, dateProchainAvancementMoinsUnJour, mle);
    }*/
	@Override
	  public List<Sanction> recupererSanctionsPersonnel18Mois(String mle) {
	        Avancement dernierAvancement = serviceAvancement.derniereAvancementPersonnel2(mle);
	        
	        if (dernierAvancement == null) {
	            return null; // Ou gérez l'absence d'avancement comme vous le souhaitez
	        }

	        Date dateProchainAvancement = dernierAvancement.getDPAv();

	        // Calcul de la date de prochain avancement moins 18 mois
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(dateProchainAvancement);
	        cal.add(Calendar.MONTH, -18);
	        Date dateProchainAvancementMoins18Mois = cal.getTime();

	        return sanctionRepository.findSanctionsSinceDateProchainAvancement(dateProchainAvancementMoins18Mois, mle);
	    }

}
