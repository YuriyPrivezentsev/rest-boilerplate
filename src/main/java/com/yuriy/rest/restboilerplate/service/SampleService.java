package com.yuriy.rest.restboilerplate.service;

import com.yuriy.rest.restboilerplate.model.SampleResponse;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SampleService {

    private static final String INTRO_STRING = "Hello ";

    public SampleResponse compileGreeting(String name){

        return new SampleResponse(INTRO_STRING + name);
    }
}
