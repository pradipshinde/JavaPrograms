package com.pradip.define.separateconcreateclass;

/**
 * @author Pradip
 *
 */
public class UsageClassOne {

	/**
	 * call the thread
	 */
	public void method()
	{
		MyThread myThread=new MyThread();
		myThread.start();
		
	}
}
