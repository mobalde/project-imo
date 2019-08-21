/**
 * 
 */
package imo.com.model.utilisateur;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import imo.com.model.adresse.Adresse;
import imo.com.model.promoteur.RepresentantLegal;
import imo.com.model.promoteur.TypePromoteurEnum;

/**
 * Entity entreprise ou promotteur
 * @author mbalde
 *
 */
@Entity
@Table(name="user_moral")
@PrimaryKeyJoinColumn(name = "id")
public class UserMoralEntity extends User implements Serializable{

	/** Serial ID */
	private static final long serialVersionUID = -2506000331138240803L;

	/** Adresse */
	@Embedded
	private Adresse adresse;

	/** carte d'identité entreprise */
	@Column(name = "kbis")
	private String kbis;

	/** nom de l'entreprise */
	@Column(name = "raison_social")
	private String raisonSocial;

	/** representant legal */
	@Embedded
	private RepresentantLegal representantLegal;

	/** le numero d'identification */
	private String siret;

	/** Type promoteur */
	@Enumerated(EnumType.STRING)
	@Column(name="type_promoteur", nullable = false)
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
