/**
 * 
 */
package imo.com.model.promoteur;

/**
 * @author mbalde
 *
 */
public enum TypePromoteurEnum {

	/** Entreprise */
	ENTREPRISE("Entreprise"), //
	/** Particulier */
	PARTICULIER("Particulier");

	/** Libelle enum */
	private String libelle;

	private TypePromoteurEnum(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * retourne le libelle
	 * @return libelle
	 */
	public String getLibelle() {
		return this.libelle;
	}
}
