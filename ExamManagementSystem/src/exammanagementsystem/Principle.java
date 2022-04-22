/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

/**
 *
 * @author nour
 */
public class Principle extends Account{
    
    private static Principle principle;

    private Principle() {
        
    }
    
    public static Principle getInstance(){
        if(principle == null){
            principle = new Principle();
        }
        return principle;
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void AddTeacher(){
        
    }
    
    public void EditTeacher(){
        
    }
        
    public void DeleteTeacher(){
        
    }
    
    public void ViewTeachers(){
        
    }
    
    public void ViewStudents(){
        
    }
    
    public void PrepTimeTable(){
        
    }
    
    public void GetExamInfo(){
        
    }    
}
