/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gulinigeer
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
    
    this.history = new ArrayList<Employee>();
            
           
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public void addNewVitals(Employee employee){
        history.add(employee);
    }
    
    public void deleteVitals(Employee e){
    
          history.remove(e);
          
    }
    
    public void updateEmployee(int index, Employee employee){
        history.set(index, employee);
    }
    
    
}
