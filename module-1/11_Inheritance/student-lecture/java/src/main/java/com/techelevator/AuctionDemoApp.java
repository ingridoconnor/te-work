package com.techelevator;

public class AuctionDemoApp {

	public static void main(String[] args) {
		Auction item1 = new Auction("Purple Water glass");
		Bid ingysBid = new Bid ("Ingy", 2);
		item1.placeBid(ingysBid);
		
		
		
		Bid highBid = item1.getHighBid();
		System.out.println(highBid.getBidder() + " " +
				highBid.getBidAmount());
		
		Bid margaretsBid = new Bid ("Margaret", 6);
		item1.placeBid(margaretsBid);
		
		System.out.println(item1.getHighBid().getBidder() + " " + item1.getHighBid().getBidAmount());
		System.out.println("\nListing of all bids so far on item:" + item1.getItemForSale());
		for(Bid bid: item1.getAllBids()) {
			System.out.println(bid.getBidder() + " " + bid.getBidAmount());
		}
		
		
		System.out.println("***Buyout Auction item***");
		BuyoutAuction item2 = new BuyoutAuction("My dignity", 5000);
		
		
		Bid yichensBid = new Bid("Yichen", 5);
		item2.placeBid(yichensBid);
		Bid dennisBid = new Bid("Dennis", 5000);
		item2.placeBid(dennisBid);
		//System.out.println()
		System.out.println("\nListing of all bids so far on item:" + item2.getItemForSale());
		for(Bid bid: item2.getAllBids()) {
			System.out.println(bid.getBidder() + " " + bid.getBidAmount());
		}
			

	}

}
