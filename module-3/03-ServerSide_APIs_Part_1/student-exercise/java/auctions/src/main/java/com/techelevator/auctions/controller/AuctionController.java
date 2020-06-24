package com.techelevator.auctions.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	private AuctionDAO dao;

	public AuctionController() {
		this.dao = new MemoryAuctionDAO();
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Auction> listAuctions(@RequestParam (required = false, defaultValue = "") String title_like, 
			@RequestParam (required = false, defaultValue = "0.0") double currentBid_lte) {
		if(currentBid_lte > 0.0) {
			return dao.searchByTitleAndPrice(title_like, currentBid_lte);
		
		}
		
		return dao.searchByTitle(title_like);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id) {
		return dao.get(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Auction putAuction(@RequestBody Auction auction) {
		return dao.create(auction);
	}
	
	
}
