package Requestblood;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RequestBlood_1
{
	public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Email Address:");
        String email = sc.nextLine();

        System.out.println("Enter the Blood Group:");
        String bloodgroup = sc.nextLine();
        
        System.out.println("Enter the city you live :");
        String city =sc.nextLine();
        
        // Creating a SignUp_page object and set its properties
        RequestBlood_page rb = new RequestBlood_page();
        rb.setName(name);
        rb.setEmailaddress(email);
        rb.setBloodgroup(bloodgroup);
        rb.setCity(city);

        // Configure Hibernate using the hibernate.cfg1.xml configuration file
        Configuration con = new Configuration();
        con.configure("hibernate.cfg1.xml"); 
        try {
            // Create a Hibernate SessionFactory and Session
            SessionFactory factory = con.buildSessionFactory();
            Session session = factory.openSession();

            // Persist the SignUp_page object to the database
            session.persist(rb);
            
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
