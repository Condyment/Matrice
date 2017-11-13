import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		int array[] = { 1, 13, 2, 4 };
		int a[] = new int[10];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(i<j)
				{
					if(array[i]>array[j])
					{
						
						
					System.out.println(array[j]);
					System.out.println(array[i]);
					
				}
				}
				
			}
		}
	}

}
