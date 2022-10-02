import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayManipulate {
	class Result{
		 public static long arrayManipulation(int n, List<List<Integer>> queries) {
        n+=2;
        long[] oper=new long[n];
        long max=0L;
        for(int i=0; i<queries.size(); i++){
            int start=queries.get(i).get(0);
            int end=queries.get(i).get(1)+1;
            int added=queries.get(i).get(2);
            oper[start]+=added;
            oper[end]-=added;
            
            
        }
        for(int j=1; j<n; j++){
                oper[j]+=oper[j-1];
                if(oper[j]>max)
                    max=oper[j];
            }
        return max;
        
    }

	}
	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list.add(Arrays.asList(1, 5, 3));
		list.add(Arrays.asList(4, 8, 7));
		list.add(Arrays.asList(6, 9, 1));

		System.out.println(Result.arrayManipulation(10, list));	
	}
}

