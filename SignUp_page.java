package SignUp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Singup")
public class SignUp_page 
{
	@Id //PRIMARY KEY unique
	@Column(name="Name")
	private String name;
	
	@Column(name="Email Address")
	private String emailaddress;

	@Column(name="Password")
	private String password ;
	

	@Override
	public String toString() {
		return "SignUp_page [name=" + name + ", emailaddress=" + emailaddress + ", password=" + password + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
