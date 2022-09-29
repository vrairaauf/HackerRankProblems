import java.util.*;
class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    /*-----------------------------------------*/
    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
    /*-------------------------*/
    public SinglyLinkedListNode getHeadNode(){
        return this.head;
    }
    /*-----------------------------------*/
    public Boolean isEmpty(){
        return (this.tail==null);
    }
    /*show linked list*/
    public void showList(){
        if(this.isEmpty()){
            System.out.println("empty list");return;
        }
        SinglyLinkedListNode vHead=head;
        while(vHead!=null){
            SinglyLinkedListNode node=vHead;
            System.out.println(node.data);
            vHead=vHead.next;
        }

    }
    /* get tail node */
    public SinglyLinkedListNode getTailNode(){
        return this.tail;
    }
    /* delete head node */
    public void deleteOneNode(){
        if(this.head!=null)
            this.head=this.head.next;
        else 
            System.out.println("empty list");
    }
    /*---------------LIST SIZE-------------*/
    public int listSize(){
        SinglyLinkedListNode vHead=head;
        int size=0;
        while(vHead!=null){
            SinglyLinkedListNode node=vHead;
            System.out.println(node.data);
            vHead=vHead.next;
            size++;
        }
        return size;
    }
    /*    insert element into the list  */

    public void insertNodeIntoList(int position, int data)
    {
        if(this.isEmpty()){System.out.println("empty list you can't insert node in specific place try to insert method");return;}
        if(this.listSize()<position){System.out.println("indefined position");return;}
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(position==1){
            this.head=node;
        }
        
        SinglyLinkedListNode vHead=this.head;
        for(int count=0; count <position-1; count++){
            vHead=vHead.next;
        }
        SinglyLinkedListNode side=vHead.next;
        vHead.next=node;
        node.next=side;

    }
}


public class LinkedList{
    public static void main(String[] args){
        SinglyLinkedList llst=new SinglyLinkedList();
        llst.insertNode(5);
        llst.insertNode(12);
        llst.insertNode(13);
        llst.insertNode(14);
        llst.insertNode(15);

        llst.showList();

        System.out.println("-----------------");

        //llst.deleteOneNode();

        llst.insertNode(16);
    
        llst.insertNodeIntoList(3, 7845);

        llst.showList();


    }
}