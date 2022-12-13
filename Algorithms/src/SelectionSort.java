
public class SelectionSort {

	int operations = 0;
	
	void sortNums(int a[]) {
		int size = a.length;

		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int number = min + 1; number < size; number++) {
				if (a[number] < a[min]) {
					min = number; operations++;
				}
			}
			
			int temporary = a[i]; operations++;
			a[i] = a[min]; operations++;
			a[min] = temporary; operations++;
		}
	}
	
	public int getOperations() {
		
		return operations;
	}
}
