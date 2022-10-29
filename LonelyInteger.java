import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LonelyInteger{
	public static void main(String[] args) {
		List<Integer> array=new ArrayList<Integer>();
		array.add(1); 
		array.add(2); 
		array.add(3); 
		array.add(4); 
		array.add(5); 
		array.add(4); 
		array.add(3); 
		array.add(2); 
		array.add(1); 
		System.out.println("the lonely integer is :"+lonelyinteger(array));
	}
	public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        Collections.sort(a);
        int cmp=0;
        while(cmp<a.size()-1){
            if(a.get(cmp)==a.get(cmp+1)){
                cmp+=2;
            }else{
                break;
            }
        }
        return a.get(cmp);
    }
}