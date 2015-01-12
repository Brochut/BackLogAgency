package fr.uds.backlog.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BacklogEntity", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class BackLogEntity {
	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    private String name;
	
	@NotNull
	private Date creationDate;
	
	@NotNull
	@Size(min = 0, max = 10)
	private int priority;
	
	
	private int estimation;
	

	private String description;
	
	@OneToMany
	private List<Comment> comments;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}


	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}


	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}


	/**
	 * @return the estimation
	 */
	public int getEstimation() {
		return estimation;
	}


	/**
	 * @param estimation the estimation to set
	 */
	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the comment
	 */
	public List<Comment> getComment() {
		return comments;
	}


	/**
	 * @param comment the comment to set
	 */
	public void setComment(List<Comment> comments) {
		this.comments = comments;
	}
	
	@PrePersist
	void createdAt() {
	    this.creationDate = new Date();
	}

}
