class question6 {

	static int noOfObjects = 0;

	{
		noOfObjects += 1;
	}

	public question6()
	{
	}
	public question6(int n)
	{
	}
	public question6(String s)
	{
	}

	public static void main(String args[])
	{
		question6 t1 = new question6();
		question6 t2 = new question6(5);
		question6 t3 = new question6("GFG");

		System.out.println(question6.noOfObjects);
	}
}
