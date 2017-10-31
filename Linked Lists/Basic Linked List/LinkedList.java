/**
 * This class is a basic implementation of a linked list
 *
 * @author  Richman Larry Clifford 
 */
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
	    if (this.head != null) {
	    	this.head = this.head.next;
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
	    	while (curr.next != null) {
	    		curr = curr.next;
	    	}

	    	curr.next = last;
	    }
	}

    /**
     * Delete an item from the end of a linked list
     */
	public void deleteFromEnd()
	{
		Node curr = this.head;
		Node prev = curr;

		// If no element, return
		if (curr == null) {
			return;
		}
        
		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
		}

		prev.next = null;
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

			curr = curr.next;
		}
	}

    /**
     * Delete the first node from the linked list that has the given 
     * node
     * 
     * @param key Item whose node is to be deleted
     */
	public void delete(Item key)
	{
	    Node curr = this.head;
	    Node prev = curr;

	    while (curr.next != null) {
	    	if (curr.item == key) {
	    		prev.next = curr.next;
	    	}

	    	prev = curr;
	    	curr = curr.next;
	    }		
	}

    /**
     * This method searches the linked list for node with
     * given data item and returns it
     * 
     * @param  item Data item
     * @return  Node The node containning the data item
     */
	public Node search(Item item)
	{
		Node curr = this.head;

		while (curr != null) {
			if (curr.item == item) {
				return curr;
			}
			
			curr = curr.next;
		}

		return null;
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
