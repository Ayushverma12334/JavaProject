package SignUp;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Signup_1 {

    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for name input
        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        // Prompt user for email address input
        System.out.println("Enter the Email Address:");
        String email = sc.nextLine();

        // Prompt user for password input
        System.out.println("Enter the Password:");
        String password = sc.nextLine();

        // Creating a SignUp_page object and set its properties
        SignUp_page sp = new SignUp_page();
        sp.setName(name);
        sp.setEmailaddress(email);
        sp.setPassword(password);

        // Configure Hibernate using the hibernate.cfg1.xml configuration file
        Configuration con = new Configuration();
        con.configure("hibernate.cfg1.xml"); 
        try {
            // Create a Hibernate SessionFactory and Session
            SessionFactory factory = con.buildSessionFactory();
            Session session = factory.openSession();

            // Persist the SignUp_page object to the database
            session.persist(sp);
            
            // Begin a database transaction
            Transaction tx = session.beginTransaction();

            // Commit the transaction to save data permanently in the database
            tx.commit();

            // Close the Hibernate resources
            session.close();
            factory.close();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately, such as logging or user feedback
        }
    }
}
