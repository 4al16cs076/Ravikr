package package2;

public class Contract extends Staff {
	private String period;
	public  Contract(String staffid,String staffname,Float staffsalary,String staffphonenumber,String staffperiod){
		super(staffid,staffname,staffsalary,staffphonenumber);
		period=staffperiod;
	}
	public String toString()
	{
		return super.toString()+"\t"+period;
	}

}
