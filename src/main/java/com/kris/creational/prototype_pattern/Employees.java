package com.kris.creational.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Master(Original) object as a template, to create new object
 */
public class Employees implements Cloneable {

    private List<String> employeeList;

    public Employees(){
        employeeList = new ArrayList<>();
    }

    public Employees(List<String> list){
        employeeList = list;
    }

    public void loadData(){
        //read all employees from database and put into the list
        employeeList.add("Kris");
        employeeList.add("Katie");
        employeeList.add("David");
        employeeList.add("Lisa");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    /**
     * Prototype pattern could use java cloning to copy the object, however whether to use shallow or deep
     * copy of the Object properties depends on the requirements and its a design decision.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmployeeList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
