package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest5 {
    @Test
    public void shouldCashBackServiceWithPurchase0(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(0);
        int actual = 1000;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCashBackServiceWithPurchase500(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(500);
        int actual = 500;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase999(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(999);
        int actual = 1;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase1000(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1000);
        int actual = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void shouldCashBackServiceWithPurchase1001(){
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1001);
        int actual = 999;

        Assertions.assertEquals(actual, expected);
    }
}
