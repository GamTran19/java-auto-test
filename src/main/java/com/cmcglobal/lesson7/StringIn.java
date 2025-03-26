package com.cmcglobal.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringIn {
  @Test
    public void tesString() throws InterruptedException {

        LoginPage loginPageGam = new LoginPage("ttgam1", "12345");
//        loginPageGam.doLogin();
      Assertions.assertEquals("ttgam", loginPageGam.doLogin().getUsername());

        LoginPage loginPageThanh = new LoginPage("nkthanh", "67890");
//        loginPageThanh.doLogin();
      Assertions.assertEquals("nkthanh", loginPageThanh.doLogin().getUsername());
    }
}
