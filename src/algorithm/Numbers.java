package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];
		storeRandomNumbers(num);
		//ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//connectToSqllDB.insertDataFromArrayToSqlTable(num,"selection_sort","SortingNumbers")
		//List<String>numbers = connectToSqlDb.readDataBase("selection_sort","SortingNumbers")
		 //printValue(numbers);
		//Selection Sort
		Sort algo = new Sort();
		int n = num.length;
		//selection sort
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
       // List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        //printValue(numbers);
		//int n = num.length;
		//Insertion sort
		randomize (num, n);
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		//By following above, Continue for rest of the Sorting Algorithm....
		//Come to conclusion about which Sorting Algo is better in given data set.
		//bubble sort
		randomize(num,n);
		algo.bubbleSort(num);
		long bubbleSortExecutionTime =algo.executionTime;
		System.out.println("Total Execution time of  "+ num.length+"numbers in Bubble Sort take: "+ bubbleSortExecutionTime+ "milli sec");
		//merge sort
		randomize(num,n);
		algo.mergeSort(num,0,n-1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution time of  "+ num.length+"numbers in mergeSortSort take: "+ mergeSortExecutionTime+ "milli sec");
		//quick sort
		randomize(num,n);
		//algo.quickSort(num,0,n-1); //comment
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution time of  "+ num.length+"numbers in Bubble Sort take: "+ quickSortExecutionTime+ "milli sec");
		//heap sort
		randomize(num,n);
		//algo.heapSort(num,n); //mycomment
		int maxValueForBucketSort = num[num.length-1];
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total execution time of :" +num.length+"numbers in bucket sort take: "+bubbleSortExecutionTime+"mill sec");

	}



	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
