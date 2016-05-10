package softwaretest;

public class Triangle {
	//是否为等边三角形，是返回1，不是返回2，不能构成三角形返回0
	public int isequ(int a, int b,int c){  
        int r=0;
        if((a+b<=c)||(b+c<=a)||(a+c<=b))
		{			
			r=0;
		}
		else
		{
			if(a==b&&a==c)
			{
				r=1;
			}
			else
			{
				r=2;
			}
		}
		return r;
    }
	//是否为等腰三角形，是返回1，不是返回2，不能构成三角形返回0
	public int isiso(int a, int b,int c){  
        int r=0;
        if((a+b<=c)||(b+c<=a)||(a+c<=b))
		{			
			r=0;
		}
		else
		{
			if(a==b||a==c||b==c)
			{
				r=1;
			}
			else
			{
				r=2;
			}
		}
		return r;
    }
	//是否为不等边三角形，是返回1，不是返回2，不能构成三角形返回0
	public int issca(int a, int b,int c){ 
		int r=0;
		if((a+b<=c)||(b+c<=a)||(a+c<=b))
		{			
			r=0;
		}
		else
		{
			if(a!=b&&a!=c&&b!=c)
			{
				r=1;
			}
			else
			{
				r=2;
			}
		}
		return r;
    }
}
