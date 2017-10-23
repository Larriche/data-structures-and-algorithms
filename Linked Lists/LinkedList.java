public class LinkedList<Item>
{
	private class Node
	{
		// Data item that the node is storing
		public Item item;

        // The next node this node points to
        // or null if terminal node
		public Node next;

		public Node(Item item)
		{
			this.item = item;
			this.next = null;
		}
	}

    // The head node
	private Node head;

	public LinkedList()
	{
		this.head = null;
	}

    /**
     * Create a new node out of the given data item
     * and add it as first node of the linked list
     * 
     * @param item The data item
     */
	public void insertAtBegining(Item item)
	{
		// Store the current head
		Node old_head = this.head;

		// Create a new node and let this be the head 
		// node
		this.head = new Node(item);
		this.head.next = old_head;
	}

    /**
     * Delete the first node of a linked list
     * 
     */
	public void deleteFromBegining()
	{
	    if (this.head == null) {

	    }	
	}

    /**
     * Add an item to the end of a linked list
     * 
     * @param item The data item
     */
	public void insertAtEnd(Item item)
	{
	    Node last = new Node(item);
	    Node curr = this.head;

	    if (this.head == null) {
	    	this.head = last;
	    } else {
	    	while (curr != null) {
	    		curr = curr.next;
	    	}

	    	curr.next = last;
	    }
	}

    /**
     * Add a new node with the given data after the node
     * storing the given key 
     * 
     * @param key  Data whose node we want to insert after
     * @param item [description]
     */
	public void insertAfter(Item key, Item item)
	{
		Node curr = this.head;
		Node new_node = new Node(item);

		while (curr != null) {
			if (curr.item == key) {
				new_node.next = curr.next;
				curr.next = new_node;
				break;
			}
		}
	}
}