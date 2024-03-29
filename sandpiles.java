/**
  *
  * Abelian Sandpile Rechner
  *
  * @version 1.0 from 17.03.2024
  * @Skadi Wiesemann 
  */

import java.util.*;
import java.util.stream.*;



public class sandpiles {
  
  public static int[] x;
  
  public static int[] y;
  
  public static int[] z;
  
  public static int length = 9;
  
  public static void main(String[] args) {

      define_x();
    define_y();
    addition();

    boolean doesContain = IntStream.of(sandpiles.z).anyMatch(x -> x >= 4);

    if (doesContain == true) {
      for (int i = 0; i <= sandpiles.length; i++) {
        finalisation();
      } // end of for
    } // end of if    

    System.out.println();
    System.out.println("Your sum is:");
    System.out.println("(" + z[0] + ")  (" + z[1] + ")  (" + z[2] + ")");
    System.out.println("(" + z[3] + ")  (" + z[4] + ")  (" + z[5] + ")");
    System.out.println("(" + z[6] + ")  (" + z[7] + ")  (" + z[8] + ")");

       } //end of main
 
@SuppressWarnings("resource")
public static void define_x() {
  
        Scanner sc = new Scanner(System.in);
        int arr_size = 9;
 
        sandpiles.x = new int[arr_size];
 
        // user input
        System.out.println(
            "Enter the elements of the first Sandpile: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
              
                sandpiles.x[i] = sc.nextInt();
              
            } //end of if
          } //end of for
        
          //sc_x.close(); //close sc

       System.out.println("Your first sandpile is:");
    
       System.out.println("("+ x[0] +")  (" + x[1] + ")  (" + x[2] + ")");
       System.out.println("("+ x[3] +")  (" + x[4] + ")  (" + x[5] + ")");
       System.out.println("(" + x[6] + ")  (" + x[7] + ")  (" + x[8] + ")");
       
       
      
  } //end of define_x()
  
  public static void define_y() {
  
        Scanner sc = new Scanner(System.in);
        int arr_size = 9;

        //user input
        sandpiles.y = new int[arr_size];
        System.out.println("Enter the elements of the second sandpile: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
              
                sandpiles.y[i] = sc.nextInt();
              
            } //end of if
          } // end of for
        
          sc.close(); //close sc
    
       System.out.println("Your second sandpile is:");
    
       System.out.println("("+ y[0] +")  (" + y[1] + ")  (" + y[2] + ")");
       System.out.println("("+ y[3] +")  (" + y[4] + ")  (" + y[5] + ")");
       System.out.println("("+ y[6] +")  (" + y[7] + ")  (" + y[8] + ")");
    
     }  //end of define_y
    
  public static void addition(){
    
     int arr_size = 9;
     sandpiles.z = new int[arr_size];
      
    for (int i = 0; i < arr_size ; ++i ) {
    
        sandpiles.z[i] = sandpiles.x[i] + sandpiles.y[i];
      
       } // end of for 
    
    } // end of addition
    
  public static void finalisation() {
    
      if (sandpiles.z[0] >= 4) {
      
         sandpiles.z[0] = sandpiles.z[0] - 4;
         sandpiles.z[0 + 1] = sandpiles.z[0 + 1] +1;
         sandpiles.z[0 + 3] = sandpiles.z[0 + 3] +1;
    
       }//end of if
      
      if (sandpiles.z[1] >= 4) {
      
         sandpiles.z[1] = sandpiles.z[1] - 4;
         sandpiles.z[1 - 1] = sandpiles.z[1 - 1] + 1;
         sandpiles.z[1 + 1] = sandpiles.z[1 + 1] + 1;
         sandpiles.z[1 + 3] = sandpiles.z[1 + 3] + 1;     
        
       }//end of if
      
      if (sandpiles.z[2] >= 4) {
      
         sandpiles.z[2] = sandpiles.z[2] - 4;
         sandpiles.z[2 - 1] = sandpiles.z[2 - 1] +1;
         sandpiles.z[2 + 3] = sandpiles.z[2 + 3] +1;
    
       }//end of if
      
      if (sandpiles.z[3] >= 4) {
      
         sandpiles.z[3] = sandpiles.z[3] - 4;
         sandpiles.z[3 - 3] = sandpiles.z[3 - 3] + 1;
         sandpiles.z[3 + 1] = sandpiles.z[3 + 1] + 1;
         sandpiles.z[3 + 3] = sandpiles.z[3 + 3] + 1;
    
      }//end of if
      
      if (sandpiles.z[4] >= 4) {
      
         sandpiles.z[4] = sandpiles.z[4] - 4;
         sandpiles.z[4 - 1] = sandpiles.z[4 - 1] + 1;
         sandpiles.z[4 + 1] = sandpiles.z[4 + 1] + 1;
         sandpiles.z[4 + 3] = sandpiles.z[4 + 3] + 1;
         sandpiles.z[4 - 3] = sandpiles.z[4 - 3] + 1;
         
       }//end of if
      
      if (sandpiles.z[5] >= 4) {
      
         sandpiles.z[5] = sandpiles.z[5] - 4;
         sandpiles.z[5 - 1] = sandpiles.z[5 - 1] + 1;
         sandpiles.z[5 - 3] = sandpiles.z[5 - 3] + 1;
         sandpiles.z[5 + 3] = sandpiles.z[5 + 3] + 1;
    
       }//end of if
      
      if (sandpiles.z[6] >= 4) {
      
         sandpiles.z[6] = sandpiles.z[6] - 4;
         sandpiles.z[6 + 1] = sandpiles.z[6 + 1] +1;
         sandpiles.z[6 - 3] = sandpiles.z[6 - 3] +1;
        
         }//end of if
      
      if (sandpiles.z[7] >= 4) {
      
         sandpiles.z[7] = sandpiles.z[7] - 4;
         sandpiles.z[7 - 1] = sandpiles.z[7 - 1] + 1;
         sandpiles.z[7 + 1] = sandpiles.z[7 + 1] + 1;
         sandpiles.z[7 - 3] = sandpiles.z[7 - 3] + 1;
    
       }//end of if
      
      if (sandpiles.z[8] >= 4) {
      
         sandpiles.z[8] = sandpiles.z[8] - 4;
         sandpiles.z[8 - 1] = sandpiles.z[8 - 1] +1;
         sandpiles.z[8 - 3] = sandpiles.z[8 - 3] +1;
    
       }//end of if
    
  } // end of finalisation() 
    
}   //end of class
