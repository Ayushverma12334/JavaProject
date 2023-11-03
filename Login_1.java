package BloodBank_MangmentSystem;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Login_1 {
    public static void main(String[] args) {
        // Create a Login_Database object to store login information
        Login_Database sp = new Login_Database();
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for email address input
        System.out.println("Enter the Email Address:");
        String ea = sc.nextLine();
        sp.setEmailaddress(ea);
        
        // Prompt user for password input
        System.out.println("Enter the Password:");
        String p = sc.nextLine();
        sp.setPassword(p);
        
        // Configure Hibernate using the hibernate.cfg1.xml configuration file
        Configuration con = new Configuration();
        con.configure("hibernate.cfg1.xml");
        
        try {
            // Create a Hibernate SessionFactory and Session
            SessionFactory factory = con.buildSessionFactory();
            Session session = factory.openSession();
            
            // Persist the Login_Database object to the database
            session.persist(sp);
            
            // Begin a database transaction
            Transaction tx = session.beginTransaction();
            
            // Commit the transaction to save data permanently in the database
            tx.commit();
            
            // Close the Hibernate resources
            factory.close();
            session.close();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately, such as logging or user feedback
        }
    }
}


