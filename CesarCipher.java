import java.util.Scanner;
class CesarCipher  {
	public static void main(String[] args) {
		String ch;
		int k;
		Scanner clavier=new Scanner(System.in);
		System.out.println("choose a string :");
		ch=clavier.nextLine();
		System.out.println("choose a key  : ");
		k=clavier.nextInt();
		clavier.close();
		System.out.println(caesarCipher(ch, k));
	}
	/*------------------*/
	public static String caesarCipher(String s, int k) {
    // Write your code here
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        String alphabetsMajus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cipher="";
        
        for(int cmp=0; cmp<s.length(); cmp++){
            if(Character.isUpperCase(s.charAt(cmp))){
                int index=alphabetsMajus.indexOf(s.charAt(cmp));
                if(index!=-1){
                if(index+k>=26){
                    index=(index+k)%26;
                }else{index=index+k;}
               
               cipher+=alphabetsMajus.charAt(index);
            }
            }else if(Character.isLowerCase(s.charAt(cmp))){
                int index=alphabets.indexOf(s.charAt(cmp));
                if(index!=-1){
                if(index+k>=26){
                    index=(index+k)%26;
                }else{index=index+k;}
                
               cipher+=alphabets.charAt(index);
            }
            }
            else{
                cipher+=s.charAt(cmp);
            }
        }
        return cipher;
    }
}