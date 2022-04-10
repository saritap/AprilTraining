package com.training;

public class Day2_Array {

	public static void main(String[] args) {
	int a=5;
	
	/*single dimention 
	data_type  name_ofArray[]=new data_type[size];
	
	
	two dimention array 
	int [][]arr2d=new int[3][2];
	*/
	
	int [][]arr2d=new int[3][2];
	
	
	
	for(int i=0;i<3;i++) // //  travsering the row i=0 j=0,j=1 ,i=1,j=0,j=1
	{
		for(int j=0;j<2;j++) // traversing the colomn
		{
			arr2d[i][j]=a;
			a++;
			
		}
	}
	
	System.out.println(" value at row 0 colomn 0  arr2d[0][0]="+arr2d[0][0]);
	int arr[]=new int[5];
	arr[0]=3;
	arr[1]=62;
	arr[2]=63;
	arr[3]=66;
	arr[4]=68;
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	

	}

}
