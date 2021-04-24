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
	
	public void Task3(){
		
	}
	
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Tasks obj = new Tasks();
		//obj.Task1();
		//obj.Task2(n);
	}
}
