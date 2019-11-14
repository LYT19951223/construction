package constructionLYT;
import java.io.IOException;
import java.util.Random;
public class Project01 
{
	public static void main(String[] args) throws IOException
	{
		Random lyt=new Random();
		int d=0;
		boolean f;
		for (int i = 0; i < 50; i++) 
		{
			f=false;
			while(f==false) 
			{
				int a=lyt.nextInt(100);
				int b=lyt.nextInt(100);
				int c=lyt.nextInt(2);
				
				if (c==0) 
				{
					d=a+b;
					if(d<100) 
					{
						f=true;
						System.out.print(a+"+"+b+"=?     ");
					}
					else f=false;
				}
				else if(c==1) 
				{
					d=a-b;
					if(d>0) 
					{
						f=true;
						System.out.print(a+"-"+b+"=?     ");
					}
					else f=false;
				}
			}
			if((i+1)%5==0) 
			{
				System.out.println();
			}
		}
	}
}
