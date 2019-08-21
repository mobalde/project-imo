/**
 * 
 */
package imo.com.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author mbalde
 *
 */
@MappedSuperclass
public abstract class AbstractEntity {

	@Column(name="create_at")
	private LocalDateTime create_at = LocalDateTime.now();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;

	@Column(name="modificationcounter")
	private int modificationcounter;

	@Column(name="update_at")
	private LocalDateTime update_at = LocalDateTime.now();

	/**
	 * @return the create_at
	 */
	public LocalDateTime getCreate_at() {
		return create_at;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the modificationcounter
	 */
	public int getModificationcounter() {
		return modificationcounter;
	}

	/**
	 * @return the update_at
	 */
	public LocalDateTime getUpdate_at() {
		return update_at;
	}

	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(LocalDateTime create_at) {
		this.create_at = create_at;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param modificationcounter the modificationcounter to set
	 */
	public void setModificationcounter(int modificationcounter) {
		this.modificationcounter = modificationcounter;
	}

	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(LocalDateTime update_at) {
		this.update_at = update_at;
	}

}
