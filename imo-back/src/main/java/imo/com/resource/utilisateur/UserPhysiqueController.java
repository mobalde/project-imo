package imo.com.resource.utilisateur;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import imo.com.logic.utilisateur.physique.IUserPhysique;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.resource.api.IUserPhysiqueApi;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
@Controller
@RequestMapping(path = "/immo")
public class UserPhysiqueController implements IUserPhysiqueApi {

	private ImoResponse<UserPhysiqueDto> imoResponse;

	@Inject
	private IUserPhysique iuserPhysque;

	@Override
	@PostMapping(path = "/inscription/client", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ImoResponse<UserPhysiqueDto>> creationCompte(UserPhysiqueDto userPhysiqueDto) {

		this.imoResponse = this.iuserPhysque.registration(userPhysiqueDto);
		return new ResponseEntity<ImoResponse<UserPhysiqueDto>>(this.imoResponse, HttpStatus.valueOf(this.imoResponse.getStatut()));
	}

}
