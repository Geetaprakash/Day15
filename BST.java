import java.util.*;
class Node{
	 int data;
	 Node left;
	 Node right;
	
public void BinaryTree(int data){
	this.data=data;
	}
	public static void createTree()
	{
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		//1
		root = first;
		first.left=second;
		//second(right) first third(left)
		first.right=third;	
	}
public class BST{
public static void main(String[] args){
	createTree();
}
}
}