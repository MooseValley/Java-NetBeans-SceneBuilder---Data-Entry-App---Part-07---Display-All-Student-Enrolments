/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

/**
 *
 * @author MichaelO
 */
public class Course 
{
    private String code; // COIT111134
    private String name; // Object Oriented Programming
    
    public Course()
    {
        this ("", ""); // Call Parameterised Constructor
    }
    
    public Course(String code, String name)
    {
        this.code = code;
        this.name = name;
    }
    
    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }


    public void setCode(String code)
    {
       this.code = code;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }

    
    @Override
    public String toString()
    {
        return  String.format ("%-10s", code)  + 
                String.format ("%-20s", name);
    }
    
}
