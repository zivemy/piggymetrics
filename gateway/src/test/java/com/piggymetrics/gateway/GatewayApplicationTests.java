package com.piggymetrics.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GatewayApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void fire() {

	}

	public static double subWayCost(int ticket, int times){
		double totalCost = 0;
		for (int i = 0; i < times; i++) {
			if (totalCost<100){
				totalCost+=ticket;
			}else if (totalCost<150){
				totalCost+=0.8*ticket;
			}else {
				totalCost+=0.5*ticket;
			}
		}

		return totalCost;
	}


	public static void main(String[] args) {
		System.out.println(subWayCost(5,44));
	}
}
