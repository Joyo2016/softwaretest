package softwaretest;

public class Triangle {
	//�Ƿ�Ϊ�ȱ������Σ��Ƿ���1�����Ƿ���2�����ܹ��������η���0
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
	//�Ƿ�Ϊ���������Σ��Ƿ���1�����Ƿ���2�����ܹ��������η���0
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
	//�Ƿ�Ϊ���ȱ������Σ��Ƿ���1�����Ƿ���2�����ܹ��������η���0
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
