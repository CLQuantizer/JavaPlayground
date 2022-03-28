class MyThread extends Thread{
	String name;
	public MyThread (String n){name = n;}
	@Override
	public void run()
	{
		for(int i=0; i<1000000;i++);
		System.out.println("MyThread is running "+name);
	}

}