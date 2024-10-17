package 
//import java.util.Scanner;
class task extends Thread{ 
	public void run(){ 
		
		//int num = 201 ; 
		for(int i=201; i <= 210; i++)  
		{      
		System.out.println("2020f-BSE-"+i);  
		}  
	}
	
	public static void main(String args[]){ 
		task t1=new task(); 
		t1.start();
		task2 t2=new task2(); 
		t2.start();
	} 
} 


package lab3;
class task2 extends Thread {
public void run(){ 
		
		for(int i=1; i <= 10; i++)  
		{      
		System.out.println(i +" January 2020" );  
		}  
	}

}


package lab3;


	class Main extends Thread{ 
		 public void run(){ 
		 System.out.println("running..."); 
		 } 
		public static void main(String args[]){ 
		 Main t1=new Main(); 
		 Main t2=new Main();
		 Main t3= new Main();
		 System.out.println("Name of t1:"+t1.getName()); 
		 System.out.println("Name of t2:"+t2.getName()); 
		 System.out.println("Name of t3:"+t3.getName());
		 
		 t1.start(); 
		 t2.start(); 
		 t3.start();
		 
		 t1.setName("Sami"); 
		 System.out.println("After changing name of t1: "+t1.getName()); 
		 t2.setName("Sami Ali"); 
		 System.out.println("After changing name of t2: "+t2.getName());
		} 
		} 



package lab3;
	class main1 extends Thread{ 
		public void run(){ 
		 System.out.println("running thread name is:"+Thread.currentThread().getName()); 
		 System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
		 
		 } 
		public static void main(String args[]){ 
			main1 m1=new main1(); 
			main1 m2=new main1(); 
		 m1.setPriority(Thread.MIN_PRIORITY); 
		 m2.setPriority(Thread.MAX_PRIORITY); 
		 m1.start(); 
		 m2.start(); 
		 
		} 
		}
