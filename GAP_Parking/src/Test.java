import java.util.Arrays;
import java.util.Scanner;


class Test {
    public static void main(String args[] ) throws Exception {
    	
        Scanner s = new Scanner(System.in);
        int nodes = s.nextInt();                 
        int edges = s.nextInt();           
        int parkingCost = s.nextInt();
        
        int [][] links = new int [nodes][nodes];
        for (int i=0;i<nodes;i++){
        	for (int j=0;j<nodes;j++){
        		links [i][j] = -1;
        	}
        }
        int [] capacity = new int [nodes];
        int totalCapacity = 0;
        for (int i=0;i<nodes;i++){
        	capacity [i] = s.nextInt();
        	totalCapacity = totalCapacity + capacity [i];
        }
        	
        
        for (int i = 0; i < edges; i++){
        	int x = s.nextInt() - 1;
        	int y = s.nextInt() - 1;
        	links [x][y] = s.nextInt();
        }
        int cars = s.nextInt();
        
        int [] rates = new int [edges+1];
        for(int i=0;i<edges+1;i++)
        	rates [i] = parkingCost;
       
       
        for(int j=0;j<edges+1;j++){
        	for(int k=0;k<edges+1;k++){
        		if(links [j][k] != -1){
        			rates [k] = rates [j] + links [j][k]; 
        		}
        	}
        }
        
        
        int [] rRates = new int [totalCapacity];
        int index = 0;
        for (int j=0;j<capacity.length;j++){
        	for(int k=0;k<capacity[j];k++){
        		rRates [index] = rates[j];
        		index ++;
        	}
        }
        
        Arrays.sort(rRates);
        int rCount = rRates.length;
        int index1 = 0;
        while(cars>0){
        	if(rCount>0){
        		System.out.print(rRates[index1]+ " " );
        		rCount --;
        		cars --;
        		index1++;
        	}
        	else{
        		System.out.print("-1 ");
        		cars --;
        		index1++;
        	}
        		
        }

    }
}
