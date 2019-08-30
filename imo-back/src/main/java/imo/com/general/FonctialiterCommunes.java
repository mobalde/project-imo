/**
 * 
 */
package imo.com.general;

import java.util.List;

import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.response.ImoResponse;

/**
 * Cette classe gère les methodes communes du projet
 * @author mbalde
 *
 */
public abstract class FonctialiterCommunes {

	/**
	 * @param imo objet response
	 * @param status httpStatus
	 * @param message erreur
	 * @param list resultat
	 */
	public static void setImoResponse(ImoResponse<UserPhysiqueDto> imo, int status, String message, List<UserPhysiqueDto> list) {
		imo.setStatut(status);
		imo.setMessageResponse(message);
		imo.setResult(list);
	}

}
