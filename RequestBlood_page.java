package Requestblood;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RequestBlood")
public class RequestBlood_page
{

	@Id //PRIMARY KEY unique
	@Column(name="Name")
	private String name;
	
	@Column(name="Email Address")
	private String emailaddress;
	
	@Column(name="Blood Group")
	private String bloodgroup;
	
	@Column(name="City")
	private String city;

	@Override
	public String toString() {
		return "RequestBlood_page [name=" + name + ", emailaddress=" + emailaddress + ", bloodgroup=" + bloodgroup
				+ ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
