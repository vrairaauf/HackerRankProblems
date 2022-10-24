import java.util.*;
public class cmd{
	public static void main(String[] args) {
		try{
			/* the two synatxe are correct */
			String command="notepad queen.java";
			//Process child = Runtime.getRuntime().exec(command);
			
			Runtime.getRuntime().exec(command);
			System.out.println("terminated...");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}