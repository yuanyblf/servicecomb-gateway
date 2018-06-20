package com.service.servicecombgateway.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServicecombgateway {

        ServicecombgatewayDelegate servicecombgatewayDelegate = new ServicecombgatewayDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = servicecombgatewayDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}