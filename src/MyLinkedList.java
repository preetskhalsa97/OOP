
public class MyLinkedList {

	//head								tail
	//  |								|
	// node(data) -> node(data) -> node(data) 
	// add a node
	// delete a node
	// find a node
	
	Node head=null; 
	Node tail=null; 
	public void add(int data){
		Node node  = new Node(data); 
		
		// empty linked list 
		if (tail==null){
			head = node; 
			tail=node; 
		}
		// non empty linked list==> tail has a value 
		else{
			tail.nextNode=node;
			tail=node; 
		}
		
		
		
	}
	
	public Node delete(int data){
		
		// scenario 1:empty linked list 
		// scenario 2:non empty linked list
		// scenario 3:delete element at tail
		// scenario 4:delete element at head
		// scenario 5:delete element somewhere in the middle
		
		Node node = find(data); 
		if (node!=null){
			if(node==tail){
				
				
			}
		}
		
		
		
		return null;
	}
	
	public Node find(int data){
		Node node=head; 
		if (head==null){
			return null;
		}
		if (head.data==data){
			return head; 
		}
		while (node.nextNode!=null){
			node=node.nextNode; 
			if (node.data==data){
				return node;
			}
		}
		
		return null; 
	}
	
	
	
}
