/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;
import java.io.*;
/**
 *
 * @author nour
 */

public class Principle extends Account{
    
    private static Principle principle;
    private File accounts = new File("accounts.txt");


    public static Principle getInstance(){
        if(principle == null){
            principle = new Principle("princ","123","p");
        }
        return principle;
    }

    public Principle(String username, String password, String type) {
        super(username, password, type);
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void AddTeacher(String username,String password,String name,String subject,float salary) throws IOException{
        Teacher NewTeacher = new Teacher(name,subject,salary,username,password,"t");
        //add to arr of teachers
        FileWriter myWriter = new FileWriter(accounts,true);
        myWriter.write(username+"#"+password+"#"+"t"+"\n");
        myWriter.close();
        
        File data = new File("teacher.txt");
        myWriter = new FileWriter(data);
        myWriter.write(username+"#"
                +password+"#"
                +name+"#"
                +subject+"#"
                +salary+"\n");
        myWriter.close();
        
    }
    
    public void EditTeacher(){
        
    }
        
    public void DeleteTeacher(){
        
    }
    
    public void ViewTeachers(){
        
    }
    
    public void CreateStudent(String username,String password,String name,int grade) throws IOException{
        Student NewStud = new Student(name, grade,  username,  password, "s");
        //add to arr of students
        FileWriter myWriter = new FileWriter(accounts,true);
        myWriter.write(username+"#"+password+"#"+"s"+"\n");
        myWriter.close();
        File data = new File("student.txt");
        myWriter = new FileWriter(data);
        myWriter.write(username+"#"
                +password+"#"
                +name+"#"
                +grade+"\n");
        myWriter.close();
        
    }
    
    public void ViewStudents(){
        
    }
    
    public void PrepTimeTable(){
        
    }
    
    public void GetExamInfo(){
        
    }    
}
