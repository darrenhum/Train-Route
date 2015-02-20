
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList test = LinkedList.Tester1();
		
		test.printList();
		
		ListNode temp = new ListNode(new StopInfo("Sudbury", "Sudbury", "Small", false));
		
		test.addNodeAfterNode(new ListNode(new StopInfo("Test1", "Test1")), temp);
		test.removeNode(temp);
		
		//Make sure all add and remove methods work
		
		
		test.addNodeToBeginning(temp);
		
		
		test.addNodeToEnd(temp);
		test.printList();

		test.removeFirstNode();
		test.removeLastNode();
		
		
		
		test.reverseAll();
		
		
		
		
		/*
		LinkedList test2 = new LinkedList("New List From Old");
		test2 = test.copyList();
		
		test2.printList();
		*/

	}

}
