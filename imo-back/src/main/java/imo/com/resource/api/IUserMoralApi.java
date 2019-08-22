/**
 * 
 */
package imo.com.resource.api;

import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import imo.com.logic.utilisateur.moral.dto.UserMoralDto;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
public interface IUserMoralApi {

	/**
	 * @param userMoralDto
	 * @return responseEntity
	 */
	@PostMapping(path = "/inscription/promoteur", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<ImoResponse<UserMoralDto>> creationCompte(@RequestBody UserMoralDto userMoralDto);
}
