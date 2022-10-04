import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner clavier=new Scanner(System.in);
        //System.out.println("queries length ");
        long qLen=clavier.nextInt();
        LinkedList ls=new LinkedList();
        for(int i=0; i<qLen; i++){
            int queryType=clavier.nextInt();
            if(queryType==1){
                int data=clavier.nextInt();
                ls.append(data);
            }else if(queryType==2){
                int data=clavier.nextInt();
                ls.delete(data);
            }else if(queryType==3){
                System.out.println(ls.getMin());
            }else{
                System.out.println("bad choice !!");
                i--;
            }
        }
        //ls.showList();
        
        
        
        
    }
}
class Node{
        private long data;
        private Node next;
        public Node(long data){
            this.data=data;
        }
        public long getData(){
            return this.data;
        }
        public Node getNext(){
            return this.next;
        }
        public void setNext(Node next){
            this.next=next;
        }
    }
    class LinkedList{
        private Node head;
        public LinkedList(){
            this.head=null;
        }
        public void append(long data){
            Node node=new Node(data);
            if(isEmpty()){
                this.head=node;
                return;
            }
            Node vHead=head;
            while(vHead.getNext()!=null){
                vHead=vHead.getNext();
            }
            vHead.setNext(node);
        }
        /*-----------------------------*/
        public boolean isEmpty(){
            return this.head==null;
        }
        /*---------------------------*/
        public void delete(long data){
            if(isEmpty()){
                return;
            }
            if(head.getData()==data){head=head.getNext();return;}
            Node vHead=head;
            while(true){
                if(vHead.getNext()==null)return;
                if(vHead.getNext().getData()==data){
                    vHead.setNext(vHead.getNext().getNext());
                    return;
                }
                vHead=vHead.getNext();
            }
        }
        /*--------------------------*/
        public long getMin(){
            if(isEmpty()){
                return 0;
            }
            Node vHead=head;
            long min=head.getData();
            while(vHead.getNext()!=null){
                if(vHead.getData()<min)
                    min=vHead.getData();
                vHead=vHead.getNext();
            }
            if(vHead.getData()<min)
                    min=vHead.getData();
            return min;
        }
        /*----------------------------*/
        
    }