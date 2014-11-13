package lakshmigowda.session.entities;

// Generated Nov 11, 2014 5:17:49 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Lakshmi. 
 * Emergencycontact entity.
 */
@Entity
@Table(name = "emergencycontact", catalog = "surveys")
public class Emergencycontact implements java.io.Serializable {

	private String id;
	private Survey survey;
	private String name;
	private String phone;
	private String email;
	private String address;

	public Emergencycontact() {
	}

	public Emergencycontact(String id) {
		this.id = id;
	}

	public Emergencycontact(String id, Survey survey, String name,
			String phone, String email, String address) {
		this.id = id;
		this.survey = survey;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 45)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "surveyid")
	public Survey getSurvey() {
		return this.survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", length = 45)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
