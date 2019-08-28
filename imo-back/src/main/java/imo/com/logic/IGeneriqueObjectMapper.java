/**
 * 
 */
package imo.com.logic;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.model.utilisateur.UserPhysiqueEntity;

/**
 * @author mbalde
 *
 */
@Mapper(withCyclicMapping = true, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true,
withIoC = IoC.SPRING)
public interface IGeneriqueObjectMapper {

	/**
	 * 
	 * @param <D> dto
	 * @param <E> entity
	 * @param e entity
	 * @return dto
	 */
	UserPhysiqueDto asObjectDto(UserPhysiqueEntity e);

	/**
	 * 
	 * @param <E> entity
	 * @param <D> dto
	 * @param d dto
	 * @return entity
	 */
	UserPhysiqueEntity asObjectEntity(UserPhysiqueDto d);

}
