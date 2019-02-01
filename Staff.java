package package2;

public class Staff {
protected String staffid,name,phonenumber;
protected float salary;
public Staff(String staffid,String staffname,float staffsalary,String staffphonenumber)
{
	super();
	this.staffid=staffid;
	this.name=staffname;
	this.salary=staffsalary;
	this.phonenumber=staffphonenumber;
}
public String toString()
{
	return staffid+"\t"+name+"\t"+salary+"\t"+phonenumber;
}
}


