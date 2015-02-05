package seven.SecretAgents;

import java.io.File;
import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageAgents {
	private static SessionFactory factory; 
    public static void main(String[] args) {
    	try{
            factory = new Configuration().configure().buildSessionFactory();
         }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
         }
		  
    	  ManageAgents ME = new ManageAgents();
		  
	      //ME.addSomeAgents();
	      

	      /* List down all the employees */
	      ME.listAgents("varsta<50");
		 }
    
    public void addSomeAgents(){
    	  Address address = new Address("Bucuresti", "Romania");
	      addAddress(address);
	      Phone phone1=new Phone("0723319148", "Vodafone");
	      Phone phone2=new Phone("0743314444", "Orange");
	      HashSet<Phone> set1 = new HashSet<Phone>();
	      set1.add(phone1);
	      set1.add(phone2);
	      
	      Agent agent1 = new Agent("Vlad", address, "FBI", 30, set1);
	
	      /* Add employee records in the database */
	      Integer empID1 = addAgent(agent1);
    }
    
    
    /* Method to add an address record in the database */
    public Integer addAddress(Address address) {
       Session session = factory.openSession();
       Transaction tx = null;
       Integer addressID = null;
       try{
          tx = session.beginTransaction();
          addressID = (Integer) session.save(address); 
          tx.commit();
       }catch (HibernateException e) {
          if (tx!=null) tx.rollback();
          e.printStackTrace(); 
       }finally {
          session.close(); 
       }
       return addressID;
    }
    
    /* Method to add an employee record in the database */
    public Integer addAgent(Agent agent){
       Session session = factory.openSession();
       Transaction tx = null;
       Integer employeeID = null;
       try{
          tx = session.beginTransaction();
          employeeID = (Integer) session.save(agent); 
          tx.commit();
       }catch (HibernateException e) {
          if (tx!=null) tx.rollback();
          e.printStackTrace(); 
       }finally {
          session.close(); 
       }
       return employeeID;
    }
    
    /* Method to list all the employees detail */
    public void listAgents(String condition){
       Session session = factory.openSession();
       Transaction tx = null;
       try{
          tx = session.beginTransaction();
          String query = "FROM Agent ";
          if (condition != null)
        	  query = query + " where " + condition;
          List<Agent> employees = session.createQuery(query).list(); 
          for (Agent agent: employees){
             System.out.println(agent.toString());
          }
          tx.commit();
       }catch (HibernateException e) {
          if (tx!=null) tx.rollback();
          e.printStackTrace(); 
       }finally {
          session.close(); 
       }
    }
}
