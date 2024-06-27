package com.rahma.AvEchelon.Services.Avancement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rahma.AvEchelon.Entity.Avancement;
import com.rahma.AvEchelon.Repository.AvancementRepository;
import com.rahma.AvEchelon.Repository.PersonnelRepository;
import com.rahma.AvEchelon.Services.Personnel.MesPersonnels;




@Service
public class ServiceAvancement implements IServiceAvancement {

	
	@Autowired AvancementRepository repository ; 
	@Autowired PersonnelRepository repositoryPersonnel ; 

	
	@Override
	public List<Avancement> getAllAvancementPersonnel(String mle) {
        List <Avancement> all = 	repository.findAll() ; 
		List<Avancement> listeFinal = 	new ArrayList<Avancement>() ; 

		for (Avancement  av : all) {
			if(av.getTPersonnel().getMle().equals(mle))
				listeFinal.add(av) ; 	}
	
          return listeFinal ; }
		               
	                    /**************************************************************/
	
	@Override
	public List<Avancement> getAvancementCeMois(String dateString) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date convertedDate = dateFormat.parse(dateString);
		 return  repository.findBydPAv(convertedDate) ; }//listeFinal ;
	         
                    	/**************************************************************/
	

	@Override
	public int nombreAvancemenentCeMois(String dateString) throws ParseException {
		// TODO Auto-generated method stub
		List<Avancement> liste = getAvancementCeMois(dateString) ; 
		return liste.size();}
	  
	                   /**************************************************************/
	@Override
	public Avancement derniereAvancementPersonnel2(String mle) {
		List<Avancement> listRecentHistoriqueAvancement = repository.findRecentAvancements2();
		Avancement avancementFinale = null  ; 
		
		for (Avancement avancement :listRecentHistoriqueAvancement ) {
			if(avancement.getTPersonnel().getMle().equals(mle)) {
				avancementFinale = avancement ; 
			}
		}
		return avancementFinale;}
	
                    	/*************************************************************/
	public List<MesPersonnels> getMesPersonnels() throws ParseException {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date currentDate = sdf.parse("2024-06-07");
	    return repositoryPersonnel.mesPersonnels(currentDate);
	}

	@Override
    public List<Avancement> lesDernieresAvancementPersonnels() throws ParseException {
        // Étape 1 : Récupérer les personnels spécifiques
        List<MesPersonnels> mesPersonnels = getMesPersonnels();
        
        // Étape 2 : Extraire les 'mle' des objets 'MesPersonnels'
        List<String> personnelMles = mesPersonnels.stream()
                                                  .map(MesPersonnels::getMle)
                                                  .collect(Collectors.toList());
        
        // Étape 3 : Récupérer les derniers avancements pour ces personnels
        List<Avancement> avancements = repository.findLatestAvancementsForEachPersonnel(personnelMles);
        
        // Étape 4 : Filtrer pour obtenir les avancements uniques pour chaque personnel
        Map<String, Avancement> dernierAvancementParPersonnel = avancements.stream()
                                                                           .collect(Collectors.toMap(
                                                                               avancement -> avancement.getTPersonnel().getMle(),
                                                                               avancement -> avancement,
                                                                               (existing, replacement) -> existing // En cas de doublon, gardez le premier
                                                                           ));
        
        return dernierAvancementParPersonnel.values().stream()
                                              .collect(Collectors.toList());
    }
	
                    	/**************************************************************/
	
	@Override
	public List<Avancement> getAnomalieAvancemets() throws ParseException {
		// TODO Auto-generated method stub
		
		List<Avancement> liste  = lesDernieresAvancementPersonnels();
		List<Avancement> listeFinale  = new ArrayList<Avancement>() ; 
		Date dateCurrent = new Date(); // Supposons que vous avez déjà la date actuelle
		  
		  for (Avancement avancement : liste) {
	            if (avancement.getDPAv() != null && avancement.getDPAv().before(dateCurrent)) {
	                listeFinale.add(avancement);
	            }
	        }

	        return listeFinale;
	}
	
	
	}
