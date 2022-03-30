

import java.io.*;

class Thread_1 extends Thread
{
    int n;
    Thread_1(int a)
    {
        n = a;
        this.start();
    }
    
    public void run()
    {
        try
        {
            if(n<=5)
            {
                Thread_1 t = new Thread_1(n+1);
                this.sleep(2000/n);
                System.out.println("HELLO FROM THREAD"+n+" !");
            }
            
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}

public class Thread_demo
{
	public static void main(String[] args) {
		try
		{
		    Thread_1 t1 = new Thread_1(1);
		}catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
