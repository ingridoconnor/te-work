package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlowerShopOrderTest {
	
	FlowerShopOrder test = new FlowerShopOrder("wedding", 1);

	@Test
	public void same_day_delivery_false(){
		assertEquals(test.isSameDayDelivery(), false);

}
	
	@Test
	public void num_of_roses() {
	assertEquals(test.getNumberOfRoses(), 1);
}
	@Test
	public void bouquet_type() {
		assertEquals(test.getBouquetType(), "wedding");
	}

}