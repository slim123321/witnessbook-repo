package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Playlist
 *
 */
@Entity

public class Playlist implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Date creationDate;
	private Float mark;

	public Playlist() {
		super();
	}

	public Playlist(Integer id, String title, Date creationDate, Float mark) {
		super();
		this.id = id;
		this.title = title;
		this.creationDate = creationDate;
		this.mark = mark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Float getMark() {
		return mark;
	}

	public void setMark(Float mark) {
		this.mark = mark;
	}

}
