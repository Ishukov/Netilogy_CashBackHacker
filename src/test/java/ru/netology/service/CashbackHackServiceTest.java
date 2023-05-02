package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @Test
    public void shouldCashBackServiceWithPurchase0(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(0);
        int actual = 1000;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void shouldCashBackServiceWithPurchase500(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(500);
        int actual = 500;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase999(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(999);
        int actual = 1;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase1000(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1000);
        int actual = 0;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase1001(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1001);
        int actual = 999;

        Assert.assertEquals(actual, expected);
    }
}