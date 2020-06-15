package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlowerShopOrderTest {
	
	public static final double DELTA = 0.00001;
	
	FlowerShopOrder test = new FlowerShopOrder("wedding", 1);

//	@Test
//	public void same_day_delivery_false(){
//		assertEquals(test.isSameDayDelivery(), false);
//
//}
	
	@Test
	public void num_of_roses() {
	assertEquals(test.getNumberOfRoses(), 1);
}
	@Test
	public void bouquet_type() {
		assertEquals(test.getBouquetType(), "wedding");
	}
	
	// some other things to test
	public void delivery_sameDay_and_20001_returns_5_99() {
		FlowerShopOrder order = new FlowerShopOrder("Azalia", 0);
		double actual = order.delivery(true, "20001");
		double expected = 5.99;
		
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void delivery_sameDay_and_30001_returns_5_99() {
		FlowerShopOrder order = new FlowerShopOrder("Azalia", 0);
		double actual = order.delivery(true, "30001");
		double expected = 6.99;
		
		assertEquals(expected, actual, DELTA);
	}

	@Test
	public void delivery_sameDay_and_10001_returns_0_00() {
		FlowerShopOrder order = new FlowerShopOrder("Azalia", 0);
		double actual = order.delivery(true, "10001");
		double expected = 0.00;
		
		assertEquals(expected, actual, DELTA);
	}

	@Test
	public void delivery_sameDay_and_40000_returns_19_99() {
		FlowerShopOrder order = new FlowerShopOrder("Azalia", 0);
		double actual = order.delivery(true, "40000");
		double expected = 19.99;
		
		assertEquals(expected, actual, DELTA);
	}
}