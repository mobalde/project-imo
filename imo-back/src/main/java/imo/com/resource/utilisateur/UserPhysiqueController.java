package imo.com.resource.utilisateur;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import imo.com.logic.utilisateur.physique.IUserPhysique;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.resource.api.IUserPhysiqueApi;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
@Controller
public class UserPhysiqueController implements IUserPhysiqueApi {

	/** response à retourner au front */
	private ImoResponse<UserPhysiqueDto> imoResponse;

	/** interface userPhysique */
	@Inject
	private IUserPhysique iuserPhysque;

	@Override
	public ResponseEntity<ImoResponse<UserPhysiqueDto>> creationCompte(UserPhysiqueDto userPhysiqueDto) {

		this.imoResponse = this.iuserPhysque.registration(userPhysiqueDto);
		return new ResponseEntity<>(this.imoResponse, HttpStatus.valueOf(this.imoResponse.getStatut()));
	}

}
