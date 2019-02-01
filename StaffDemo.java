package package2;

import java.util.Scanner;

public class StaffDemo {
	public static void main(String[] args){
		int i,choice;
		String staffid,name,phonenumber,domain,publication,skills,period;
		float salary;
		int tc=0,techcount=0,cc=0;
		Teaching[] ts=new Teaching[10];
		Technical[] techstaff=new Technical[10];
		Contract[] cs=new Contract[10];
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("enter your choice");
			System.out.println("1.Teaching Staff Entery");
			System.out.println("2.Teachnical Staff Entery");
			System.out.println("3.contract Staff Entery");
			System.out.println("4.Teaching Staff Detailes");
			System.out.println("5.technicle Staff Detailes");
			System.out.println("6.contract Staff Detailes");
			System.out.println("7.exit");
			choice=sc.nextInt();
		      switch(choice){
		      case 1:System.out.println("enter Teaching staff detailes(StaffId,name,Salary,phoneNumber,Domain,publication)");
		              staffid=sc.next();
		              name=sc.next();
		            salary=sc.nextFloat();
		              phonenumber=sc.next();
		              domain=sc.next();
		              publication=sc.next();
		              ts[tc]=new Teaching(staffid,name,salary,phonenumber,domain,publication);
		              tc++;
		              break;
		      case 2: System.out.println("enter Tchnicale staff detailes(Staffid,name,Salary,phonenumber,skills)");
		              staffid=sc.next();
		              name=sc.next();
		              salary=sc.nextFloat();
		              phonenumber=sc.next();
		              skills=sc.next();
		              techstaff[techcount]=new Technical(staffid,name,salary,phonenumber,skills);
		              techcount++;
		              break;
		      case 3:  System.out.println("enter Contract  staff detailes(Staffid,name,Salary,phonenumber,perriod)");
		               staffid=sc.next();
                        name=sc.next();
                        salary=sc.nextFloat();
                        phonenumber=sc.next();
                        period=sc.next();
                        cs[cc]=new Contract(staffid,name,salary,phonenumber,period);
                        cc++;
                        break;
		      case 4:if(tc==0)
		    	  System.out.println("no teaching staff detailes available");
		      else
		      {
		    	  System.out.println("Teaching Staff Detailes");
		    	  System.out.println("Staffid"+"\t"+"name"+"\t"+"salary"+"\t"+"phomenumber"+"\t"+"domain"+"\t"+"publication");
		    	  for(i=0;i<tc;i++){
		    		  System.out.println(ts[i]);
		    		  
		    	  }
		    	  break;
		    	  
		      }
		      case 5:
		    	      if(techcount==0)
		    	    	  System.out.println("NO technicle Staff detailes available");
		    	      else
		    	      {
		    	    	  System.out.println("Technicale StaffDetailes");
		    	    	  System.out.println("Staffid"+"\t"+"name"+"\t"+"salary"+"\t"+"phomenumber"+"\t"+"skills");
		    	    	  for(i=0;i<techcount;i++)
		    	    		  System.out.println(techstaff[i]);
		    	      }
		    	    break;
		      case 6:
		    	  if(cc==0)
    	    	  System.out.println("NO contract Staff detailes available");
    	      else
    	      {
    	    	  System.out.println("contract StaffDetailes");
    	    	  System.out.println("Staffid"+"\t"+"name"+"\t"+"salary"+"\t"+"phomenumber"+"\t"+"period");
    	    	  for(i=0;i<cc;i++)
    	    		  System.out.println(cs[i]);
    	      }
    	    break;

		      case 7: 
		    	  System.exit(0);sc.close();
		           }
		            }
                 	}
          
}