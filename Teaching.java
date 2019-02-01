package package2;

public class Teaching  extends Staff {
	private String domain;
	private String publication;
	public Teaching( String staffid,String name,float salary,String phonenumber,String domain,String publication){
		  super(staffid,name,salary,phonenumber);
		  this.domain=domain;
		  this.publication=publication;
		  
	} 
	
	public String toString()
	{
		return staffid+"\t"+name+"\t"+salary+"\t"+phonenumber+"\t"+domain+"\t"+publication;
				
	}

}
