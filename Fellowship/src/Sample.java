
import java.util.Random;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner lalit= new Scanner(System.in);
		
		System.out.println("here is the Tic Tac Toe box number");
		System.out.println(" ");
		
		int[][] box = new int[3][3];
		
		int list[] = new int[9];
		int c=1;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+c+ "  ");
				box[i][j] = c;
				c++;
			}
			System.out.println(" ");
			System.out.println(" ");
		
		}
		
		
		System.out.println("");
		for(int k=0;k<c-1;k++)
		{	
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					// for user
					
					for(int x=0;x<list.length;x++)
						if(list[x] ==  box[i][j])
							box[i][j] = 22;
					
				}
				System.out.println(" ");
				System.out.println(" ");
			
			}
			int cmp = computer(9);
			System.out.print("Computer Enter number "+cmp);
			list[k] = +cmp;
			k++;
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					// for user
					
					for(int x=0;x<list.length;x++)
						if(list[x] ==  box[i][j])
							box[i][j] = 11;
					
				}
				System.out.println(" ");
				System.out.println(" ");
			
			}
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(box[i][j] == 11)
						System.out.print(" C  ");
					else if(box[i][j] == 22)
						System.out.print(" X  ");
					else
						System.out.print(" "+box[i][j]+ "  ");
				}
				System.out.println(" ");
				System.out.println(" ");
			
			}
			
			if(box[0][0] + box[0][1] + box[0][2] == 66)
			{
				// for checking 1-2-3
				if(box[0][0] + box[0][1] + box[0][2] == 66)
					System.out.println("You are win...");
				else if(box[0][0] + box[0][1] + box[0][2] == 33)
					System.out.println("Computer Has won...");
			}else if(box[1][0] + box[1][1] + box[1][2] == 66)
			{
				//for checking 4-5-6
				if(box[1][0] + box[1][1] + box[1][2] == 66)
					System.out.println("You are win...");
				else if(box[1][0] + box[1][1] + box[1][2] == 33)
					System.out.println("Computer Has won...");
			}else  if(box[2][0] + box[2][1] + box[2][2] == 66)
			{
				//for checking 7-8-9
				if(box[2][0] + box[2][1] + box[2][2] == 66)
					System.out.println("You are win...");
				else if(box[2][0] + box[2][1] + box[2][2] == 33)
					System.out.println("Computer Has won...");
 				
			}else if(box[0][0] + box[1][0] + box[2][0] == 66)
			{
				//for checking 1-4-7
				if(box[0][1] + box[1][0] + box[2][0] == 66)
					System.out.println("You are win...");
				else if(box[0][1] + box[1][0] + box[2][0] == 33)
					System.out.println("Computer Has won...");
			}else if(box[0][1] + box[1][1] + box[2][1] == 66)
			{
				//for checking 2-5-8
				if(box[0][1] + box[1][1] + box[2][1] == 66)
					System.out.print("You are win...");
				else if(box[0][1] + box[1][1] + box[2][1] == 33)
					System.out.println("Computer Has won...");
			}else  if(box[0][2] + box[1][2] + box[2][2] == 66)
			{
				//for checking 3-6-9
				if(box[0][2] + box[1][2] + box[2][2] == 66)
					System.out.println("You are win...");
				else if(box[0][2] + box[1][2] + box[2][2] == 33)
					System.out.println("Computer Has won...");
			}else if(box[0][0] + box[1][1] + box[2][2] == 66)
			{
				//for checking 1-5-9
				if(box[0][0] + box[1][1] + box[2][2] == 66)
					System.out.println("You are win...");
				else if(box[0][0] + box[1][1] + box[2][2] == 33)
					System.out.println("Computer Has won...");
			}else if(box[0][2] + box[1][1] + box[2][0] == 66)
			{
				//for checking 3-5-7
				if(box[0][2] + box[1][1] + box[2][0] == 66)
					System.out.println("You are win...");
				else if(box[0][2] + box[1][1] + box[2][0] == 33)
					System.out.println("Computer Has won...");
			} 
			/*
			 {
				System.out.println(" Match is draw..");
			}
			else if(box[0][0] == box[2][1])
			{
				if(box[0][0] == box[2][2])
					if(box[0][0] == 22)
						System.out.println("You are win...");
					else if(box[0][0] == 11)
						System.out.println("Computer Has won...");
			}else if(box[0][2] == box[2][1])
			{
				if(box[0][2] == box[2][0])
					if(box[0][2] == 22)
						System.out.println("You are win...");
					else if(box[0][2] == 11)
						System.out.println("Computer Has won...");
			} */
			
			
			for(int x=0;x<list.length;x++)
				System.out.print(list[x]+" ");
			
			System.out.println(" ");
			
			System.out.print("Enter the box number ");
			list[k] = lalit.nextInt();
			
			System.out.println(" ");
			
			lalit.close();
		
		}		
		
	}
	static int computer(int N)
	{
		Random rand = new Random();
		
		int ramdom_number = rand.nextInt(9);
		
		return ramdom_number;
		
	}    
	
	

}