package appointmentsystem;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; 

public class MainSystem {
//    call login page and register page
    public static LoginPage login = new LoginPage(); 
    public static RegisterPage register = new RegisterPage();
    public static User login_user; 
    
    // create array to store different types of user
    public static ArrayList<Admin> all_admin = new ArrayList<>();
    public static ArrayList<Patient> all_patient = new ArrayList<>();
    public static ArrayList<Doctor> all_doctor = new ArrayList<>();
    public static ArrayList<User> all_user = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        // load and scan files
        Scanner adminFile  = new Scanner(new File("C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\admin.txt"));
        Scanner patientFile = new Scanner(new File("C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\patient.txt"));
        Scanner doctorFile = new Scanner(new File("C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\doctor.txt"));
        Scanner appointmentFile = new Scanner(new File("C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\appointment.txt"));
        PrintWriter pw = new PrintWriter("admin.txt");
        //admin.txt ,patient.txt,doctor.txt,appointment.txt
        if(!adminFile.hasNextLine()){
            Admin first_admin = new Admin(1, "Chia Jun", "admin", "chiajun@gmail.com", "12345", "0123483743");
            all_user.add(first_admin);
            all_admin.add(first_admin);
            
            pw.println(first_admin.getId());
            pw.println(first_admin.getName());
            pw.println(first_admin.getRole());
            pw.println(first_admin.getEmail());
            pw.println(first_admin.getPassword());
            pw.println(first_admin.getContact());
            
            pw.flush();
            pw.close(); 
        }
        
        // store all admin object into admin's arrayList
        while(adminFile.hasNextLine()){
            int id = 1;// Integer.parseInt(adminFile.nextLine());
            String name = "Chia Jun"; //adminFile.nextLine();
            String role ="admin";// adminFile.nextLine();
            String email = "chiajun@gmail.com";//adminFile.nextLine();
            String password = "12345";//adminFile.nextLine();
            String contact = "07827363673";//adminFile.nextLine();
           // adminFile.nextLine();
            
            Admin new_admin = new Admin(id, name, role, email, password, contact); 
            all_admin.add(new_admin);
            all_user.add(new_admin); 
        }
        
        // store all patient object into patient's arrayList
        while(patientFile.hasNextLine()){
            int id = 1;//Integer.parseInt(patientFile.nextLine());
            String name = "Kelvin Wong";//patientFile.nextLine();
            String role ="patient";// patientFile.nextLine();
            String email = "kelwong@gmail.com";//patientFile.nextLine(); 
            String contact ="098535636453";// patientFile.nextLine();
           // patientFile.nextLine();
            
            Patient new_patient = new Patient(id, name, role, email, contact);
            all_patient.add(new_patient);
            all_user.add(new_patient);
        }
        
        // store all doctor object into doctor's arrayList 
        while(doctorFile.hasNextLine()){
            int id = 1;// Integer.parseInt(doctorFile.nextLine());
            String name = "Michael Smith";//doctorFile.nextLine();
            String role = "doctor";//doctorFile.nextLine();
            String email ="msmith@gmail.com";// doctorFile.nextLine();
            String password ="12345";// doctorFile.nextLine();
            String contact = "012353646";//doctorFile.nextLine();
          //  doctorFile.nextLine();
            
            Doctor new_doctor = new Doctor(id, name, role, email, password, contact);
            all_doctor.add(new_doctor);
            all_user.add(new_doctor);
        } 
    }
}
