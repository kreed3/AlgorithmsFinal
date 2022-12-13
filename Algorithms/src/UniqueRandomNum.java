
import java.util.Random;

public class UniqueRandomNum {
	
	int[] numbers;
	
	// empty-arg constructor: initializes a new array with 5 random nums 1-10
	public UniqueRandomNum() {
		int n = 5;
		numbers = new int[n] ;
		Random rand = new Random();
		System.out.println("The initial array is: ");
		for(int i=0 ;i < numbers.length; i++)
			{
			int j = 0;
			numbers[i]= rand.nextInt(10) + 1;
			System.out.print(numbers[i] + ", ");
			
				while (i > j) {
					if (numbers[i] == numbers[j]) {
					numbers[i] = rand.nextInt(10) + 1;
					j = 0;
					}
					else
					j = j + 1;
				}
			}
	}
	
	// constructor: initializes new array with n random nums 1-r
	public UniqueRandomNum(int n, int r) {
		int num = n;
		int scale = r;
		numbers = new int[num] ;
		Random rand = new Random();
		System.out.println("The initial array is: ");
		for(int i=0 ;i < numbers.length; i++)
			{
			int j = 0;
			numbers[i]= rand.nextInt(scale) + 1;
			System.out.print(numbers[i] + ", ");
			
				while (i > j) {
					if (numbers[i] == numbers[j]) {
					numbers[i] = rand.nextInt(r) + 1;
					j = 0;
					}
					else
					j = j + 1;
				}
			}
	}

			
	public int[] getArray() {
		
		return numbers;
	}
	
		
	}



