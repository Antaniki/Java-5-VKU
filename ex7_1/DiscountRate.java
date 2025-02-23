package ex7_1;

public class DiscountRate {
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	
	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Silver":
			return serviceDiscountSilver;
			
		case "Gold":
			return serviceDiscountGold;
		
		case "Premium":
			return serviceDiscountPremium;
		}
		return 0;
	}
	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Silver":
			return serviceDiscountSilver;
		case "Gold":
			return serviceDiscountGold;
		case "Premium":
			return serviceDiscountPremium;
		default:
			return 0;
			
		}
	}
	
}
