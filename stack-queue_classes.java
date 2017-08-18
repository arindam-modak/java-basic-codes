import java.util.Scanner;
class trial
{
	public static void main(String...args)
	{
		Scanner var = new Scanner(System.in);
		stack obj = new stack();
		queue qu = new queue();
		int i,tmp;
		for(i=0;i<5;i++)
		{	obj.push(var.nextInt()) ; qu.push(obj.top()); 	}
		while(obj.size()>0)
		{
			System.out.println(obj.top());
			obj.pop();
		}
		while(qu.size()>0)
		{
			System.out.println(qu.front());
			qu.pop();
		}
	}
}
class stack
{
	public int arr[] = new int [1001];
	public int len;
	public int size()
	{
		return len;
	}
	public void push(int x)
	{
		arr[len++]=x;
	}
	public stack()
	{
		len=0;
	}
	public int top()
	{
		return arr[len-1];
	}
	public void pop()
	{
		len--;
	}
}
class queue
{
	public int arr[] = new int[1001];
	public int left , right;
	public queue()
	{
		left = 0;
		right = 0;
	}
	public int size()
	{
		return right-left;
	}
	public void push(int x)
	{
		arr[right++]=x;
	}
	public int front()
	{
		return arr[left];
	}
	public void pop()
	{
		left++;
	}
}







