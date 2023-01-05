
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class ArraySearch {
    public static int search(int array[],int key){
        for(int x=0;x<array.length;x++)
            if(array[x]==key)
                return x;
                return -1;
            
    }
    public static void main(String [] args){
        ArraySearch as=new ArraySearch();
        int [] array={70,65,34,96,45,57,46};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to search:");
        int key=sc.nextInt();
        int position=search(array,key);
        if(position==-1){
            System.out.println("number not found,"+(position+1));
            
        }
        else{
             System.out.println("number found at position");
            
        }
    }
}    
    
    

    
    

