package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Failed");
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Passed");
    }
}
