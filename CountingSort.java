import java.util.ArrayList; 
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
class CountingSort {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner clavier=new Scanner(System.in);
		int length;
		System.out.println("choose the lenght of the list");
		length=clavier.nextInt();
		clavier.close();
		Random randomNumber=new Random();
		for(int cmp=0; cmp<length; cmp++){
			arr.add(randomNumber.nextInt(100));
		}
		System.out.println(countingSortF(arr));
	}
	/*--------------------*/
	public static List<Integer> countingSortF(List<Integer> arr) {
    // Write your code here
        int max=Collections.max(arr);
        if(max<99)
            max=99;
        List<Integer> result=new ArrayList<Integer>();
        for(int cmp=0; cmp<=max; cmp++){
            result.add(Collections.frequency(arr, cmp));
        }
        return result;
    }
    /*--------------------*/

}