/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class ReportSystemImpl implements ReportSystem{
    //chane paths
    String drPath = "\"C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\doctor.txt\"";
    String admPath = "\"C:\\Users\\MyPC\\Documents\\NetBeansProjects\\appointmentsystem\\src\\appointmentsystem\\admin.txt\"";
public static ArrayList<Admin> all_admin = new ArrayList<>();
    public static ArrayList<Patient> all_patient = new ArrayList<>();
    public static ArrayList<Doctor> all_doctor = new ArrayList<>();
    public static ArrayList<User> all_user = new ArrayList<>();
    
    public Scanner getScanner(String path) throws FileNotFoundException{
        Scanner file  = new Scanner(new File("path"));
        return file;
    }
    // load and scan files
            @Override
    public void displayReport() {
       // view report depends on role
        if(MainSystem.login_user.getRole().equals("doctor")){ 
            FileReader fr = null;    
            try {
                fr = new FileReader(drPath);
                int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();  
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ReportSystemImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ReportSystemImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
      
        }
        else if(MainSystem.login_user.getRole().equals("admin")){ 
            FileReader fr = null;    
            try {
                fr = new FileReader(admPath);
                int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();  
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ReportSystemImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ReportSystemImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public void editReport() {
        // view report depends on role
        if(MainSystem.login_user.getRole().equals("doctor")){ 
            
        }
        else if(MainSystem.login_user.getRole().equals("admin")){ 
            
        }
    }
    
}
