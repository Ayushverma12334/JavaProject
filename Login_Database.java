package BloodBank_MangmentSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login_Database
{
	@Id //PRIMARY KEY unique
	@Column(name="Email Address")
	private String emailaddress;

	@Column(name="Password")
	private String password ;
	
	@Override
	public String toString() {
		return "Login_Database [emailaddress=" + emailaddress + ", password=" + password + "]";
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
