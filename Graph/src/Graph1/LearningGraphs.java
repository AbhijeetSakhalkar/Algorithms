package Graph1;

import java.util.Arrays;
import java.util.Scanner;


public class LearningGraphs {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int nNodes = s.nextInt();
		int nEdges = s.nextInt();
		int value = s.nextInt();
		int x,y;
		int [][] graph = new int [nNodes][nNodes];
		for(int i=0;i<nNodes;i++){
			for(int j=0;j<nNodes;j++){
				graph [i][j] = 0;
			}
		}
		
		int [] valueArr = new int [nNodes];
		for(int i=0;i<nNodes;i++){
			valueArr[i] = s.nextInt();
		}
		for(int i=0;i<nEdges;i++){
			x = s.nextInt();
			y = s.nextInt();
			graph[x-1][y-1]=valueArr[y-1];
			graph[y-1][x-1]=valueArr[x-1];
		}
		int [] temp = new int [nNodes];
		int search; int flag=0;
		for(int i=0;i<nNodes;i++){
			for(int j=0;j<nNodes;j++){
				temp[j] = graph[i][j];
			}
			Arrays.sort(temp);
			search = temp[nNodes - value];
			flag=0;
			for(int k=nNodes-1;k>0;k--){
				if(valueArr[k]==search && search !=0 && flag ==0){
					System.out.println(k+1);
					flag = 1;
				}
			}
		}
		s.close();
	}
}
