/**
 *  This class is an implementation of a double linked 
 *  list
 *
 * @author Richman Larry Clifford
 */
public class LinkedList<Item>
{
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
	private head;
}