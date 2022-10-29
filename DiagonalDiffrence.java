import java.util.ArrayList;
import java.lang.Math;
class DiagonalDiffrence {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer> >();
		for(int cmp=0; cmp<3; cmp++)
			array.add(new ArrayList<Integer>());
		for(int cmp=0; cmp<3; cmp++){
			array.get(cmp).add(cmp);
			array.get(cmp).add(cmp+1);
			array.get(cmp).add(cmp+2);
		}
		System.out.println(array);
		System.out.println(diagonalDifferenceF(array));
	}
	/*---------------*/
	 public static int diagonalDifferenceF(ArrayList<ArrayList<Integer>> arr) {
    // Write your code here
        int length=arr.size();
        int d1=0, d2=0;
        int deb=0, fin=length-1;
        for(int cmp=0; cmp<length; cmp++){
            d1+=arr.get(cmp).get(deb);
            d2+=arr.get(cmp).get(fin);
            deb++;
            fin--;
        }
        return Math.abs(d1-d2);
    }
}