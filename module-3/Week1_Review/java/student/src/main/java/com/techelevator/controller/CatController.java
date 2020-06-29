package com.techelevator.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
@RestController
@RequestMapping("/api/cards")
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
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public CatCard getById(@Valid @RequestParam long id) {
    	return catCardDao.get(id);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteCard(@PathVariable long id) {
    	if (catCardDao.get(id) != null) {
    		catCardDao.delete(id);
    	}
    }
}
