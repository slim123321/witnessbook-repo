package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: MarkBand
 *
 */
@Entity

public class MarkSong implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Float markCounter;

	public MarkSong() {
		super();
	}

	public MarkSong(Integer id, Float markCounter) {
		super();
		this.id = id;
		this.markCounter = markCounter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getMarkCounter() {
		return markCounter;
	}

	public void setMarkCounter(Float markCounter) {
		this.markCounter = markCounter;
	}

}
