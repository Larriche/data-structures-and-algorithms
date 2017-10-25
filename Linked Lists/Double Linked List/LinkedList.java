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

    /**
     * Create a new linked list 
     */
	public LinkedList()
	{
		this.head = null;
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
	}

    /**
     * Delete the first node of this linked list
     */
	public void deleteFromBegining()
	{
		if (this.head != null) {
		    this.head = this.head.next;

		}		
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