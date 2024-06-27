package com.rahma.AvEchelon.Services.Avancement;

import java.text.ParseException;
import java.util.List;
import com.rahma.AvEchelon.Entity.Avancement;

public interface IServiceAvancement {
	
	public List<Avancement> getAllAvancementPersonnel(String mle) ; 
	public List<Avancement> getAvancementCeMois(String dateString) throws ParseException ; 
	public int nombreAvancemenentCeMois(String dateString) throws ParseException ; 
    public Avancement derniereAvancementPersonnel2 (String mle ); 	
    public List<Avancement> lesDernieresAvancementPersonnels ()throws ParseException; 
    public List<Avancement> getAnomalieAvancemets() throws ParseException; 
 
}
