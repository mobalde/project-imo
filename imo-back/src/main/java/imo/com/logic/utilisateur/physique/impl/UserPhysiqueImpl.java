/**
 * 
 */
package imo.com.logic.utilisateur.physique.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserPhysiqueMapper userPhysiqueMapper;

    @Inject
    private UserPhysiqueRepository userPhysiqueRepo;

    @Override
    public ImoResponse<UserPhysiqueDto> registration(UserPhysiqueDto dto) {

        List<UserPhysiqueDto> results = new ArrayList<>();
        ImoResponse<UserPhysiqueDto> imoResponse = new ImoResponse<>();
        if (CheckFieldsUser.checkObjectDto(dto, imoResponse)) {
            imoResponse.setStatut(HttpStatus.BAD_REQUEST.value());
            imoResponse.setMessageResponse(ConstantesUtils.MESSAGE_ERREUR_FORMULAIRE_INSCRIPTION);
            imoResponse.setResult(results);
        } else {
            // mapper dto en entity
            UserPhysiqueEntity entity = this.userPhysiqueMapper.asObjectEntity(dto);
            imoResponse.setStatut(HttpStatus.OK.value());
            imoResponse.setMessageResponse(ConstantesUtils.MESSAGE_INSCRIPTION_REUSSI);
            imoResponse.setResult(results);
        }
        return imoResponse;
    }

}
