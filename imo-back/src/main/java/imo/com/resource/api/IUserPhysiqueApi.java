/**
 * 
 */
package imo.com.resource.api;

import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping(path = "/inscription/client", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<ImoResponse<UserPhysiqueDto>> creationCompte(@RequestBody UserPhysiqueDto userPhysiqueDto);
}
