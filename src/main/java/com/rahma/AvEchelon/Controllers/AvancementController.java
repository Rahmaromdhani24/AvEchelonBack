package com.rahma.AvEchelon.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rahma.AvEchelon.Entity.Avancement;
import com.rahma.AvEchelon.Repository.AvancementRepository;
import com.rahma.AvEchelon.Services.Avancement.ServiceAvancement;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/avancement")
public class AvancementController {
	
 @Autowired private AvancementRepository repository;
 @Autowired private ServiceAvancement service;
	   	    	 
 
		 @GetMapping("/{id}")
		 public Avancement getAvancementById(@PathVariable int id)  {
	     return repository.findById(id).get() ;  }
		 
	 
	    @GetMapping("/avancementsCeMois")
	    public List<Avancement> getAvancementsCeMois(@RequestParam String dateString) throws ParseException {
	    	List<Avancement> liste = service.getAvancementCeMois(dateString);
	    	List<Avancement> finale = new ArrayList<Avancement>();
	    	for(Avancement av : liste)
	    		finale.add(av) ; 
	        return finale ;   }
	  
	    @GetMapping("/nbrAvCeMois")
	    public int getNbrAv(@RequestParam String dateString) throws ParseException {
	    	
	        return service.nombreAvancemenentCeMois(dateString) ;  }
	    
	    
	    @GetMapping("/personnel/{mle}")
	    public List<Avancement> getAvancementsByPersonnel(@PathVariable String mle) {
	        return repository.findAvancementsByPersonnelMle(mle);}
	   
	    // fonctionne sur date d'effet  avancement (Max date d'effet) 
	    @GetMapping("/lastAvancement2/{mle}")
	    public Avancement getDerniererAvancementsByPersonnel2(@PathVariable String mle) {
	        return service.derniereAvancementPersonnel2(mle);}
	    
	    @GetMapping("/avancementsRecentsPourChaquePersonnel")
	    public List<Avancement> getLatestAvancementsForEachPersonnel() throws ParseException {
	        return service.lesDernieresAvancementPersonnels(); }
	   
	    @GetMapping("/nbrAvRecent")
	    public int getNbrLatestAvancementsForEachPersonnel() throws ParseException {
	        return service.lesDernieresAvancementPersonnels().size(); }
	   
	    
	    
	    @GetMapping("/anomalie")
	    public List<Avancement> getRecentAvancementsWithProchainAvancementBeforeCurrentDate() throws ParseException {
	        return service.getAnomalieAvancemets();}
	    
	
	    @GetMapping("/nbrAnomalie")
	    public int getNombreRecentAvancementsWithProchainAvancementBeforeCurrentDate() throws ParseException {
	        return service.getAnomalieAvancemets().size();}
	    
	    
	    
}
