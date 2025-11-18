package s6722782032_LAB03;

public class Test {
	public static void main(String[] args) {
		SList<Integer> ilist = new SList<Integer>();
		if (ilist.isEmpty() == true)
			System.out.println("You have successfully create your list and it's empty now");
		else
			System.out.println("Your list is not empty");

		ilist.addFirst(5);
		ilist.printHorizontal();
		ilist.removeLast();
		ilist.printHorizontal();
	}
}
