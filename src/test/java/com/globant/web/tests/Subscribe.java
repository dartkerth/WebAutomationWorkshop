package com.globant.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Subscribe {

    public Logger log = Logger.getLogger(Example.class);


    @Test(groups = {"createAccount"})
    public void createAccountTest(){
        accountCreate();
        logIn();
        logOut();
    }

    private void logIn(){
        log.info("Fill the logIn data");
        log.info("Click on LogIn");
    }

    private void logOut(){
        log.info("Click on LogOut button");
    }

    private void accountCreate(){
        log.info("Click on create account");
        log.info("Fill the mandatory data");
        log.info("Click to confirm the account creation");
        log.info("Confirm account e-mail");
    }

    @Test(groups = {"cancelSubscription"})
    public void cancelSubscriptionTest(){
        logIn();
        accountDeletion();
    }

    private void accountDeletion(){
        log.info("Searching through options");
        log.info("Click on delete account");
        log.info("Confirm account deletion");
    }
}
