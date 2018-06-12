package Graph1;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader; */
//import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class EdgeExistance {

	public static void main (String args []) throws Exception{

        Scanner s = new Scanner(System.in);
        int nodes = s.nextInt();
        int edges = s.nextInt();
        int x,y;
		int [][] links = new int [nodes][nodes];
        for(int i=0;i<nodes;i++){
        	for(int j=0;j<nodes;j++){
        		links [i][j] = 0;
        	}
        }
        for (int i =0;i<edges;i++){
        	x = s.nextInt();
        	y = s.nextInt();
        	links [x-1][y-1] = 1;
        }
        
        int noOfQueries = s.nextInt();
        while (noOfQueries>0){
        	x = s.nextInt();
        	y = s.nextInt();
        	
        	if (links [x-1][y-1] == 1)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        	noOfQueries --;
        }

	}
}
