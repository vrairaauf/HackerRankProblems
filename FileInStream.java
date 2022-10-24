// imporiting fileinputstream
import java.io.FileInputStream;  
// main class
public class FileInStream {  
  // main method
    public static void main(String args[]){   
        //try block 
          try{    
            // constructor in fileinputstream class
           // java read file
            FileInputStream myfile=new FileInputStream("Myfile.txt");  
            // printing
            System.out.println("The file contains the followng data:");
            // counter
            int counter = 0;
            // while loop to iterate 
            while ((counter = myfile.read()) != -1) {
              System.out.print((char) counter);
            }  
          // catch block to hadle the error
          }catch(Exception e){
            System.out.println("Error accurs!");
          }    
         }    
        }