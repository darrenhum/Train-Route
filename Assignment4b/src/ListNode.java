public class ListNode
{
	private ListNode prev;
    private Object data;
    private ListNode next;
    
    public ListNode(Object newData)
    {
        this(null, newData, null);
    }
    
    public ListNode(ListNode newPrev, Object newData, ListNode newNext)
    {
    	prev = newPrev;
        data = newData;
        next = newNext;
    }
    
    public Object getData() { return data; }
    public ListNode getPrev() { return prev; }
    public ListNode getNext() { return next; }
    
    public void setPrev(ListNode newPrev) { prev = newPrev; }
    public void setNext(ListNode newNext) { next = newNext; }
    
    public void printListFromHere()
    {
        System.out.println("----------\nStart List\n----------");
        ListNode currNode = this;
        while (currNode != null)
        {
            System.out.println(currNode.getData() + "\n");
            
            currNode = currNode.getNext();
        }
        System.out.println("----------\nEnd List\n----------");
    }
    
    public String toString(){
    	
    	return (String) data;
    }
}