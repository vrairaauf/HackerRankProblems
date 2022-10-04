import java.util.*;

class Node{
	Object data;
	Node next;
	public Node(Object data){
		this.data=data;
	}
}

class LinkedList<T>{
	Node head;
	// add at end of list
	public void append(Object data){
		if(this.isEmpty()){
			Node node=new Node(data);
			head=node;
			return;
		}
		Node node=new Node(data);
		Node vHead=head;
		while(true){
			if(vHead.next==null)break;
			vHead=vHead.next;
		}
		vHead.next=node;

	}
	// if list is empty
	public Boolean isEmpty(){
		return (head==null);
	}
	// add at deb of file

	public void preAppend(Object data){
		if(this.isEmpty()){
			Node node=new Node(data);
			head=node;
			return;
		}
		Node node=new Node(data);
		Node vHead=head;
		node.next=head;
		head=node;
	}
	/* delete ops */
	public void delete(){
		if(this.isEmpty()){System.out.println(" empty !!");return;}
		head=head.next;
	}
	public void pop(){
		if(this.isEmpty()){System.out.println(" empty !!");return;}
		Node vHead=head;
		while(true){
			if(vHead.next.next==null)break;
			vHead=vHead.next;
		}
		vHead.next=null;
	}


	/* show list */
	public void showList(){
		if(this.isEmpty()){System.out.println("vide !!"); return;}
		Node vHead=head;
		while(true){
			System.out.println(vHead.data);
			if(vHead.next==null)break;
			vHead=vHead.next;
		}
	}

	/* search into linked list */
	// search the position of data
	public int getPosition(Object data){
		if(this.isEmpty()){System.out.println("empty list"); return -1;}
		int counter=0;
		Node vHead=head;
		while(true){
			if(vHead.data==data)
				break;
			if(vHead.next==null)
				return -1;
			vHead=vHead.next;
			counter++;
		}
		return counter+1;
	}
	/* search if data exists*/
	public Boolean contain(Object data){
		if(this.isEmpty()){System.out.println("empty list"); return false;}
		Node vHead=head;
		while(true){
			if(vHead.data==data)
				return true;
			if(vHead.next==null)
				return false;
			vHead=vHead.next;
		}
	}
	/* size of linked list */
	public int size(){
		if(this.isEmpty()){System.out.println("empty list"); return 0;}
		Node vHead=head;
		int counter=0;
		while(true){
			counter++;
			if(vHead.next==null)
				break;
			vHead=vHead.next;
			
		}
		return counter;
	}

	/* insert element into precise position */

	public void insertNode(Object data, int position){
		if(this.isEmpty()){System.out.println("empty !!"); return;}
		if(position>this.size()){System.out.println("invalid position");return;}
		if(position==1){this.preAppend(data);return;}
		if(position==this.size()){this.append(data);return;}
		Node vHead=head;
		int counter=1;
		while(counter<position-1){
			vHead=vHead.next;
			counter++;
		}
		Node node=new Node(data);
		node.next=vHead.next;
		vHead.next=node;
	}
	/*delete woth value*/

	public Boolean deleteWithValue(Object data){
		if(this.isEmpty()){System.out.println("empty !!");return false;}
		if(head.data==data){head=head.next;return true;}
		Node vHead=head;
		while(true){
			if(vHead.next==null)return false;
			if(vHead.next.data==data){vHead.next=vHead.next.next;return true;}
			vHead=vHead.next;
		}
		
	}

	/*sorting*/
	/*bubble sort*/

	public void bubbleSort(){
		if(this.isEmpty()){System.out.println("empty !!");return;}
		Node current=this.head, index=null;
		int temp;
		while(current!=null){
			index=current.next;
			while(index!=null){
				if((int)current.data>(int)index.data){
					temp=(int)current.data;
					current.data=index.data;
					index.data=temp;
				}
				index=index.next;
			}
			current=current.next;
		}

	}
	/*---------------------*/
	public Boolean compare(LinkedList list1){
		if(this.isEmpty() && list1.isEmpty())
			return true;
		if(this.size() != list1.size())
			return false;
		Node vHead1=this.head;
		Node vHead2=list1.head;
		while(vHead1!=null){
			if(vHead1.data==vHead2.data){
				vHead1=vHead1.next;
				vHead2=vHead2.next;
			}else
				return false;
		}
		return true;
	}
}
public class LinkedLists{
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.append(1);
		ls.append(2);
		ls.append(3);
		ls.append(4);
		ls.append(5);
		ls.append(6);

		LinkedList ls1=new LinkedList();
		ls1.append(1);
		ls1.append(2);
		ls1.append(3);
		ls1.append(4);
		ls1.append(5);
		ls1.append(6);
		//ls.pop();
		//ls.delete();
		/*ls.showList();
		System.out.println("-----------------");
		int size=ls.size();
		System.out.println("the size of the linked list :"+size);
		if(ls.contain(12)){
			System.out.println("the list contain 12");
		}
		int searchPos=ls.getPosition(2);
		System.out.println("the position of 2 "+searchPos);
		ls.insertNode(7, 2);
		ls.showList();
		System.out.println("-----------------");
		//ls.deleteWithValue(36);
		ls.bubbleSort();
		ls.showList();
		System.out.println("-----------------");
		*/
		if(ls.compare(ls1))
			System.out.println("equals");
	}
}



/*

my job in hackerrank using java
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
/*
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    if(position==0)return llist.next;
    SinglyLinkedListNode vHead=llist;
    int counter=1;
    while(counter<position){
        counter++;
        vHead=vHead.next;
    }
    vHead.next=vHead.next.next;
    return llist;

    }
print linkedlist exercice solving in hackerrank
static void printLinkedList(SinglyLinkedListNode head) {

        while(true){
                System.out.println(head.data);
                if(head.next==null)break;
                head=head.next;
            }
    }
*/
/*

insert node at the end  of liste solving in hackerrank
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(head==null)
        {
            head=node;
            return head;
        }
        SinglyLinkedListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        return head;

    }
*/