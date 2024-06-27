package com.rahma.AvEchelon.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the t_avancement database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name="t_avancement")
public class Avancement  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Personnel
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JsonIgnore
	 @JoinColumn(name="Mle", referencedColumnName="mle")
	 @JsonBackReference
	 private Personnel TPersonnel ;
	 
	private String nom;
	
	private String qualification;

	private String cat;
	
	@Column(name="S_CAT")
	private String sCat;
	
	private String ech;

	private String sbase;
	
	private String th;

	@Column(name="IND_DIFF")
	private String indDiff;
	
	@Temporal(TemporalType.DATE)
	@Column(name="D_EFFET")
	private Date dEffet;

	@Temporal(TemporalType.DATE)
	@Column(name="D_P_AV")
	private Date dPAv;

	private String observation;
	public Avancement() {
	}
	  
	//bi-directional many-to-one association to Avancement	
	/*@ManyToOne
	@JoinColumn(name="tsalaire_id")
	private Salaire TSalaire ; */
	
	
	public int getId() {
		return this.id;
	}

	public String getCat() {
		return this.cat;
	}

	public String getEch() {
		return this.ech;
	}

	public String getIndDiff() {
		return this.indDiff;
	}


	public String getNom() {
		return this.nom;
	}

	public String getObservation() {
		return this.observation;
	}


	public String getQualification() {
		return this.qualification;
	}

	public String getSCat() {
		return this.sCat;
	}

	public String getSbase() {
		return this.sbase;
	}

	public String getTh() {
		return this.th;
	}

	public Date getDPAv() {
		return dPAv;
	}

	public Date getdEffet() {
		return dEffet;
	}

	public Personnel getTPersonnel() {
		return TPersonnel;
	}

}