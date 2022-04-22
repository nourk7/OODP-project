/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

/**
 *
 * @author nour
 */
public class Teacher extends Account{
    
    private String name;
    private String subject;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void AddExam() {
        
    }
    
    public void EditExam() {
        
    }
    
    public void DeleteExam() {
        
    }
    
    public void CheckStudGrades() {
        
    }
    
    public void IssueReport() {
        
    }
    
    public void Assignment() {
        
    }
    
    public void NotifyStud() {
        
    }
}
