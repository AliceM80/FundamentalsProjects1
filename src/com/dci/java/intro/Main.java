package com.dci.java.intro;

public class Main {
 public static void main(String[] args) {
   //TheWarehouseApp app = new TheWarehouseApp();

   TheWarehouseManager manager = new TheWarehouseManager();

   manager.welcomeUser();
   manager.getUsersChoice();
   manager.performAction(manager.getUsersChoice());
   manager.confirm();
   manager.quit();





  }
}
