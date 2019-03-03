package Array;

public class Array2 {

	public static void main(String[] args)
	{
		String [][] str =new String[2][4];
		
		//ROW1
		str[0][0]="sonali";
		str[0][1]="rahul";
		str[0][2]="epshita";
		str[0][3]="sonal";
		//ROW2
		str[1][0]="xyz";
		str[1][1]="abc";
		str[1][2]="pqr";
		str[1][3]="tuv";
		
		
		
		for(int r=0;r<str.length;r++)
		{
			for(int c=0; c<str[r].length;c++)
			{
				System.out.println(str[r][c]);
			}
		}
	}
}
