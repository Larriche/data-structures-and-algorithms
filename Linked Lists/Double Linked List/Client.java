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

		list.insertAfter(10, 14);
		System.out.println(list);

		list.insertAfter(10, 11);
		System.out.println(list);

		list.delete(4);
		System.out.println(list);

		list.delete(14);
		System.out.println(list);

		list.delete(10);
		System.out.println(list);

		list.delete(11);
		System.out.println(list);

		list.delete(5);
		System.out.println(list);



	}
}