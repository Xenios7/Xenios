import java.util.Scanner;
public class Main {

	public static int fill(int []arr, int N)
	{
		Scanner myObj = new Scanner(System.in);
		N = 0;
		while(!myObj.hasNextLine())
		{
				arr[N] = myObj.nextInt();
				N++;
		}
		return N;
		
	}
	
	public static boolean swap(int []arr1, int arr2[], int size)
	{
		int temp;
		for(int i = 0; i < size; i++)
		{
			temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
	//store the values of each array before swapping, in order to check if they successfully swapped
		int []tempArr1 = new int[size];
		int []tempArr2 = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			tempArr1[i] = arr1[i];
		}
		for(int i = 0; i < size; i++)
		{
			tempArr2[i] = arr2[i];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int []a = new int [100];
		int []b = new int [100];
		int size1 = 0, size2 = 0;
		
		System.out.println("Give the first array!");
		size1 = fill(a, size1);
		System.out.println("Give the second array!");
		size2 = fill(a, size2);
		
		if(size1 == size2)
			swap(a, b, size1);

		
		
		
	}

}
