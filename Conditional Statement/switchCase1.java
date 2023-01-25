import java.util.*;

public class switchCase1 {
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		
		// number to day
		System.out.print("Enter day number: ");
		int numDay = in.nextInt();
		switch(numDay){
		    case 1: System.out.println("Monday");
		    	    break;
		    case 2: System.out.println("Tuesday");
		    	    break;
		    case 3: System.out.println("Wednesday");
		    	    break;	    		    	 
		    case 4: System.out.println("Thursday");
		    	    break;	       	    
		    case 5: System.out.println("Friday");
		    	    break;	    
		    case 6: System.out.println("Saturday");
		    	    break;
            case 7: System.out.println("Sunday");
		    	    break;		    	    
		    default: System.out.println("No Such Day");	    		    	    	    
		}

		// number to month
		System.out.print("Enter month number: ");
		int numMonth = in.nextInt();
		switch(numMonth){
		    case 1: System.out.println("January");
		    	    break;
		    case 2: System.out.println("February");
		    	    break;
		    case 3: System.out.println("March");
		    	    break;	    		    	 
		    case 4: System.out.println("April");
		    	    break;	       	    
		    case 5: System.out.println("May");
		    	    break;	    
		    case 6: System.out.println("June");
		    	    break;
		    case 7: System.out.println("July");
		    	    break;
            case 8: System.out.println("August");
		    	    break;
            case 9: System.out.println("September");
		    	    break;		    	    	
            case 10: System.out.println("October");
		    	    break;
            case 11: System.out.println("Novmber");
		    	    break;
            case 12: System.out.println("December");
		    	    break;		    	    		    	    		    	    	    	    	       
		    default: System.out.println("No Such Month");	    		    	    	    
		}

// Display type of website
		System.out.print("Enter Domain Name: ");
		String domainName = in.next();
		int dotIndex = domainName.indexOf(".");
		String ext = domainName.substring(dotIndex+1);
		switch(ext){
		    case "com": System.out.println("Commercial Website");
		    	        break;
		    case "biz": System.out.println("Business Website");
		    	        break;		    	
		    case "gov": System.out.println("Goverment Website");
		    	        break;		    	
		    case "org": System.out.println("Organization Website");
		    	        break;		    	
		    case "net": System.out.println("Network Website");
		    	        break;		    	
		    default : System.out.println("Not Recognized :(");  
		}
	}
}