/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joji
 */
public class User1 {
   private int reg_num;
   String first_name,last_name,course;
    public User1(int reg_num,String first_name,String last_name,String course){
        //this.student_id=student_id;
        this.reg_num=reg_num;
        this.first_name=first_name;
        this.last_name=last_name;
        this.course=course;
        //this.Name=Name;
        
        
    }

 
    public int getReg_numeber(){
        return reg_num;
    }
    public String getFirstname(){
        return first_name;
    }
    public String getLastname(){
        return last_name;
    }
    public String getCourse(){
        return course;
    }
    
}
