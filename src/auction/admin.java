package auction;

import java.util.Scanner;

public class admin {
	
		// TODO Auto-generated method stub


	public static void browseAuction() {
		System.out.println("hello view bids");
	}

	public static void BlockUser() {
		System.out.println("hello view bids");
	}
	public static void BlockAuction() {
		System.out.println("hello view bids");
	}



		static Scanner myScan = new Scanner(System.in);
		public static void main(String[] args)  {
		
			String choice = "";
		
		while(!choice.equalsIgnoreCase("Q")) {
				System.out.println("-----WELCOME USER to E-Auction -----");
				System.out.println("BrowseAuction : 1");
				System.out.println("Block/Unblock User: 2");
				System.out.println("Block Auction: 3");

				System.out.println("logging out; Q");
				System.out.println("exit software; E");
				System.out.print("Pick:");
		
				choice = myScan.nextLine();

					switch (choice) {
					case "1": {

						browseAuction();
						break;
					}
					  case "2": {

							BlockUser();
							break;
						}
					case "3": {

								BlockAuction();
								break;
							}
				
					  case "q":
					    System.out.println("logging out....");
					    break;
					/*introduction to the menu system for the normal user and might keep adding to this. 
					 * 
					 */
						case "E": {

							System.exit(0);
							//get.seller page. 
						
						}
					}
		
		}    
	
		
		} 
	}