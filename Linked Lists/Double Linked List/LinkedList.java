public class LinkedList<Item>
{
	/**
	 *  This class is an implementation of a double linked 
	 *  list
	 *
	 * @author Richman Larry Clifford
	 */

	/**
	 * This class represents a node of this linked list
	 * 
	 */
	private class Node
	{
		// Data item that this node is storing
		public Item item;

        // The next node that this node points to
		public Node next;

		// The previous node that this node points to
		public Node prev;

        /**
         * Create a new node
         * 
         * @param  item Data item to store in the node
         */
		public Node(Item item)
		{
			this.item = item;
			this.prev = null;
			this.next = null;
		}
	}

	// The head node
	private Node head;

	// The tail node
	private Node tail;

    /**
     * Create a new linked list 
     */
	public LinkedList()
	{
		this.head = null;
		this.tail = null;
	}

    /**
     * Insert a new node at the begining of the list
     *
     * @param item Data Item to be stored
     */
	public void insertAtBegining(Item item)
	{
		// Store old head
		Node old_head = this.head;

		// Create new node and let this be the head
		this.head = new Node(item);
		this.head.next = old_head;

		// If new node is the only node, make it tail node as well
		if (this.tail == null) {
			this.tail = this.head;
		}
	}

    /**
     * Delete the first node of this linked list
     */
	public void deleteFromBegining()
	{
		Node old_head = this.head;

		if (old_head.next != null) {
			old_head.next.prev = null;
		} else {
			this.tail = null;
		}

		this.head = old_head.next;
	}

    /**
     * Insert a node at the end of a linked list
     * 
     */
	public void insertAtEnd(Item item)
	{
		Node new_node = new Node(item);

		new_node.prev = this.tail;

		if (this.tail == null) {
			this.head = new_node;
		} else {
			this.tail.next = new_node;
		}

		this.tail = new_node;
	}

    /**
     * Delete the last node in the linked list
     */
	public void deleteFromEnd()
	{
		Node old_last = this.tail;

		if (this.head == null) {
			return;
		}
        
		if (this.head.next == null) {
	        // If just one element
			this.head = null;
		} else {
			old_last.prev.next = null;
		}

		this.tail = old_last.prev;
	}

	/**
     * Get the string representation of the linked list
     * 
     * @return The string representation
     */
	public String toString()
	{
	    String list = "";
	    Node curr = this.head;
        
        if (curr == null) {
        	return "No items";
        }

	    while (curr != null) {
	    	list += curr.item.toString() + ",";
	    	curr = curr.next;
	    }	

	    return list;
	}
}