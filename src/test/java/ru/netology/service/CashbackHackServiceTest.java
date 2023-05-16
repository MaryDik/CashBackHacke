package ru.netology.service;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void WhenBuying500Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);

    }
    @org.testng.annotations.Test
    public void WhenBuying1000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void WhenBuying1500Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void WhenBuying999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void WhenBuying1001Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual,expected);
    }
}
