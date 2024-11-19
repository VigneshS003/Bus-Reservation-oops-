package busrev;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;  //get and set
	
	Bus(int no,boolean ac,int cap)
	{
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	//accessor method
	
	public int getBusNo()   
	{
		return busNo;
	}
	public boolean isAc()
	{
		return ac;
	}
	public int getcapacity()     
	{   
		return capacity;
	}
	
	//mutator method
	
	public void setAc( boolean val)
	{
		ac=val;
	}
	public void setcapacity(int cap)   
	{
		capacity=cap;
	}
	
	public void displayBusInfo()
	{
		System.out.println("Bus No :"+ busNo+ "  Ac :"+ac+ "  Total Capacity :"+ capacity);
	}
}
