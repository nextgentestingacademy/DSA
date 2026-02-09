package linkedList;

class DLL{
	int data;
	DLL next;
	DLL prev;
	
	DLL(int value){
		data = value;
		next = null;
		prev = null;
	}
}

public class DoublyLL {

	public static void main(String[] args) {
		DLL first = new DLL(10);
		DLL second = new DLL(20);
		DLL third = new DLL(30);
		
		//forward linking
		first.next = second;
		second.next = third;
		
		//backward linking
		third.prev = second;
		second.prev = first;
		
		DLL current = first;
		System.out.println("Forward Traversal:");
		while(current !=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
		
		current = third;
		System.out.println("Backward Traversal:");
		while(current !=null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
	}

}
