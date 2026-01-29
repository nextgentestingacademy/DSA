package queue;

public class PriorityQueueArray {

	public static void main(String[] args) {
		int[] elements = new int[3];
		int[] priority = new int[3];

		int count = 0;

		// add elements and priority
		elements[0] = 10;
		priority[0] = 3;
		count++;

		elements[1] = 20;
		priority[1] = 2;
		count++;

		elements[2] = 30;
		priority[2] = 1;
		count++;

		while (count > 0) {
			int highest = 0;
			//checking the highest priority
			for (int i = 1; i < count; i++) {
				if (priority[i] < priority[highest]) {

					highest = i;
				}

			}
			//printing the value of the element and it's priority if it is highest
			System.out.println("Served element: " + elements[highest] + " having priority (" + priority[highest] + ")");
			
			//overwriting the value of the element that is served with the next index value
			for(int i=highest;i<count-1;i++) {
				elements[i]=elements[i+1];
				priority[i]=priority[i+1];
			}
			count--;
		}

	}

}
