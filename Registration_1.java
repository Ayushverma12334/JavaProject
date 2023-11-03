package Registration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Registration_1
{
	public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Date:");
        String date = sc.nextLine();
        
        System.out.println("Enter Gender:");
        String gender = sc.nextLine();
        
        System.out.println("Enter the Email Address:");
        String email = sc.nextLine();

        System.out.println("Enter your Blood Group:");
        String bloodgroup = sc.nextLine();
        
        System.out.println("Enter your Phone Number :");
        long phoneno = sc.nextLong();
        
        System.out.println("Enter the city you live :");
        String city =sc.nextLine();
        
        // Creating a SignUp_page object and set its properties
        Registration_page  rp = new Registration_page ();
        rp.setName(name);
        rp.setDate(date);
        rp.setGender(gender);
        rp.setEmailaddress(email);
        rp.setBloodgroup(bloodgroup);
        rp.setPhoneno(phoneno);
        rp.setCity(city);

        // Configure Hibernate using the hibernate.cfg1.xml configuration file
        Configuration con = new Configuration();
        con.configure("hibernate.cfg1.xml"); 
        try {
            // Create a Hibernate SessionFactory and Session
            SessionFactory factory = con.buildSessionFactory();
            Session session = factory.openSession();

            // Persist the SignUp_page object to the database
            session.persist(rp);
            
            // Begin a database transaction
            Transaction tx = session.beginTransaction();

            // Commit the transaction to save data permanently in the database
            tx.commit();

            // Close the Hibernate resources
            session.close();
            factory.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace(); // Handle exceptions appropriately, such as logging or user feedback
        }
    }
}
