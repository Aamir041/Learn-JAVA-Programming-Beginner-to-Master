public class discount{
	static double discountAmt(double ...prices){
		
		double totalSum = 0;

		for(double price : prices){
			totalSum = totalSum + price;
		}

		System.out.println(totalSum);

		if(totalSum < 500){
			return (totalSum*0.10);
		}
		else if(totalSum>= 500 && totalSum<1000){
			return (totalSum*0.15);
		}
		else if(totalSum >= 1000){
		    return (totalSum*0.2);	
		}

		return 0;
	}

	public static void main(String[] args){
		System.out.println("You get a discount of amount: " + discountAmt(89.09,34.71,156.90,234.87));
		System.out.println("You get a discount of amount: " + discountAmt(250,250,500));
		System.out.println("You get a discount of amount: " + discountAmt(100,120));
	}
}