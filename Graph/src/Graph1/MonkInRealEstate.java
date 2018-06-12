package Graph1;

import java.util.Scanner;

public class MonkInRealEstate {
	public static void main (String [] args){
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int numberOfEdges = 0;
		 int x,y;
		 
		 while(n>0){
			 numberOfEdges = s.nextInt();
			 int [] arr = new int [numberOfEdges+1];
			 for(int i=0;i<numberOfEdges;i++){
				 arr[s.nextInt()-1] = 1;
				 arr[s.nextInt()-1] = 1;
			 }
			 int sum =0;
			 for(int i=0;i<numberOfEdges;i++){
				if(arr[i]==1)
					sum++;
			 }
			 System.out.println(sum);
			 n--;
		 }
		 s.close();
	}
}
