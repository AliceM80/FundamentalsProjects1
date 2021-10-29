package com.dci.java.intro;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Provides necessary methods to deal through the Warehouse management actions
 *
 * @author riteshp
 */
public class TheWarehouseManager {
    // =====================================================================================
    // Member Variables
    // =====================================================================================

    // To read inputs from the console/CLI
    private final Scanner reader = new Scanner(System.in);
    private final String[] userOptions = {
            "1. List items by warehouse", "2. Search an item and place an order", "3. Quit"
    };


    // To refer the user provided name.
    private String userName;
    //private com.dci.java.intro.data.Repository repo = new com.dci.java.intro.data.Repository();

    // =====================================================================================
    // Public Member Methods
    // =====================================================================================

    /** Welcome User */
    public void welcomeUser() {
        this.seekUserName();

        this.greetUser();

    }

  /** Ask for user's choice of action */
  public int getUsersChoice() {

    System.out.println("Please enter your choice as number: " + this.userOptions);
    int userChoice = reader.nextInt();
    return userChoice;


    }

  /** Initiate an action based on given option */
  public void performAction(int option) {

    switch (option) {
      case 1:
        System.out.println("These are all our items: ");
        listItemsByWarehouse();
        break;
      case 2:
        System.out.println("Please enter the name of the item");
        String itemName = reader.nextLine();
        System.out.println("The available amount is: " + (getAvailableAmount(itemName)));
        break;
      case 3:
        System.out.println("Quit");
        quit();
      default:
        System.out.println("Work in progress");
          }
}
          /**
     * Confirm an action
     *
     * @return action
     */
    public boolean confirm (String message) {
return confirm(message);
    }

    /** End the application */
    public void quit() {
        System.out.printf("\nThank you for your visit, %s!\n", this.userName);
        System.exit(0);
    }

    // =====================================================================================
    // Private Methods
    // =====================================================================================

    /** Get user's name via CLI */
    private void seekUserName() {
        System.out.println("Please enter your name");
        this.userName = this.reader.nextLine();
    }

    /** Print a welcome message with the given user's name */
    private void greetUser() {
        System.out.println("Hello, "+this.userName+" nice to have you here");
        System.out.println(Arrays.toString(this.userOptions));
    }

    private void listItemsByWarehouse() {
        // TODO
    }

    private void listItems(String[] warehouse) {
        // TODO
    }

    private void searchItemAndPlaceOrder() {
        // TODO
    }

    /**
     * Ask the user to specify an Item to Order
     *
     * @return String itemName
     */
    private String askItemToOrder() {
    System.out.println("What is the name of the item?");
    return reader.nextLine();
    }

    /**
     * Calculate total availability of the given item
     *
     * @param itemName itemName
     * @return integer availableCount
     */
    private int getAvailableAmount(String itemName) {
        int availableCount = 0;
        int availableCount2 = 0;
        int result = 0;

        for(int i = 0; i<Repository.WAREHOUSE1.length; i++){
            if (Repository.WAREHOUSE1[i].equals(itemName)) result++;
          }
        return result;
    }

    /**
     * Find the count of an item in a given warehouse
     *
     * @param item the item
     * @param warehouse the warehouse
     * @return count
     */
    private int find(String item, String[] warehouse) {
int result1 = 0;
        return result1;

    }

    /** Ask order amount and confirm order */
    private void askAmountAndConfirmOrder(int availableAmount, String item) {
        // TODO
    }

    /**
     * Get amount of order
     *
     * @param availableAmount
     * @return
     */
    private int getOrderAmount(int availableAmount) {
        int result2 = 0;
        return result2;

    }
}
