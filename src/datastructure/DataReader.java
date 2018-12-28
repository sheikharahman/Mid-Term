package datastructure;

import org.w3c.dom.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String line;
		String store = "";
		try{
			fr= new FileReader("C:\\Users\\Sheikh\\Desktop\\TheFolder\\MidtermNovember2018-master\\src\\data\\self-driving-car");
		}
		catch(Exception ex){
			System.out.println();
		}
		try{
			br = new BufferedReader(fr);
			while((line = br.readLine()) !=null){
				store+=line;
			}
		}
		catch(Exception ex){
			System.out.println("System was not abel to read attachment");
		}
		String []storeArray = store.split("");
		Stack<String> myStack = new Stack<String>();
		List<String>myList = new LinkedList<String>();
		for(String element:storeArray){
			myStack.add(element);
			myStack.add(element);
		}
		System.out.println("the LinkedList  list LIFO");
		Iterator<String> it = myList.iterator();
		while (it.hasNext()){
			System.out.println(it.next()+ "");
		}
		System.out.println("the Stack LIFO");
		while(!myStack.isEmpty()){
			System.out.println(myStack.pop()+"");}
		}



	}


