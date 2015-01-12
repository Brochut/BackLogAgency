package fr.uds.backlog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	@Id
	@GeneratedValue
	private long id;
	private String content;
	private Date date;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}   
	public long getId() {
		return this.id;
	}
	
	@PrePersist
	void createdAt() {
	    this.date = new Date();
	}
	
	public void setId(long id) {
		this.id = id;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
