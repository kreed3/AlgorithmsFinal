
public class MergeSort {
	
	int operations = 0;
	
	void merge(int arr[], int l, int m, int r)
    {
        // sizes of subarrays to merge
        int n1 = m - l + 1;
        int n2 = r - m;
        // temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
        // copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // merge the temp arrays
        // indices of first and second subarrays
        int i = 0;
        int	j = 0;
        // initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; operations++;
                i++;
            }
            else {
                arr[k] = R[j]; operations++;
                j++;
            }
            k++;
        }
        // copy elements of L[] if any 
        while (i < n1) {
            arr[k] = L[i]; operations++;
            i++;
            k++;
        }
        // copy elements of R[] if any 
        while (j < n2) {
            arr[k] = R[j]; operations++;
            j++;
            k++;
        }
    }
	
	void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // find the middle
            int m = l + (r - l) / 2; operations++;
            // sort both halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // merge the sorted halves
            merge(arr, l, m, r);
        }
    }
	
	public int getOperations() {
		
		return operations;
	}
}
