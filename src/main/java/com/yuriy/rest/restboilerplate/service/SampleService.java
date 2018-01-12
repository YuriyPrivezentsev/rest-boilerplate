package com.yuriy.rest.restboilerplate.service;

import com.yuriy.rest.restboilerplate.model.SampleResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SampleService {

    private static final String INTRO_STRING = "Hello ";
    private static final String DEFAULT_RESPONSE = "Hello World";

    public SampleResponse compileGreeting(String name) {
        if(StringUtils.isEmpty(name)){
            return new SampleResponse(DEFAULT_RESPONSE);
        }
        return new SampleResponse(INTRO_STRING + name);
    }
}
