/**
 * 
 */
package imo.com.logic.utilisateur.physique.dto;

import imo.com.model.adresse.Adresse;
import imo.com.model.promoteur.RepresentantLegal;
import imo.com.model.utilisateur.SexeEnum;

/**
 * @author mbalde
 *
 */
public class UserPhysiqueDto {

	/** adresse */
	private Adresse adresse;

	/** representant legal */
	private RepresentantLegal representantLegal;

	/** sexe */
	private SexeEnum sex;

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * @return the representantLegal
	 */
	public RepresentantLegal getRepresentantLegal() {
		return representantLegal;
	}
	/**
	 * @return the sex
	 */
	public SexeEnum getSex() {
		return sex;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/**
	 * @param representantLegal the representantLegal to set
	 */
	public void setRepresentantLegal(RepresentantLegal representantLegal) {
		this.representantLegal = representantLegal;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(SexeEnum sex) {
		this.sex = sex;
	}
}
