/**
 * 
 */
package imo.com.resource.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
public interface IUserPhysiqueApi {

	/**
	 * Creation compte utilisateur
	 * @param responseEntity
	 */
	public ResponseEntity<ImoResponse<UserPhysiqueDto>> creationCompte(@RequestBody UserPhysiqueDto userPhysiqueDto);
}
