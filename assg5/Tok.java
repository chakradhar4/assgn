package assg5;



import java.io.*;
import java.util.*;

class Tok {

    public static void main(String args[]) throws Throwable {
    	System.out.println("Token Ring");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		System.out.print(i+ " ");
    	}
    	System.out.println(0);
    	
    	int token = 0;
    	System.out.println("Enter sender node:: ");
    	int sender = sc.nextInt();
    	System.out.println("Enter receiver node:: ");
    	int receiver = sc.nextInt();
    	System.out.println("Enter data:: ");
    	int data = sc.nextInt();
    	
    	for( int i = token; (i % n) != sender; i = (i + 1) % n) {
    		System.out.print(i + "-> ");
    	}
    	
    	System.out.println(" "+ sender);
    	System.out.println("Rceiver is "+ receiver);
    	System.out.println("Data is" + data);
    	
    	for(int i = sender ; i != receiver; i = (i+1)%n) {
    		System.out.println("Sending from "+ i);
    	}
    	
    	System.out.println("Data recived by receiver");
    }
}