import java.util.*;
public class DataStructure{
	public static void main(String[] args){
		//simple static array
		int[] twoDIntegerArray=new int[5];
		twoDIntegerArray[0]=1;
		twoDIntegerArray[1]=41;
		twoDIntegerArray[2]=8;
		twoDIntegerArray[3]=7;
		twoDIntegerArray[4]=21;
		for(int n:twoDIntegerArray){
			System.out.println(n);
		}

		//two d static array

		String[][] array2=new String[2][3];

		array2[0][0]="raouf";
		array2[0][1]="abd raouf";
		array2[0][2]="mohamed";
		array2[1][0]="abidi";
		array2[1][1]="ahlem";
		array2[1][2]="amal";

		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.println(array2[i][j]);
			}
		}

		//dynamic array

		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(56);
		arr3.add(74);
		arr3.add(75);

		for(int i=0; i<arr3.size(); i++){
			System.out.println(arr3.get(i));
		}
		//2d dynamic array

		ArrayList<ArrayList<Integer>> arr4=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> interArr=new ArrayList<Integer>();
		interArr.add(89);
		interArr.add(20);

		arr4.add(interArr);
		ArrayList<Integer> interArr1=new ArrayList<Integer>();
		interArr1.add(189);
		
		arr4.add(interArr1);

		System.out.println(arr4);

		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("name", "raouf");
		hm.put("familyName", "abidi");
		hm.put("job", "officer");
		System.out.println(hm);


		//iterator with arrayList
		ListIterator<Integer> iterator=arr3.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		//iterator with hashmap

		Set<String> keys=hm.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			System.out.println(hm.get(it.next()));
		}

		HashMap<String, ArrayList<Integer>> hma=new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> arrInHM=new ArrayList<Integer>();

		arrInHM.add(5);
		arrInHM.add(59);

		hma.put("raouf", arrInHM);

		System.out.println(hma);

		LinkedList<Integer> linky=new LinkedList<Integer>();
		linky.add(89);
		linky.add(74);
		System.out.println(linky);
		for(int ln:linky){
			System.out.println(ln);
		}
		ListIterator<Integer> itt=linky.listIterator();
		while(itt.hasNext()){
			System.out.println(itt.next());
		}

		linky.add(23);
		linky.add(5);
		linky.add(63);
		System.out.println("---------------------");
		System.out.println(linky);
		for(int i=0; i<linky.size()-1; i++){
			for(int j=i+1; j<linky.size(); j++){
				if(linky.get(i)>linky.get(j)){
					int tmp=linky.get(i);
					linky.set(i, linky.get(j));
					linky.set(j, tmp);
				}
			}
		}

		System.out.println(linky);


	Stack<Integer> stack=new Stack<Integer>(5);
	stack.push(5);
	stack.push(7);
	System.out.println(stack.top);
	System.out.println(stack.pop());
	System.out.println(stack.top);
	
	DynamicStack<Integer> dynamicStack=new DynamicStack<Integer>();
	dynamicStack.push(5);
	dynamicStack.push(6);
	dynamicStack.push(5);
	dynamicStack.push(6);

	Queue<Integer> queu=new Queue<Integer>(3);
	queu.push(8);

	/*binary  tree*/
	
	NodeElement second=new NodeElement(3, null, null);
	NodeElement third = new NodeElement(2, null, null);
	NodeElement fordth = new NodeElement(23, null, null);
	NodeElement fiveth = new NodeElement(14, second, null);
	NodeElement sixth = new NodeElement(42, fordth, third);
	NodeElement first=new NodeElement(5, sixth, fiveth);
	
	BinaryTree bt=new BinaryTree(first);
	NodeElement getRootNode=bt.getRoot();
	/*    parkour left side  */
	System.out.println("-----------------------------");
	while(getRootNode != null){
		System.out.println(getRootNode.getValue());
		getRootNode=getRootNode.getLeft();
	}
	System.out.println("-----------------------------");
	getRootNode=bt.getRoot();
	while(getRootNode != null){
		System.out.println(getRootNode.getValue());
		getRootNode=getRootNode.getRight();
	}
	}
}
@SuppressWarnings("unchecked")
class Stack<T>{
	int size=0;
	int top=-1;
	Object[] stackArray;

	public Stack(int size){
		this.size=size;
		this.stackArray=new Object[size];
	}

	public void push(Object item){
		if(isFull())return;
		top=top+1;
		stackArray[top]=item;
	}
	public Boolean isFull(){
		return (top==size-1);
	}
	public T pop(){
		if(isEmpty())return null;
		T item = (T)stackArray[top];
		top-=1;
		return item;
	}
	public Boolean isEmpty(){
		return (top==-1);
	}
}

@SuppressWarnings("unchecked")
class DynamicStack<T>{
	int size=0;
	int top=-1;
	Object[] stackArray;

	public DynamicStack(){
		this.stackArray=new Object[1];
	}

	public void dynamicArray(){
		stackArray=Arrays.copyOf(stackArray, stackArray.length*2);
	}

	public void push(Object item){
		if(isFull())dynamicArray();
		size++;
		top=top+1;
		stackArray[top]=item;
	}
	public Boolean isFull(){
		return (top==size-1);
	}
	public T pop(){
		if(isEmpty())return null;
		T item = (T)stackArray[top];
		top-=1;
		return item;
	}
	public Boolean isEmpty(){
		return (top==-1);
	}
}

@SuppressWarnings("unchecked")
class Queue<T>{
	int size=0;
	int rear=-1;
	int front=-1;
	Object[] queue;
	public Queue(int size){
		this.size=size;
		queue=new Object[size];
	}
	
	public void push(Object item){
		if(isFull())return;
		front+=1;
		queue[front]=item;
	}
	public T pop(){
		if(isEmpty())return null;
		rear+=1;
		T item =(T) queue[rear];
		return item; 
	}
	public Boolean isFull(){
		return (rear==size-1);
	}
	public Boolean isEmpty(){
		return (rear==front);
	}
}
class NodeElement{
	private int value;
	private NodeElement left;
	private NodeElement right;
	public NodeElement(int value, NodeElement left, NodeElement right){
		this.value=value;
		this.left=left;
		this.right=right;
	}
	public int getValue(){
		return this.value;
	}
	
	public void setLeft(NodeElement leftE){
		this.left=leftE;
	}
	public void setRight(NodeElement rightE){
		this.right=rightE;
	}
	public NodeElement getLeft(){
		return this.left;
	}
	public NodeElement getRight(){
		return this.right;
	}
	public Boolean hasNextLeft(){
		return !(this.left==null);
	}
	public Boolean hasNextRight(){
		return !(this.right==null);
	}
}
class BinaryTree {
	private NodeElement root;
	

	public BinaryTree(NodeElement rootE){
		this.root=rootE;
	}
	public NodeElement getRoot(){
		return this.root;
	}
	public void setRoot(NodeElement rootE){
		this.root=rootE;
	}
	public Boolean isEmpty(){
		return (this.root==null);
	}

}

/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, llistCount).forEach(i -> {
            try {
                int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                llist.insertNode(llistItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int position = Integer.parseInt(bufferedReader.readLine().trim());

        SinglyLinkedListNode llist1 = Result.deleteNode(llist.head, position);

        SinglyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

*/