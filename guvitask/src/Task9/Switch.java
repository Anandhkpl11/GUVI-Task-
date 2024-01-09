package Task9;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		//Q.No 6
		
		
		 int month =3;
		 int roomRent =1500;
		 int numDays=2;

	        double totalCost = calculateTariff(month, roomRent, numDays);

	        System.out.println("The total hotel tariff is: $" + totalCost);

	     
	    }
	    public static double calculateTariff(int month, double roomRent, int numDays) {
	        double totalCost;

	        switch (month) {
	            case 'A':
	            case 'M':
	            case 'J':
	            case 'N':
	            case 'D':
	                
	                totalCost = roomRent * numDays * 1.2;
	                break;
	            default:
	                totalCost = roomRent * numDays;
	                break;
	        }

	        return totalCost;
	    }
		

	}


