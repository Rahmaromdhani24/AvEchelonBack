package com.rahma.AvEchelon.Services.Personnel;

import java.text.ParseException;
import java.util.List;
import com.rahma.AvEchelon.Entity.Sanction;

public interface IServicePersonnel {
	
	public List<MesPersonnels> getMesPersonnels() throws ParseException ; 
	public MesPersonnels recuperePersonnelParMle(String mle) throws ParseException ; 
	public List<Sanction> recupererSanctionsPersonnel18Mois(String mle) ; 
	
}
