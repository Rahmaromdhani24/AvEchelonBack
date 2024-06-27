package com.rahma.AvEchelon.Entity;

import jakarta.persistence.*;


/**
 * The persistent class for the t_salaire database table.
 * 
 */
@Entity
@Table(name="t_salaire")
public class Salaire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    
	@Lob
	private String cat;
	
	@Column(name="s_cat")
	@Lob
	private String sCat;
	
	@Lob
	private String inddiff1;
	
	@Lob
	private String inddiff10;

	@Lob
    private String inddiff11;

	@Lob
    private String inddiff12;

	@Lob
    private String inddiff13;

	@Lob
    private String inddiff14;

	@Lob
    private String inddiff15;

	@Lob
    private String inddiff16;

	@Lob
    private String inddiff17;

	@Lob
    private String inddiff18;

	@Lob
    private String inddiff19;

	@Lob
    private String inddiff2;

	@Lob
    private String inddiff20;

	@Lob
    private String inddiff21;

	@Lob
    private String inddiff22;

	@Lob
    private String inddiff23;

	@Lob
    private String inddiff24;

	@Lob
    private String inddiff25;

	@Lob
    private String inddiff26;

	@Lob
    private String inddiff27;

	@Lob
    private String inddiff28;

	@Lob
    private String inddiff29;

	@Lob
    private String inddiff3;

	@Lob
    private String inddiff30;

	@Lob
    private String inddiff31;

	@Lob
    private String inddiff32;

	@Lob
    private String inddiff33;

	@Lob
    private String inddiff34;

	@Lob
    private String inddiff35;

	@Lob
    private String inddiff36;

	@Lob
    private String inddiff37;

	@Lob
    private String inddiff38;

	@Lob
    private String inddiff39;

	@Lob
    private String inddiff4;

	@Lob
    private String inddiff40;

	@Lob
    private String inddiff5;

	@Lob
    private String inddiff6;

	@Lob
    private String inddiff7;

	@Lob
    private String inddiff8;

	@Lob
    private String inddiff9;

	@Lob
	private String th1;

	@Lob
	private String th2;
	
	@Lob
	private String th3;
	
	@Lob
	private String th4;
	
	@Lob
	private String th5;

	@Lob
	private String th6;

	@Lob
	private String th7;

	@Lob
	private String th8;

	@Lob
	private String th9;
	
	@Lob
	private String th10;

	@Lob
	private String th11;

	@Lob
	private String th12;

	@Lob
	private String th13;

	@Lob
	private String th14;

	@Lob
	private String th15;

	@Lob
	private String th16;

	@Lob
	private String th17;

	@Lob
	private String th18;

	@Lob
	private String th19;

	@Lob
	private String th20;

	@Lob
	private String th21;

	@Lob
	private String th22;

	@Lob
	private String th23;

	@Lob
	private String th24;

	@Lob
	private String th25;

	@Lob
	private String th26;

	@Lob
	private String th27;

	@Lob
	private String th28;

	@Lob
	private String th29;

	@Lob
	private String th30;

	@Lob
	private String th31;

	@Lob
	private String th32;

	@Lob
	private String th33;

	@Lob
	private String th34;

	@Lob
	private String th35;

	@Lob
	private String th36;

	@Lob
	private String th37;

	@Lob
	private String th38;

	@Lob
	private String th39;

	@Lob
	private String th40;

	

	public Salaire() {
	}

	//bi-directional many-to-one association to Avancement
	/*@OneToMany(mappedBy="TSalaire", cascade = CascadeType.ALL , orphanRemoval = true , fetch=FetchType.LAZY)
	private List<Avancement> TAvancements;
*/
		
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getInddiff1() {
		return this.inddiff1;
	}

	public void setInddiff1(String inddiff1) {
		this.inddiff1 = inddiff1;
	}

	public String getInddiff10() {
		return this.inddiff10;
	}

	public void setInddiff10(String inddiff10) {
		this.inddiff10 = inddiff10;
	}

	public String getInddiff11() {
		return this.inddiff11;
	}

	public void setInddiff11(String inddiff11) {
		this.inddiff11 = inddiff11;
	}

	public String getInddiff12() {
		return this.inddiff12;
	}

	public void setInddiff12(String inddiff12) {
		this.inddiff12 = inddiff12;
	}

	public String getInddiff13() {
		return this.inddiff13;
	}

	public void setInddiff13(String inddiff13) {
		this.inddiff13 = inddiff13;
	}

	public String getInddiff14() {
		return this.inddiff14;
	}

	public void setInddiff14(String inddiff14) {
		this.inddiff14 = inddiff14;
	}

	public String getInddiff15() {
		return this.inddiff15;
	}

	public void setInddiff15(String inddiff15) {
		this.inddiff15 = inddiff15;
	}

	public String getInddiff16() {
		return this.inddiff16;
	}

	public void setInddiff16(String inddiff16) {
		this.inddiff16 = inddiff16;
	}

	public String getInddiff17() {
		return this.inddiff17;
	}

	public void setInddiff17(String inddiff17) {
		this.inddiff17 = inddiff17;
	}

	public String getInddiff18() {
		return this.inddiff18;
	}

	public void setInddiff18(String inddiff18) {
		this.inddiff18 = inddiff18;
	}

	public String getInddiff19() {
		return this.inddiff19;
	}

	public void setInddiff19(String inddiff19) {
		this.inddiff19 = inddiff19;
	}

	public String getInddiff2() {
		return this.inddiff2;
	}

	public void setInddiff2(String inddiff2) {
		this.inddiff2 = inddiff2;
	}

	public String getInddiff20() {
		return this.inddiff20;
	}

	public void setInddiff20(String inddiff20) {
		this.inddiff20 = inddiff20;
	}

	public String getInddiff21() {
		return this.inddiff21;
	}

	public void setInddiff21(String inddiff21) {
		this.inddiff21 = inddiff21;
	}

	public String getInddiff22() {
		return this.inddiff22;
	}

	public void setInddiff22(String inddiff22) {
		this.inddiff22 = inddiff22;
	}

	public String getInddiff23() {
		return this.inddiff23;
	}

	public void setInddiff23(String inddiff23) {
		this.inddiff23 = inddiff23;
	}

	public String getInddiff24() {
		return this.inddiff24;
	}

	public void setInddiff24(String inddiff24) {
		this.inddiff24 = inddiff24;
	}

	public String getInddiff25() {
		return this.inddiff25;
	}

	public void setInddiff25(String inddiff25) {
		this.inddiff25 = inddiff25;
	}

	public String getInddiff26() {
		return this.inddiff26;
	}

	public void setInddiff26(String inddiff26) {
		this.inddiff26 = inddiff26;
	}

	public String getInddiff27() {
		return this.inddiff27;
	}

	public void setInddiff27(String inddiff27) {
		this.inddiff27 = inddiff27;
	}

	public String getInddiff28() {
		return this.inddiff28;
	}

	public void setInddiff28(String inddiff28) {
		this.inddiff28 = inddiff28;
	}

	public String getInddiff29() {
		return this.inddiff29;
	}

	public void setInddiff29(String inddiff29) {
		this.inddiff29 = inddiff29;
	}

	public String getInddiff3() {
		return this.inddiff3;
	}

	public void setInddiff3(String inddiff3) {
		this.inddiff3 = inddiff3;
	}

	public String getInddiff30() {
		return this.inddiff30;
	}

	public void setInddiff30(String inddiff30) {
		this.inddiff30 = inddiff30;
	}

	public String getInddiff31() {
		return this.inddiff31;
	}

	public void setInddiff31(String inddiff31) {
		this.inddiff31 = inddiff31;
	}

	public String getInddiff32() {
		return this.inddiff32;
	}

	public void setInddiff32(String inddiff32) {
		this.inddiff32 = inddiff32;
	}

	public String getInddiff33() {
		return this.inddiff33;
	}

	public void setInddiff33(String inddiff33) {
		this.inddiff33 = inddiff33;
	}

	public String getInddiff34() {
		return this.inddiff34;
	}

	public void setInddiff34(String inddiff34) {
		this.inddiff34 = inddiff34;
	}

	public String getInddiff35() {
		return this.inddiff35;
	}

	public void setInddiff35(String inddiff35) {
		this.inddiff35 = inddiff35;
	}

	public String getInddiff36() {
		return this.inddiff36;
	}

	public void setInddiff36(String inddiff36) {
		this.inddiff36 = inddiff36;
	}

	public String getInddiff37() {
		return this.inddiff37;
	}

	public void setInddiff37(String inddiff37) {
		this.inddiff37 = inddiff37;
	}

	public String getInddiff38() {
		return this.inddiff38;
	}

	public void setInddiff38(String inddiff38) {
		this.inddiff38 = inddiff38;
	}

	public String getInddiff39() {
		return this.inddiff39;
	}

	public void setInddiff39(String inddiff39) {
		this.inddiff39 = inddiff39;
	}

	public String getInddiff4() {
		return this.inddiff4;
	}

	public void setInddiff4(String inddiff4) {
		this.inddiff4 = inddiff4;
	}

	public String getInddiff40() {
		return this.inddiff40;
	}

	public void setInddiff40(String inddiff40) {
		this.inddiff40 = inddiff40;
	}

	public String getInddiff5() {
		return this.inddiff5;
	}

	public void setInddiff5(String inddiff5) {
		this.inddiff5 = inddiff5;
	}

	public String getInddiff6() {
		return this.inddiff6;
	}

	public void setInddiff6(String inddiff6) {
		this.inddiff6 = inddiff6;
	}

	public String getInddiff7() {
		return this.inddiff7;
	}

	public void setInddiff7(String inddiff7) {
		this.inddiff7 = inddiff7;
	}

	public String getInddiff8() {
		return this.inddiff8;
	}

	public void setInddiff8(String inddiff8) {
		this.inddiff8 = inddiff8;
	}

	public String getInddiff9() {
		return this.inddiff9;
	}

	public void setInddiff9(String inddiff9) {
		this.inddiff9 = inddiff9;
	}

	public String getSCat() {
		return this.sCat;
	}

	public void setSCat(String sCat) {
		this.sCat = sCat;
	}

	public String getTh1() {
		return this.th1;
	}

	public void setTh1(String th1) {
		this.th1 = th1;
	}

	public String getTh10() {
		return this.th10;
	}

	public void setTh10(String th10) {
		this.th10 = th10;
	}

	public String getTh11() {
		return this.th11;
	}

	public void setTh11(String th11) {
		this.th11 = th11;
	}

	public String getTh12() {
		return this.th12;
	}

	public void setTh12(String th12) {
		this.th12 = th12;
	}

	public String getTh13() {
		return this.th13;
	}

	public void setTh13(String th13) {
		this.th13 = th13;
	}

	public String getTh14() {
		return this.th14;
	}

	public void setTh14(String th14) {
		this.th14 = th14;
	}

	public String getTh15() {
		return this.th15;
	}

	public void setTh15(String th15) {
		this.th15 = th15;
	}

	public String getTh16() {
		return this.th16;
	}

	public void setTh16(String th16) {
		this.th16 = th16;
	}

	public String getTh17() {
		return this.th17;
	}

	public void setTh17(String th17) {
		this.th17 = th17;
	}

	public String getTh18() {
		return this.th18;
	}

	public void setTh18(String th18) {
		this.th18 = th18;
	}

	public String getTh19() {
		return this.th19;
	}

	public void setTh19(String th19) {
		this.th19 = th19;
	}

	public String getTh2() {
		return this.th2;
	}

	public void setTh2(String th2) {
		this.th2 = th2;
	}

	public String getTh20() {
		return this.th20;
	}

	public void setTh20(String th20) {
		this.th20 = th20;
	}

	public String getTh21() {
		return this.th21;
	}

	public void setTh21(String th21) {
		this.th21 = th21;
	}

	public String getTh22() {
		return this.th22;
	}

	public void setTh22(String th22) {
		this.th22 = th22;
	}

	public String getTh23() {
		return this.th23;
	}

	public void setTh23(String th23) {
		this.th23 = th23;
	}

	public String getTh24() {
		return this.th24;
	}

	public void setTh24(String th24) {
		this.th24 = th24;
	}

	public String getTh25() {
		return this.th25;
	}

	public void setTh25(String th25) {
		this.th25 = th25;
	}

	public String getTh26() {
		return this.th26;
	}

	public void setTh26(String th26) {
		this.th26 = th26;
	}

	public String getTh27() {
		return this.th27;
	}

	public void setTh27(String th27) {
		this.th27 = th27;
	}

	public String getTh28() {
		return this.th28;
	}

	public void setTh28(String th28) {
		this.th28 = th28;
	}

	public String getTh29() {
		return this.th29;
	}

	public void setTh29(String th29) {
		this.th29 = th29;
	}

	public String getTh3() {
		return this.th3;
	}

	public void setTh3(String th3) {
		this.th3 = th3;
	}

	public String getTh30() {
		return this.th30;
	}

	public void setTh30(String th30) {
		this.th30 = th30;
	}

	public String getTh31() {
		return this.th31;
	}

	public void setTh31(String th31) {
		this.th31 = th31;
	}

	public String getTh32() {
		return this.th32;
	}

	public void setTh32(String th32) {
		this.th32 = th32;
	}

	public String getTh33() {
		return this.th33;
	}

	public void setTh33(String th33) {
		this.th33 = th33;
	}

	public String getTh34() {
		return this.th34;
	}

	public void setTh34(String th34) {
		this.th34 = th34;
	}

	public String getTh35() {
		return this.th35;
	}

	public void setTh35(String th35) {
		this.th35 = th35;
	}

	public String getTh36() {
		return this.th36;
	}

	public void setTh36(String th36) {
		this.th36 = th36;
	}

	public String getTh37() {
		return this.th37;
	}

	public void setTh37(String th37) {
		this.th37 = th37;
	}

	public String getTh38() {
		return this.th38;
	}

	public void setTh38(String th38) {
		this.th38 = th38;
	}

	public String getTh39() {
		return this.th39;
	}

	public void setTh39(String th39) {
		this.th39 = th39;
	}

	public String getTh4() {
		return this.th4;
	}

	public void setTh4(String th4) {
		this.th4 = th4;
	}

	public String getTh40() {
		return this.th40;
	}

	public void setTh40(String th40) {
		this.th40 = th40;
	}

	public String getTh5() {
		return this.th5;
	}

	public void setTh5(String th5) {
		this.th5 = th5;
	}

	public String getTh6() {
		return this.th6;
	}

	public void setTh6(String th6) {
		this.th6 = th6;
	}

	public String getTh7() {
		return this.th7;
	}

	public void setTh7(String th7) {
		this.th7 = th7;
	}

	public String getTh8() {
		return this.th8;
	}

	public void setTh8(String th8) {
		this.th8 = th8;
	}

	public String getTh9() {
		return this.th9;
	}

	public void setTh9(String th9) {
		this.th9 = th9;
	}

}