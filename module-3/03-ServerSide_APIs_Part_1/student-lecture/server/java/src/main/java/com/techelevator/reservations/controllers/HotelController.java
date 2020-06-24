package com.techelevator.reservations.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    @RequestMapping(path="/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
    	return reservationDAO.findAll();
    	
    }
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
    	return reservationDAO.get(id);
    }
    @RequestMapping(path= "/hotel/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listByHotel(@PathVariable("id") int id) {
    	return reservationDAO.findByHotel(id);
    	
    }
    @RequestMapping(path= "/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation putReservation(@RequestBody Reservation reservation, @PathVariable int id) {
    	return reservationDAO.create(reservation, id);
    }
    @RequestMapping(path= "/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterHotelsByCandS(@RequestParam String state, @RequestParam (required = false) String city){
    	List<Hotel> filtered = new ArrayList<>();
    	List<Hotel> hotels = list();
    	for (Hotel hotel: hotels) {
    		if(city != null) {
    			if(hotel.getAddress().getCity().equalsIgnoreCase(city)) {
    				filtered.add(hotel);
    			}
    		} else {
    			if(hotel.getAddress().getState().equalsIgnoreCase(state)) {
    				filtered.add(hotel);
    			}
    		}
    	}
    	return filtered;
    }

}
