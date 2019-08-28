/**
 * 
 */
package imo.com.logic.utilisateur.physique.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import imo.com.general.ConstantesUtils;
import imo.com.logic.utilisateur.CheckFieldsUser;
import imo.com.logic.utilisateur.physique.IUserPhysique;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.logic.utilisateur.physique.mapper.UserPhysiqueMapper;
import imo.com.logic.utilisateur.physique.repository.UserPhysiqueRepository;
import imo.com.model.utilisateur.UserPhysiqueEntity;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
@Component
public class UserPhysiqueImpl implements IUserPhysique {

	/** mapper userPhysique */
	@Inject
	private UserPhysiqueMapper userPhysiqueMapper;

	/** userPhysiqueRepo */
	@Inject
	private UserPhysiqueRepository userPhysiqueRepo;

	@Override
	public ImoResponse<UserPhysiqueDto> registration(UserPhysiqueDto dto){

		List<UserPhysiqueDto> results = new ArrayList<>();
		ImoResponse<UserPhysiqueDto> imoResponse = new ImoResponse<>();
		if (CheckFieldsUser.checkObjectDto(dto, imoResponse))
			this.setImoResponse(imoResponse, HttpStatus.BAD_REQUEST.value(), ConstantesUtils.MESSAGE_ERREUR_FORMULAIRE_INSCRIPTION, results);
		else {
			UserPhysiqueEntity entity = this.userPhysiqueMapper.asObjectEntity(dto);
			try {
				this.userPhysiqueRepo.save(entity);
				this.setImoResponse(imoResponse, HttpStatus.OK.value(), ConstantesUtils.MESSAGE_INSCRIPTION_REUSSI, results);
			} catch (Exception e) {
				this.setImoResponse(imoResponse, HttpStatus.INTERNAL_SERVER_ERROR.value(), ConstantesUtils.MESSAGE_REQUETE_BDD, results);
			}
		}
		return imoResponse;
	}

	/**
	 * Construit l'objet reponse
	 * @param imo
	 * @param status
	 * @param message
	 * @param list
	 */
	private void setImoResponse(ImoResponse<UserPhysiqueDto> imo, int status, String message, List<UserPhysiqueDto> list) {
		imo.setStatut(status);
		imo.setMessageResponse(message);
		imo.setResult(list);
	}

}
