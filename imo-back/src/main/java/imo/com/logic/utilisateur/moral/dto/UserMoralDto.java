/**
 * 
 */
package imo.com.logic.utilisateur.moral.dto;

import imo.com.model.adresse.Adresse;
import imo.com.model.promoteur.RepresentantLegal;
import imo.com.model.promoteur.TypePromoteurEnum;

/**
 * @author mbalde
 *
 */
public class UserMoralDto {

	/** adresse */
	private Adresse adresse;

	/** kbis */
	private String kbis;

	/** raison social */
	private String raisonSocial;

	/** representant legal */
	private RepresentantLegal representantLegal;

	/** siret */
	private String siret;

	/** type promoteur */
	private TypePromoteurEnum typePromoteur;

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @return the kbis
	 */
	public String getKbis() {
		return kbis;
	}

	/**
	 * @return the raisonSocial
	 */
	public String getRaisonSocial() {
		return raisonSocial;
	}

	/**
	 * @return the representantLegal
	 */
	public RepresentantLegal getRepresentantLegal() {
		return representantLegal;
	}

	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * @return the typePromoteur
	 */
	public TypePromoteurEnum getTypePromoteur() {
		return typePromoteur;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param kbis the kbis to set
	 */
	public void setKbis(String kbis) {
		this.kbis = kbis;
	}

	/**
	 * @param raisonSocial the raisonSocial to set
	 */
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	/**
	 * @param representantLegal the representantLegal to set
	 */
	public void setRepresentantLegal(RepresentantLegal representantLegal) {
		this.representantLegal = representantLegal;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}

	/**
	 * @param typePromoteur the typePromoteur to set
	 */
	public void setTypePromoteur(TypePromoteurEnum typePromoteur) {
		this.typePromoteur = typePromoteur;
	}
}
