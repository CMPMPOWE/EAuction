package auction;

import java.util.Scanner;

public class menuSystem {

	public static void paymentDetails() {
		System.out.println("hello view bids");
	}

	public static void sell_Item() {
		System.out.println("hello view bids");
	}

	public static void viewBids() {
		System.out.println("hello view bids");
	}
	public static void browseAuction() {
		System.out.println("hello");
	}
		static Scanner myScan = new Scanner(System.in);
		public static void main(String[] args)  {
		
			String choice = "";
		
		while(!choice.equalsIgnoreCase("Q")) {
				System.out.println("-----WELCOME USER to E-Auction -----");
				System.out.println("BrowseAuction : 1");
				System.out.println("Payment information: 2");
				System.out.println("View placed bid: 3");
				System.out.println("Sell item: 4");
				System.out.println("Logging out; Q");
				System.out.println("Exit software; E");
				System.out.print("Pick:");
		
				choice = myScan.nextLine();

					switch (choice) {
					case "1": {

						browseAuction();
						break;
					}
					  case "2": {

							paymentDetails();
							break;
						}
					case "3": {

								viewBids();
								break;
							}
					case "4": {

						sell_Item();
						//get.seller page. 
						break;
					}
					  case "q":
					    System.out.println("logging out....");
					    break;
					/*introduction to the menu system for the normal user and might keep adding to this. 
					 * 
					 */
						case "e": {

							System.exit(0);
							//get.seller page. 
						
						}
					}
		
		}    
	
		
		} 
	}