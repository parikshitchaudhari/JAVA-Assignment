/*
-------------------------------------------------


class assignment1{
	public static void main(String... args){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=(10-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

class assignment1{
	public static void main(String... args){
		int n=10;
		for(int i=1;i<=n;i++){
			
			for(int j=0;j<=(i-1);j++){
				if (j>0){
					System.out.print(" ");
				}
			}
			for(int k=1;k<=((n+1)-i);k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
class assignment1{
	public static void main(String... args){
		int n=10;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=(10-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++){
			
			for(int j=0;j<=(i-1);j++){
				if (j>0){
					System.out.print(" ");
				}
			}
			for(int k=1;k<=((n+1)-i);k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

// decimal to binary
class assignment1{
	static void binary1(int dec){
		int ind = 0;
		int a[]=new int[10];
		while (dec>0){
			a[ind]=dec%2;
			dec=dec/2;
			ind++;
		}
		for(int i=ind-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}
	public static void main(String... args){
		binary1(10);
	}
}
// ##decimal to octal 

class assignment1{
	static void oct(int dec){
		int ind = 0;
		int a[]=new int[10];
		while (dec>0){
			a[ind]=dec%8;
			dec=dec/8;
			ind++;
		}
		for(int i=ind-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}
	public static void main(String... args){
		oct(105);
	}
}

class assignment1{
	static void hex(int decimal){
		int rem = 0;
		String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		while(decimal>0)  
		{  
			rem=decimal%16;   
			hex=hexchars[rem]+hex;   
			decimal=decimal/16;  
		}
		System.out.print(hex);

		}
	public static void main(String... args){
		hex(960);
	}
}

// identify type of triangle

class assignment1{
	static void triangle(int a,int b,int c){
		if (((a+b)>c) & ((a+c)>b) & ((b+c)>a)){
			if((a==b)&(b==c)){
				System.out.println("Trianle is Equilateral  triangle");
			}
			else if((a==b)|(b==c)|(a==c)){
				System.out.println("Trianle is isoscales triangle");
			}
			else{
				System.out.println("Trianle is Scalane triangle");
			}
		}
		else{
			System.out.println("Trianle is not possible");
		}
	}
	public static void main(String... args){
		triangle(10,10,10);
		triangle(10,10,11);
		triangle(10,20,30);
		triangle(10,19,22);
	}
	
}
*/