package Graph1;

import java.util.*;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TreeOrNot {
    public static void main(String args[] ) throws Exception {

        //Scanner
    	Scanner s = new Scanner(System.in);
        int numberOfNodes = s.nextInt(); 
        int sum = 0;
        for (int i=0;i<numberOfNodes;i++){
        	sum=sum+s.nextInt();
        }
        
        if(sum == 2*(numberOfNodes -1))
        	System.out.println("Yes");
        else
        	System.out.println("No");
        s.close();
    }
}
