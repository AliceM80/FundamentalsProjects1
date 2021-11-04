package com.dci.java.intro;

/**
 *
 * @author riteshp
 */
public class TheWarehouseApp {
    /**
     * Execute the <i>TheWarehouseApp</i>
     *
     * @param args
     */
    public static void main(String[] args) {
        TheWarehouseManager theManager = new TheWarehouseManager();

        // Welcome User
        theManager.welcomeUser();

        // Get the user's choice of action and perform action
        do {
            int choise = theManager.getUsersChoice();
            theManager.performAction(choise);

            // confirm to do more
            if (!theManager.confirm("Do you want to make another action? (y/n)")) {
                theManager.quit();

            }

        } while (true);
    }
}

