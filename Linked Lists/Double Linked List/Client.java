public class Client
{
	public static void main (String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertAtBegining(5);
		System.out.println(list);

		list.deleteFromBegining();
		System.out.println(list);
	}
}