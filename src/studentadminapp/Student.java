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
public class Student 
{
    private static int lastUsedStudId = 1000;
    
    private int studId;
    private String name;
    private String phone;
    private String email;
    
    public Student()
    {
        this ("", "", ""); // Call Parameterised Constructor
    }
    
    public Student(String name, String phone, String email)
    {
        studId = lastUsedStudId;
        lastUsedStudId++;
        this.name = name;
        this.phone = phone;
        this.email = email;
       
    }
    
    
    public int getStudId()
    {
        return studId;
    }
    
    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }

    public void setPhone(String phone)
    {
       this.phone = phone;
    }

    public void setEmail(String email)
    {
       this.email = email;
    }
    
    @Override
    public String toString()
    {
        return  String.format ("%8d", studId)  + "  " +
                String.format ("%-20s", name)  +
                String.format ("%-20s", phone) +
                String.format ("%-20s", email);
    }

}
