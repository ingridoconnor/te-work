package com.techelevator;

public class BuyoutAuction extends Auction {
	private int buyoutPrice;
	
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super (itemForSale); // call constructor passing
		//string variable to the parent class
		this.buyoutPrice = buyoutPrice;
	}
	
	public int getBuyoutPrice() {
		return buyoutPrice;
		
	}
	
	
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		// if current high bid rec is < buyoutPrice
		if (super.getHighBid().getBidAmount() < buyoutPrice ) {
			//is offeredBid >= to buyoutPrice, if so, it's sold!
			if(offeredBid.getBidAmount() >= buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
				
			}
			isCurrentWinningBid = super.placeBid(offeredBid);
			
		}return isCurrentWinningBid;

	}

}
