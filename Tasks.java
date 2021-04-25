import java.util.Scanner;
class Tasks{
	public void Task1(){
		System.out.println("Hello World");		
	}
	public void Task2(int n){
		double min=n;
		double year = 60 * 24 * 365;
		long years = (long) (min / year);
        int days = (int) (min / 60 / 24) % 365;
		System.out.println(years + " years and " + days + " days");
	}
	
	public void Task3(int n){
		switch(n) {
		case 1: System.out.println("You Said Hi");
				break;
		case 2: System.out.println("You Said Hey");
				break;
		case 3: System.out.println("You Said Hello");
				break;
		default : System.out.println("Invalid Choice");
		}
	}
	
	public void Task4(){
		 int a[][]={{1,3,4},{2,4,3},{3,4,5}};
		 int b[][]={{1,3,4},{2,4,3},{1,2,4}};     
		 int c[][]=new int[3][3];   
		 int d[][]=new int[3][3];
		      
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];  
		System.out.print(c[i][j]+" "); 
		}    
		System.out.println();
		}    
		System.out.println();
		System.out.println("Multiplication");
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
			d[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			d[i][j]+=a[i][k]*b[k][j];      
			}
			System.out.print(d[i][j]+" ");  
			}
			System.out.println();
		}
	}
	public void Prime(int n){
		 int i,m=0,flag=0;    
		  System.out.println("Enter the number:");
		  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is a prime number"); }  
		  }
	}
	public void Fib(int count){
	int n1=0,n2=1,n3,i; 
	 System.out.println("Enter the count of the series:");
	 System.out.print(n1+" "+n2);   
	    
	 for(i=2;i<count;++i)  
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }
	}
	
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//use for required tasks
		Tasks obj = new Tasks();
		//obj.Task1();
		//obj.Task2(n);
		//obj.Task3(n);
		//obj.Task4();
		//obj.Prime(n);
		obj.Fib(n);
	}
}
