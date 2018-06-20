package com.service.servicecombgateway.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-20T15:30:51.880Z")

@RestSchema(schemaId = "servicecombgateway")
@RequestMapping(path = "/servicecomb-gateway", produces = MediaType.APPLICATION_JSON)
public class ServicecombgatewayImpl {

    @Autowired
    private ServicecombgatewayDelegate userServicecombgatewayDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServicecombgatewayDelegate.helloworld(name);
    }

}
