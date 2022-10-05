public class BinaryTree{
	public static void main(String[] args) {
		Tree tr1=new Tree(122);
		tr1.append(56);
		tr1.append(6);
		tr1.append(5);
		tr1.append(1);
		tr1.append(14);
		tr1.append(41);
		tr1.append(41);
		tr1.append(102);
		if(tr1.exist(502))
			System.out.println("5 exist in the tree");
		tr1.show();
	}
}
/*------------------------*/
class Node<T>{
	public Object data;
	public Node leftNode;
	public Node rightNode;

	public Node(Object data){
		this.data=data;
	}
}
/*---------------------------*/
class Tree{
	public Node root;
	public Tree(Object data){
		this.root=new Node(data);
	}
	/*--------------------*/
	private void addNode(Object data, Node tree){
		if((int)data<=(int)tree.data){
			if(tree.leftNode==null){
				tree.leftNode=new Node(data);
			}else{
				addNode(data , tree.leftNode);
			}
		}
		else if((int)data>(int)tree.data){
			if(tree.rightNode==null){
				tree.rightNode=new Node(data);
			}else{
				addNode(data , tree.rightNode);
			}
		}
	}
	public void append(Object data){
		if(this.root==null){
			this.root=new Node(data);
			return;
		}
		this.addNode(data, this.root);
	}
	/*--------------------*/
	
	private void showNode(Node node){
		if(node==null){
			return;
		}
		System.out.println(node.data);
		showNode(node.leftNode);
		showNode(node.rightNode);
	}
	public void show(){
		this.showNode(this.root);
	}
	/*--------------------*/
	private boolean existHelp(Node node,int data){
		if(node==null){
			return false;
		}
		if((int)node.data == data){
			return true;
		}else{
			if(data<=(int)node.data){
				return existHelp(node.leftNode, data);
			}else{
				return existHelp(node.rightNode, data);
			}
		}
		//return false;
	}
	public boolean exist(int data){
		return this.existHelp(this.root, data);
	}
	/*--------------------*/
	
}