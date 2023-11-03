package Registration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration_page 
{
	@Id //PRIMARY KEY unique
	@Column(name="Name")
	private String name;
	
	@Column(name="Date")
	private String Date;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Email Address")
	private String emailaddress;
	
	@Column(name="Blood Group")
	private String bloodgroup;
	
	@Column(name="Phone Number")
	private Long phoneno;
	
	@Column(name="City")
	private String city;

	@Override
	public String toString() 
	{
		return "Registration_page [name=" + name + ", Date=" + Date + ", gender=" + gender + ", emailaddress="
				+ emailaddress + ", bloodgroup=" + bloodgroup + ", phoneno=" + phoneno + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}