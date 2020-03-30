package com.globant.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {

    public Logger log = Logger.getLogger(Example.class);

    @BeforeSuite(groups = {"createAccount", "cancelSubscription"})
    public void beforeSuite() {
        log.info ("Open Browser");
    }

    @BeforeClass
    public void beforeClass() {
        log.info ("Before Class");
    }

    @BeforeTest(groups = {"createAccount", "cancelSubscription"})
    public void beforeTest() {
        log.info ("Navigate to main page");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info ("Before Method");
    }

    @AfterSuite(groups = {"createAccount", "cancelSubscription"})
    public void afterSuite() {
            log.info ("Close Browser");
    }

    @AfterClass
    public void afterClass() {
        log.info ("After Class");
    }

    @AfterTest(groups = {"createAccount", "cancelSubscription"})
    public void afterTest() {
        log.info ("Click on Log Out");
    }

    @AfterMethod
    public void afterMethod() {
        log.info ("After Method");
    }

    @Test(groups = {"group1", "group2"})
    public void hello () {
        log.info("Hello");
    }

    @Test(groups = {"group1"})
    public void welcome () {
        log.info("Welcome");
    }

    @Test(groups = {"group1"})
    public void goodbye () {
        log.info("Goodbye");
    }

    @Test(groups = {"group2"})
    public void name () {
        log.info("Juan");
    }
}
