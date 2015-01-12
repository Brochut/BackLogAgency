package fr.uds.backlog.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Agency
 *
 */
@Entity

public class Agency implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany
	private List<Member> members;
	@OneToMany
	private List<BackLogEntity> backlogs;
	private static final long serialVersionUID = 1L;

	public Agency() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}   
	public List<BackLogEntity> getBacklogs() {
		return this.backlogs;
	}

	public void setBacklogs(List<BackLogEntity> backlogs) {
		this.backlogs = backlogs;
	}
   
}
