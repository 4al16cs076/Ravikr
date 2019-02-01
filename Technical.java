package package2;

public class Technical extends Staff{

		private String skills;
		public Technical(String staffid,String name,float salary,String phonenumber,String skills) 
		{
			super(staffid,name,salary,phonenumber);
			this.skills=skills;
			
		}
		public String toString()
		{
			return super.toString()+"\t"+skills;
		}

	}


