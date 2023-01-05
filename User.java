/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joji
 */
class User {
    private int student_id,COSC_223,COSC_224,COSC_270,COSC_250,PHYS_342;
    private String Name;
    public User(int COSC_223,int COSC_224,int COSC_270,int COSC_250,int PHYS_342){
        //this.student_id=student_id;
        this.COSC_223=COSC_223;
        this.COSC_224=COSC_224;
        this.COSC_250=COSC_250;
        this.COSC_270=COSC_270;
        this.PHYS_342=PHYS_342;
        //this.Name=Name;
        
        
    }

 
    public int getStudentId(){
        return student_id;
    }
    public int getcosc223(){
        return COSC_223;
    }
    public int getcosc224(){
        return COSC_224;
    }
    public int getcosc270(){
        return COSC_270;
    }
    public int getcosc250(){
        return COSC_250;
    }
    public int getphys342(){
        return PHYS_342;
    }
    public String getName(){
        return Name;
    }
    
    
}
