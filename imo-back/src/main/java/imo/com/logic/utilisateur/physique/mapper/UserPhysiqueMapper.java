package imo.com.logic.utilisateur.physique.mapper;

import fr.xebia.extras.selma.Mapper;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.model.utilisateur.UserPhysiqueEntity;

/**
 * Mapper for user physique
 * @author mbalde
 *
 */
@Mapper
public interface UserPhysiqueMapper {

    /**
     * convertit entity en dto
     * @param in userPhysiqueEntity
     * @return userPhysiqueDto
     */
    UserPhysiqueDto asUserPhysiqueDto(UserPhysiqueEntity in);

    /**
     * convertit dto en entity
     * @param in userPhysiqueDto
     * @return userPhysiqueEntity
     */
    UserPhysiqueEntity asUserPhysiqueEntity(UserPhysiqueDto in);

}
