//Reverse an Array
/*class Practic
{
	public static void main(String [] args){
			int arr[]= {1,2,3,4,5};
			for (int i=(arr.length-1);i>=0;i--){
				System.out.print(arr[i]+" ");
			}
	}
}*/
//Add 2 Matrix
/*class Practic{
	public static void main(String[] args){
		int arr1 [][]={{1,2,3},{4,5,6},{7,8,9}};
		int arr2 [][]={{9,8,7},{6,5,4},{3,2,1}};
		
		
		for (int i=0;i<arr1.length;i++){
			for (int j=0;j<arr1[i].length;j++){
				
				System.out.print((arr1[i][j] + arr2[i][j])+" ");
			}
			System.out.println();
		}	
		
	}
}*/

//Swap Even Index Elements
class Practic{
	void swap(){
		int arr []={1,2,3,4,5,6,7,8,9,10,11};
		for(int i=0;i<arr.length-2;i=i+4){
			if (i%2==0){
				arr[i+2]=arr[i+2] + arr[i];
				arr[i]=arr[i+2]-arr[i];
				arr[i+2]=arr[i+2]-arr[i];
				
			}
			
		}
		for(int i=1;i<arr.length-2;i=i+4){
			if (i%2!=0){
				arr[i+2]=arr[i+2] + arr[i];
				arr[i]=arr[i+2]-arr[i];
				arr[i+2]=arr[i+2]-arr[i];
			}	
				
			
		}
		for(int val:arr){
			System.out.print(val+" ");
			
		}
	}
	public static void main(String[] args){
		Practic p = new Practic();
		p.swap();
		
		
		
			
	}
}
//Sort an Array in Decending Array
/*import java.util.Arrays;

class Practic{
	public static void main(String[] args){
		int arr []={9,10,6,7,1,8,6,5,3,2,4};
		Arrays.sort(arr);
		for(int val:arr){
			System.out.print(val+" ");
			
		}

		

	}
}*/
//
/*class Practic{
	public static void main(String[] args){
		int arr []={9,10,6,7,1,8,6,5,3,2,4};
		for (int i=0;i<arr.length;i++){
			for(int j=(i+1);j<arr.length;j++){
				if (arr[i]<arr[j]){
					
					arr[i]=arr[j] + arr[i];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
			
		}
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
}*/
//Multiplication Of 2 Matrix
/*class Practic
{
	public static void main(String [] args)
	{
	int[][] matrix1= {{1,2,3},{4,5,6}};
	int[][] matrix2= {{1,2,3},{4,5,6},{1,2,3}};
	int[][] matrix=new int[2][3];
	for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				matrix[i][j]=0;
				for( int k=0;k<3;k++)
				{
					matrix[i][j]= matrix[i][j]+(matrix1[i][k]*matrix2[k][j]);
					
				}
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(); 
			
		}
	}
}*/

