package me.afua.subscriptiontest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptiontestApplicationTests {

    @Test
    public void test_returnDollar() {
        System.out.println("Test if pricePerMonth returns Dollars...") ;
        Subscription S = new Subscription(200,2) ;
        //This test will fail with assert errors until the value of 100 is given
        assert(S.pricePerMonth() == 100.0) ;
    }



    @Test
    public void test_roundUp() {
        System.out.println("Test if pricePerMonth rounds up correctly...") ;
        Subscription S = new Subscription(200,3) ;
        System.out.println(S.pricePerMonth());
        //This test will fail with assert errors until the value of 67.0 is given
        assert(S.pricePerMonth() == 67.0) ;
    }


}
