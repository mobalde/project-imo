/**
 * 
 */
package imo.com.logic;

/**
 * 
 * @author mbalde
 *
 * @param <D>
 *            dto
 * @param <E>
 *            entity
 */
public interface IGeneriqueMapper<D, E> {

    /**
     * convertit entity en dto
     * 
     * @param in
     *           entity
     * @return dto
     */
    D asObjectDto(E in);

    /**
     * convertit dto en entity
     * 
     * @param in
     *           dto
     * @return entity
     */
    E asObjectEntity(D in);

}
