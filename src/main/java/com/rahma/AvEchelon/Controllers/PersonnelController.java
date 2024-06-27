package com.rahma.AvEchelon.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rahma.AvEchelon.Entity.Sanction;
import com.rahma.AvEchelon.Services.Personnel.MesPersonnels;
import com.rahma.AvEchelon.Services.Personnel.ServicePersonnel;
import java.text.ParseException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

    @Autowired private ServicePersonnel service;

   
    @GetMapping("/all")
    public List<MesPersonnels> getAllPersonnel() throws ParseException {
        return service.getMesPersonnels(); }
   
    @GetMapping("/nbr")
    public int getNombre() throws ParseException {
        return service.getMesPersonnels().size(); } 
    
    @GetMapping("/{mle}")
    public MesPersonnels getPersonnelByMle(@PathVariable String mle) throws ParseException {
        return service.recuperePersonnelParMle(mle) ;}
    
    @GetMapping("/sanctions/{mle}")
    public List<Sanction> getSanctionsPersonnel(@PathVariable String mle) {
        return service.recupererSanctionsPersonnel18Mois(mle) ;}
    
}
