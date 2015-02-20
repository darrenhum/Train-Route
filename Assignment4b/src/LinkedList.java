public class LinkedList {

	private ListNode head;
	private ListNode tail;
	private String routeName;
	
	public LinkedList(){
		head = null;
		tail = null;
		routeName = "";
	}
	
	public LinkedList(String newrouteName){
		head = null;
		tail = null;
		routeName = newrouteName;
	}
	
	public ListNode getHead() { return head; } 
	public ListNode getTail() { return tail; }
	public String getrouteName() { return routeName; }
	
	public void printList(){
		if(head != null){
			System.out.println(routeName);
			head.printListFromHere();
		}
		else{
			System.out.println("<Empty List>");
		}
	}
	
	public int getLength(){
		int length = 0;
		ListNode currNode = head;
		while(currNode != null){
			length++;
			currNode = currNode.getNext();
		}
		return length;
	}
	
	public void addNodeToBeginning(ListNode newNode){
		newNode.setNext(head);
		newNode.setPrev(null);
		head = newNode;
		tail = newNode;
	}
	
	public void addNodeToEnd(ListNode newNode){
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = tail.getNext();
			tail.setNext(null);
		}
	}
	
	public void addNodeAfterNode(ListNode newNode, ListNode addAfter){
		if(head != null){
			 ListNode currNode = head;
			 
			 while(currNode != null && !currNode.getData().equals(addAfter.getData())){
				 currNode = currNode.getNext();
			 }
			 
			 if(currNode != null){
				 currNode.getNext().setPrev(newNode);
				 newNode.setNext(currNode.getNext());
				 currNode.setNext(newNode);
				 currNode.getNext().setPrev(currNode);
			 }
		}
	}
	
	public void removeFirstNode(){
		if(head != null){
			head = head.getNext();
			//head.setPrev(null);
		}
	}
	
	public void removeLastNode(){
		if(head != null){
			if(head == tail){
				head = null;
			}
			else{
				ListNode prevNode = tail.getPrev();
				tail.setPrev(null);
				prevNode.setNext(null);
				tail = prevNode;
			}
		}
	}
	
	public void removeNode(ListNode toRemove){
		if(head != null){
			ListNode currNode = head;
			
			while(currNode.getNext() != null 
					&& !currNode.getNext().getData().equals(toRemove.getData())){
				currNode = currNode.getNext();
			}
			
			if(currNode.getNext() != null){
				currNode.setNext(currNode.getNext().getNext());
				currNode.getNext().setPrev(currNode);
			}
		}
	}
	
	//-------------------------\\
	public LinkedList copyList(){
		LinkedList newList = new LinkedList(routeName);
		ListNode temp = head;
		
		if(head != null){
			
			newList.addNodeToEnd(temp);
			ListNode currNode = head;
			
			while(currNode.getNext() != null){
				
				temp = currNode.getNext();
				newList.addNodeToEnd(temp);
				System.out.println("In");
				currNode = currNode.getNext();
			}
		}
		return newList;
	}
	
	public void reverseAll(){
		ListNode temp = null;
		ListNode current = head;
		
		while (current != null) {
			temp = current.getPrev();
			current.setPrev(current.getNext());
			current.setNext(temp);
			current = current.getPrev();
		}

		if (temp != null)
			head = temp.getPrev();
	}
	
	public void removeAll(){
		head = null;
		tail = null;
	}
	
	public static LinkedList Tester1(){
		LinkedList list = new LinkedList("Toronto-Calgary w/ Small Cities");
		
		list.addNodeToBeginning(new ListNode(new StopInfo("Toronto", "Toronto" , "Large", true)));
		list.addNodeToBeginning(new ListNode(new StopInfo("Ottawa", "Ottawa", "Small", true)));
		list.addNodeToEnd(new ListNode(new StopInfo("Thunder Bay", "Thunder Bay", "Small", false)));
		list.addNodeToEnd(new ListNode(new StopInfo("Sudbury", "Sudbury", "Small", false)));
		list.addNodeToEnd(new ListNode(new StopInfo("Winnipeg", "Winnipeg", "Large", true)));
		list.addNodeToEnd(new ListNode(new StopInfo("Saskatoon", "Saskatoon", "Small", false)));
		list.addNodeToEnd(new ListNode(new StopInfo("Calgary", "Calgary", "Large", true)));
		
		return list;
	}
	
	public static LinkedList Tester2(){
		LinkedList list = new LinkedList("Toronto-Calgary");
		
		list.addNodeToBeginning(new ListNode(new StopInfo("Toronto", "Toronto" , "Large", true)));
		list.addNodeToEnd(new ListNode(new StopInfo("Thunder Bay", "Thunder Bay", "Small", false)));
		list.addNodeToEnd(new ListNode(new StopInfo("Sudbury", "Sudbury", "Small", false)));
		list.addNodeToEnd(new ListNode(new StopInfo("Winnipeg", "Winnipeg", "Large", true)));
		list.addNodeToEnd(new ListNode(new StopInfo("Calgary", "Calgary", "Large", true)));
		
		return list;
	}
	
	
	
	
	
	
	
}
