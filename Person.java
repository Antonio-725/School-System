/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class Person {
    public int id;
    public String name;
    public int age;
    public float height;
    public Person(int id,String nm,int age,float ht){
        this.id=id;
        this.name=nm;
        this.height=ht;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String nm){
       
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
       
    }
    public float getHt(){
        return height;
    }
    public void setHt(float ht){
        
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        
    }
    class Student extends Person{
        public String department;
    
        public Student(int id, String nm, int age, float ht,String dep) {
            
            super(id, nm, age, ht);
            department=dep;
        }
        public void setDep(String dep){
            
        }
        public String getDep(){
            return department;
        }
    
        
    }
    public static void main(String args[]){
        
        Person ps =new Person(8133,"Antonio Santos",21,1);
      
        
        ps.getAge();
        System.out.println("Name is:"+ps.getName());
        System.out.println("ID is:"+ps.getID());
        System.out.println("Height is:"+ps.getHt());
        System.out.println("Age is:"+ps.getAge());
        
        ps.getHt();
        ps.getID();
        ps.getName();
        
    }
    
     
    
}
