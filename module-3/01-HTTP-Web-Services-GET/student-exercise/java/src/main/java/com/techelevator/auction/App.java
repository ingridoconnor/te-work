package com.techelevator.auction;

import java.util.Scanner;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class App {

    private static final String API_URL = "http://localhost:3000/auctions";
    public static RestTemplate restTemplate = new RestTemplate();
    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        run();
    }

    /**
     * Here to support testing
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    public static Auction[] listAllAuctions() {
        return restTemplate.getForObject(API_URL, Auction[].class);
        
    }

    public static Auction listDetailsForAuction() {
    	
    	System.out.println("Select an Auction (1-7), that you would like a description for: ");
    	int id = 0;
    	 try {
             id = Integer.parseInt(scanner.nextLine());
         } catch (NumberFormatException exception) {
             System.out.println("Error parsing the input for menu selection.");
         }
        return restTemplate.getForObject(API_URL + "/" + id, Auction.class);
        
    }

    public static Auction[] findAuctionsSearchTitle() {
    	System.out.println("Select an auction title to search for: ");
    	String title = "";
    	Auction[] array = null;
    	title = scanner.nextLine();
    	try {
    		
    		array = restTemplate.getForObject(API_URL + "?title_like=" + title, Auction[].class);
    	} catch (HttpClientErrorException expection) {
    		System.out.println("Error thrown :,(");
    	}
    	
        return array;
    }

    public static Auction[] findAuctionsSearchPrice() {
    	System.out.println("Enter price of an item you would like to search: ");
    	double currentBid = 0.00;
    	//Auction[] array = null;
    	 
    	try {
    		currentBid = Double.parseDouble(scanner.nextLine());
    		
    	} catch (NumberFormatException e) {
    		System.out.println("UH_OH STINKY.");
    	}
        return restTemplate.getForObject(API_URL + "?currentBid_lte=" + currentBid, Auction[].class);
    }

    private static void run() {
        int menuSelection = 999;

        printGreeting();

        while (menuSelection != 5) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
            	
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
            	
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
            	
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
    }

    private static void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private static void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private static void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println("");
        }
    }

}
