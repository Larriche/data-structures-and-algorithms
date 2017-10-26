public class Client
{
	public static void main (String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertAtBegining(5);
		System.out.println(list);

		list.deleteFromBegining();
		System.out.println(list);

		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		System.out.println(list);

		list.deleteFromEnd();
		System.out.println(list);

		list.insertAtEnd(10);
		System.out.println(list);
	}
}