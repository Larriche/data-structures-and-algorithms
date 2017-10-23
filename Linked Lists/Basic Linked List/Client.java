public class Client
{
	public static void main (String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertAtEnd(5);
		System.out.println(list);

		list.insertAtEnd(10);
		System.out.println(list);

		list.insertAtEnd(15);
		System.out.println(list);

		list.insertAfter(10, 12);
		System.out.println(list);

		list.deleteFromEnd();
		list.deleteFromEnd();
		System.out.println(list);

		list.deleteFromBegining();
		System.out.println(list);

		list.insertAtBegining(5);
		list.insertAtBegining(2);
		list.insertAtBegining(1);
		System.out.println(list);

		list.delete(2);
		System.out.println(list);
	}
}