package FunctionalPrograms;

import utility.util;

public class stopwatch
{
	private long startTime;
	private long endTime;
 
	public void start()
	{
		startTime = System.currentTimeMillis();
	}

	public void stop()
	{
		endTime = System.currentTimeMillis();
	}

	public long timeElapsed()
	{
		return (endTime - startTime);
	}

	public static void main(String[] args)
	{
		stopwatch sw = new stopwatch();
		int start;
		int end;
        long timeTaken ;
		
		do
		{
			System.out.println("Enter 1 to start the stopwatch...!");
			start = util.getPositiveInt();
		}while(start!=1);
		sw.start();
		
		do
		{
			System.out.println("Enter 2 to stop the stopwatch...!");
			end = util.getPositiveInt();
		}while(end!=2);
		sw.stop();

		//display elpased time
		
		timeTaken = sw.timeElapsed();
		util.printTime(timeTaken);
	}
}