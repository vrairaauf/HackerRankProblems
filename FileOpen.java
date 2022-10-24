// importing desktop
import java.awt.Desktop;
// importing java io
import java.io. * ;
// main class
public class FileOpen{
  public static void main(String[] args) {
    try {
      //constructor of file class  
       // java read file 
      File myFile = new File("MyFile.txt");
      // using if statment 
      if (!Desktop.isDesktopSupported())
      //check if Desktop is supported by Platform or not  
      {
        System.out.println("This is not supported by platform!");
        return;
      }
      Desktop desktop = Desktop.getDesktop();
      // checking if file exists or not
      if (myFile.exists())
      // Opens the file 
      desktop.open(myFile); 
    System.out.println("file opened");
    }
    // catch block to handle any kind of errors
    catch(Exception e) {
      System.out.println("Error accurs");
    }
  }
}