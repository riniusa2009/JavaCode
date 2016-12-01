package com.coding;

public class Twothread implements Runnable
{
  Thread mythread;;
  
   Twothread(){
	  
	   mythread=new Thread(this,"my runnable thread");
	   System.out.println("my thread created"+mythread);
	   mythread.start();
	  
   }
	public void run(){
		
		System.out.println("My thread is in running state");
		
	}
   public static void main(String args[]){
	   Twothread thread1 = new Twothread();
	   Twothread thread2 = new Twothread();

	   
	   
   }
   
	
}
