

public class Sample2 {
	 char [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) 
	{
		
		Sample2 s=new Sample2();
		s.display();
		
		
		
		
	}
	
	public void display()
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println("hellow");
		}
	}
	

}
