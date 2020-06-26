package com.techelevator.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;

public class CatController {

    private CatCardDAO catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<CatCard> list(){
    	return catCardDao.list();
    }
    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public CatCard makeCatCard() {
    	CatFact fact = catFactService.getFact();
    	CatPic pic = catPicService.getPic();
    	CatCard card = new CatCard();
    	card.setCatFact(fact.getText());
    	card.setImgUrl(pic.getFile());
    	return card;
    }
    @RequestMapping(method = RequestMethod.POST)
    public CatCard saveNewCard(@Valid @RequestBody CatCard catCard) {
    	catCardDao.save(catCard);
    	return catCard;
    	
    }
}
