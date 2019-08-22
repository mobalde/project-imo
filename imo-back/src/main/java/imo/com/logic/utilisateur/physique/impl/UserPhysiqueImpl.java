/**
 * 
 */
package imo.com.logic.utilisateur.physique.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import imo.com.logic.utilisateur.physique.IUserPhysique;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
@Component
public class UserPhysiqueImpl implements IUserPhysique{

	@Override
	public ImoResponse<UserPhysiqueDto> registration(UserPhysiqueDto dto) {

		List<UserPhysiqueDto> results = new ArrayList<>();
		ImoResponse<UserPhysiqueDto> imoResponse = new ImoResponse<UserPhysiqueDto>();
		imoResponse.setStatut(HttpStatus.OK.value());
		imoResponse.setMessageResponse("TEST SERVICE");
		imoResponse.setResult(results);
		return imoResponse;
	}

}
