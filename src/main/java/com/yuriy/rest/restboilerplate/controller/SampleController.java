package com.yuriy.rest.restboilerplate.controller;

import com.yuriy.rest.restboilerplate.model.SampleResponse;
import com.yuriy.rest.restboilerplate.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private SampleService service;

    @RequestMapping(method = RequestMethod.GET, path = {"/hello/{name}", "/hello"})
    public SampleResponse basicGet(@PathVariable(name = "name", required = false) String name){
        return service.compileGreeting(name);
    }
}
