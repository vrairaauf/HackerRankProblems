import java.io.*;
import java.util.*;

public class Solution {
    static class NodeElement{
        int data;
        NodeElement next;
        public NodeElement(int data){
            this.data=data;
        }
    }
    static class Queu{
        NodeElement front;
        NodeElement tail;
        public void enqueu(int data){
            NodeElement node=new NodeElement(data);
            //System.out.println(node.data);
            if(this.front==null && this.tail==null){
              //System.out.println("inter classes ");
              //node.next=null;
              this.tail=node;
              //System.out.println("tail"+this.tail.data);
              this.front=node;  
              //System.out.println("front"+this.front.data);
            }else{
                //System.out.println("deded ");
                //node.next=null;
                this.tail.next=node;
                this.tail=node;
            }
            
        }
        public void dequeu(){
            if(this.front != null && this.front.next==null){
                this.front=null;
                this.tail=null;
                return;
            }
            if(this.front!=null){
                this.front=this.front.next;
            }
        }
        /*-----------------*/
        public void print(){
            if(this.front!=null){
                System.out.println(this.front.data);
            }/*else{
                System.out.println("");
            }*/
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Queu queu=new Queu();
        Scanner clavier=new Scanner(System.in);
        int query, data, cmp=0;
        int q=clavier.nextInt();
       while(cmp<q){
            //System.out.println("query : ");
            query=clavier.nextInt();
        
            if(query==1){
               
                //System.out.println("enqueu query");
                data=clavier.nextInt(); 
                queu.enqueu(data);
            }
            else if(query==2){
                //System.out.println("dequeu query");
                queu.dequeu();
            }else if(query==3){
                //System.out.println("print query");
                queu.print();
            }/*else{
                System.out.println("bad request ! ");
            }*/
            cmp++;
        }
        clavier.close();
        
        
    }
}

------------------

    public static String isBalanced(String s) {
    // Write your code here
        List<Character> stack=new ArrayList<Character>();
        HashMap<Character, Character> brackets=new HashMap<Character ,Character>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
        
        for(int cmp=0; cmp<s.length(); cmp++){
            if(s.charAt(cmp)=='{' || s.charAt(cmp)=='[' || s.charAt(cmp)=='('){
                stack.add(s.charAt(cmp));
            }else{
                if(stack.size()>0){
                    char top=stack.get(stack.size()-1);
                    stack.remove(stack.size()-1);
                    if(brackets.get(top)!=s.charAt(cmp)){
                        return "NO";
                    }
                }else{
                    return "NO";
                }
            }
        }
        return (stack.size()!=0)?"NO":"YES";
        
    }

}